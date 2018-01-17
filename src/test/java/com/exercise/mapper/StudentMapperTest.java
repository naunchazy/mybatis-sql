package com.exercise.mapper;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.exercise.pojo.po.Student;
import com.exercise.service.IStudentService;
import com.exercise.service.impl.StudentServiceImpl;
import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;

public class StudentMapperTest {

	IStudentService studentService;
	@Before
	public void init(){
		studentService=new StudentServiceImpl();
	}
	@Test
	public void selectByItem1(){
		Student student=new Student();
		student.setName("j");
		student.setAlias("�û�");
		List<Student> list = studentService.selectByItem1(student);
		for (Student stu : list) {
			System.out.println(stu.getId()+","+stu.getName());
		}
	}
	/* ע�⣺ʹ��likeʱ�����ǲ��õ�Ԥ���뷽ʽ�������������ֱ�Ӵ���ġ���������Ŀ����Ҫ�ӹ���������ֹsqlע��
	 * �����	DEBUG [main] - ==>  Preparing: select * from student where 1=1 and name like '%j%' and alias like '%�û�%' 
			DEBUG [main] - ==> Parameters: 
			DEBUG [main] - <==      Total: 4
		4,jack
		5,jim
		7,Jenny
		14,js*/
	@Test
	public void selectByItem2(){
		Student student=new Student();
		student.setId(4);
		student.setName("jack");
		List<Student> list = studentService.selectByItem2(student);
		for (Student stu : list) {
			System.out.println(stu.getId()+","+stu.getName());
		}
	}
	/*�����	DEBUG [main] - ==>  Preparing: select * from student WHERE id=? and name = ? 
			DEBUG [main] - ==> Parameters: 4(Integer), jack(String)
			DEBUG [main] - <==      Total: 1
		4,jack*/
	@Test
	public void selectByItem3(){
		Student student=new Student();
		student.setName("jack");
		student.setAlias("vip�û�");
		List<Student> list = studentService.selectByItem3(student);
		for (Student stu : list) {
			System.out.println(stu.getId()+","+stu.getName());
		}
	}
	@Test
	public void selectByItem4(){
		Student student=new Student();
		student.setName("jack");
		student.setAlias("vip�û�");
		List<Student> list = studentService.selectByItem4(student);
		for (Student stu : list) {
			System.out.println(stu.getId()+","+stu.getName());
		}
	}
	@Test
	public void updateStudent1(){
		Student student=new Student();
		student.setId(14);
		student.setName("jj");
		student.setAlias("vip�û�");
		studentService.updateStudent1(student);
	}
	@Test
	public void updateStudent2(){
		Student student=new Student();
		student.setId(14);
		student.setName("js");
		student.setAlias("�û�");
		studentService.updateStudent2(student);
	}
	@Test
	public void selectByArray1(){
		Integer[] ids={1,11,12};
		List<Student> list = studentService.selectByArray1(ids);
		for (Student stu : list) {
			System.out.println(stu.getId()+","+stu.getName());
		}
	}
	@Test
	public void selectByArray2(){
		Integer[] ids={10,11,12};
		Student student=new Student();
		student.setIds(ids);
		List<Student> list = studentService.selectByArray2(student);
		for (Student stu : list) {
			System.out.println(stu.getId()+","+stu.getName());
		}
	}
}
