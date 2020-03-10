package com.example.demo.controller;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Lable;
import com.example.demo.service.TestService;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;

@RestController
public class TestController {

	@Autowired
	private TestService testService;

	@RequestMapping("/")
	public String print() {
		return "hello world";
	}

	@RequestMapping("/queryLable")
	public void queryLable(HttpServletResponse response) {

		String fileName = "个人信息";
		List<Lable> lable = testService.queryList();
		Workbook workbook = ExcelExportUtil.exportExcel(new ExportParams("用户信息", "lable"), Lable.class, lable);
		doExport(fileName,response,workbook);
	}

	private static void doExport(String fileName, HttpServletResponse response, Workbook workbook) {
		try {
			response.setCharacterEncoding("UTF-8");
			response.setHeader("content-Type", "application/vnd.ms-excel");
			response.setHeader("Content-Disposition",
					"attachment;filename=" + URLEncoder.encode(fileName, "UTF-8") + ".xls");
			workbook.write(response.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
