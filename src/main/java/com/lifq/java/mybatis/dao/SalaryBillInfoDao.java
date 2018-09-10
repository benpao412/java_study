package com.lifq.java.mybatis.dao;

import java.util.Map;

import com.lifq.java.mybatis.model.SalaryBillInfo;

public interface SalaryBillInfoDao {
	
//	@Select("SELECT * FROM SALARY_BILL_INFO WHERE id = #{id}")
	public SalaryBillInfo findByPK1(SalaryBillInfo obj);
	
	
	public Map<String,Object> findMapByPK(SalaryBillInfo obj);
	
	public Map<String,Object> findResultMapByPK(SalaryBillInfo obj);
	
	
	

}
