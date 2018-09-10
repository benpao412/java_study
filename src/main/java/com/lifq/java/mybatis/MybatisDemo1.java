package com.lifq.java.mybatis;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import com.lifq.java.mybatis.model.SalaryBillInfo;

public class MybatisDemo1 {

	public static void main(String[] args) throws IOException {
//		String resource = "D:\\workspace2017\\Study\\src\\main\\resources\\mybatis-config-demo.xml";
		String resource = "mybatis-config-demo.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
//		InputStream inputStream = new FileInputStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = sqlSessionFactory.openSession();
		try {
//		  SalaryBillInfo salaryBillinfo = (SalaryBillInfo) session.selectOne("findByPK", 803);
		  SalaryBillInfo salaryBillinfo = (SalaryBillInfo) session.selectOne("com.lifq.java.mybatis.dao.SalaryBillInfoDao.findResultMapByPK", 1);
		  System.out.println(salaryBillinfo.getTitle()+","+salaryBillinfo.getOwnerId()+","+salaryBillinfo.getFileId());
//		  SalaryBillInfo salaryBillinfo2 = (SalaryBillInfo) session.selectOne("com.lifq.java.mybatis.dao.SalaryBillInfoDao.findByPK", 1);
//		  Map<String,Object> salaryBillinfoMap = (Map<String, Object>) session.selectOne("com.lifq.java.mybatis.dao.SalaryBillInfoDao.findMapByPK", 1);
//		  System.out.println(salaryBillinfo2.getTitle());
//		  System.out.println("map查询结果："+salaryBillinfoMap.get("title"));
		} finally {
		  session.close();
		}
	}
	
	@Test
	public void testSecondCache() throws Exception {
		String resource = "mybatis-config-demo.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = sqlSessionFactory.openSession();
		try {
		  SalaryBillInfo salaryBillinfo = (SalaryBillInfo) session.selectOne("com.lifq.java.mybatis.dao.SalaryBillInfoDao.findResultMapByPK", 1);
		  System.out.println(salaryBillinfo.getTitle()+","+salaryBillinfo.getOwnerId()+","+salaryBillinfo.getFileId());
		} finally {
		  session.close();
		}
		
		SqlSession session1 = sqlSessionFactory.openSession();
		try {
		  SalaryBillInfo salaryBillinfo = (SalaryBillInfo) session1.selectOne("com.lifq.java.mybatis.dao.SalaryBillInfoDao.findResultMapByPK", 1);
		  System.out.println(salaryBillinfo.getTitle()+","+salaryBillinfo.getOwnerId()+","+salaryBillinfo.getFileId());
		} finally {
		  session.close();
		}
	}

}
