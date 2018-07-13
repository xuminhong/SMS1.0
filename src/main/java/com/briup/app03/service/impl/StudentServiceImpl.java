package com.briup.app03.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app03.bean.Student;
import com.briup.app03.dao.StudentMapper;
import com.briup.app03.service.IStudentService;
@Service
public class StudentServiceImpl implements IStudentService {
	
	@Autowired
	private StudentMapper  studentmapper;
	
	
	@Override
	public List<Student> findAll() throws Exception {
		//通过studentmapper查询所有学生
		List<Student> list = studentmapper.findAll();
		
		return list;
	}


	@Override
	public Student findById(long id) throws Exception {
		return studentmapper.findById(id);
	}
	
	

}
