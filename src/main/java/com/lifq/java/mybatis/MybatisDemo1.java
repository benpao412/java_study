package com.lifq.java.mybatis;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.lifq.java.mybatis.model.SalaryBillInfo;

public class MybatisDemo1 {

	public static void main(String[] args) throws IOException {
		String resource = "D:\\workspace2017\\Study\\src\\main\\resources\\mybatis-config-demo1.xml";
//		InputStream inputStream = Resources.getResourceAsStream(resource);
		InputStream inputStream = new FileInputStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = sqlSessionFactory.openSession();
		try {
		  SalaryBillInfo salaryBillinfo = (SalaryBillInfo) session.selectOne("com.xfs.salary.dao.SalaryBillInfoDao.findByPK", 803);
		  System.out.println(salaryBillinfo.getTitle());
		} finally {
		  session.close();
		}

	}

}
