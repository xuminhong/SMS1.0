package com.briup.app03.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app03.bean.Student;
import com.briup.app03.service.IStudentService;

@RestController
@RequestMapping("/student")

public class StudnetController {
	
	//注入studentService的实例
	@Autowired
	private IStudentService studentService;
	
	//http://127.0.0.1:8080/studnet/findAllStudent
	@GetMapping("/findAllStudent")
	public List<Student> findAllStudent(){
		
		
		try {
			List<Student> list = studentService.findAll();
			return list;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}

	
	@GetMapping("findStudentById")
	public Student findStudentById(long id){
		try {
			Student student = studentService.findById(id);
			return student;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
