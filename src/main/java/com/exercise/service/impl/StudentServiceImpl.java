package com.exercise.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.exercise.mapper.StudentMapper;
import com.exercise.pojo.po.Student;
import com.exercise.service.IStudentService;

import util.DBUtil;

public class StudentServiceImpl implements IStudentService{

	SqlSessionFactory sqlSessionFactory=null;
	public StudentServiceImpl(){
		sqlSessionFactory = DBUtil.findSqlSession();
	}
	@Override
	public List<Student> selectByItem1(Student student) {
		SqlSession session = sqlSessionFactory.openSession();
		StudentMapper mapper = session.getMapper(StudentMapper.class);
		List<Student> list = mapper.selectByItem1(student);
		session.close();
		return list;
	}
	@Override
	public List<Student> selectByItem2(Student student) {
		SqlSession session = sqlSessionFactory.openSession();
		StudentMapper mapper = session.getMapper(StudentMapper.class);
		List<Student> list = mapper.selectByItem2(student);
		session.close();
		return list;
	}
	@Override
	public List<Student> selectByItem3(Student student) {
		SqlSession session = sqlSessionFactory.openSession();
		StudentMapper mapper = session.getMapper(StudentMapper.class);
		List<Student> list = mapper.selectByItem3(student);
		session.close();
		return list;
	}
	@Override
	public List<Student> selectByItem4(Student student) {
		SqlSession session = sqlSessionFactory.openSession();
		StudentMapper mapper = session.getMapper(StudentMapper.class);
		List<Student> list = mapper.selectByItem4(student);
		session.close();
		return list;
	}
	@Override
	public void updateStudent1(Student student) {
		SqlSession session = sqlSessionFactory.openSession();
		StudentMapper mapper = session.getMapper(StudentMapper.class);
		try {
			mapper.updateStudent1(student);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		}finally {
			session.close();
		}
	}
	@Override
	public void updateStudent2(Student student) {
		SqlSession session = sqlSessionFactory.openSession();
		StudentMapper mapper = session.getMapper(StudentMapper.class);
		try {
			mapper.updateStudent2(student);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		}finally {
			session.close();
		}
	}
	@Override
	public List<Student> selectByArray1(Integer[] ids) {
		SqlSession session = sqlSessionFactory.openSession();
		StudentMapper mapper = session.getMapper(StudentMapper.class);
		List<Student> list = mapper.selectByArray1(ids);
		return list;
	}
	@Override
	public List<Student> selectByArray2(Student student) {
		SqlSession session = sqlSessionFactory.openSession();
		StudentMapper mapper = session.getMapper(StudentMapper.class);
		List<Student> list = mapper.selectByArray2(student);
		return list;
	}
}
