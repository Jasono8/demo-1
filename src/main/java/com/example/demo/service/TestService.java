package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ILableDao;
import com.example.demo.entity.Lable;

@Service
public class TestService {

	@Autowired
	private ILableDao lableDao;
	
	public List<Lable> queryList(){
		return lableDao.queryLable();
	}
}
