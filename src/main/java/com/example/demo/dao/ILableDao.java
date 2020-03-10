package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.Lable;

@Repository
public interface ILableDao extends BaseMapper<Lable>{

	@Select("select * from xzm_lable")
	public List<Lable> queryLable();
}
