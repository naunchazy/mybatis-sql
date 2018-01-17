package com.exercise.service;

import java.util.List;

import com.exercise.pojo.po.Student;

public interface IStudentService {

	List<Student> selectByItem1(Student student);
	List<Student> selectByItem2(Student student);
	List<Student> selectByItem3(Student student);
	List<Student> selectByItem4(Student student);
	void updateStudent1(Student student);
	void updateStudent2(Student student);
	List<Student> selectByArray1(Integer[] ids);
	List<Student> selectByArray2(Student student);
}
