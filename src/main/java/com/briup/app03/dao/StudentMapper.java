package com.briup.app03.dao;

import java.util.List;

import com.briup.app03.bean.Student;

public interface StudentMapper {
	//查询学生信息
	List<Student> findAll();
	//通过id查询学生信息
	Student findById(long id);
	
}
