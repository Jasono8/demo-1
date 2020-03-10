package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import cn.afterturn.easypoi.excel.annotation.Excel;

@TableName("xzm_lable")
public class Lable implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@TableId(type = IdType.AUTO)
	private Integer id;
	
	@Excel(name = "名字")
	private String name;
	
	@Excel(name = "创建日期",databaseFormat = "yyyyMMdd", format = "yyyy-MM-dd")
	private Date createTime;
	
	@Excel(name = "访问数")
	private Integer visitCount;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getVisitCount() {
		return visitCount;
	}

	public void setVisitCount(Integer visitCount) {
		this.visitCount = visitCount;
	}
	
}
