package com.lifq.java.mybatis.dao;

import com.lifq.java.mybatis.model.SalaryBillInfo;

public interface SalaryBillInfoDaoTest {
	
//	@Select("SELECT * FROM SALARY_BILL_INFO WHERE id = #{id}")
	SalaryBillInfo findByPK1(SalaryBillInfo obj);

}
