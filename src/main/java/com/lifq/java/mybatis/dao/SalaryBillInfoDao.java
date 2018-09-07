package com.lifq.java.mybatis.dao;

import com.lifq.java.mybatis.model.SalaryBillInfo;

public interface SalaryBillInfoDao {
	
//	@Select("SELECT * FROM SALARY_BILL_INFO WHERE id = #{id}")
	public SalaryBillInfo findByPK1(SalaryBillInfo obj);

}
