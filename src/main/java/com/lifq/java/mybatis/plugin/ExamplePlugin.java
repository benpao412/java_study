package com.lifq.java.mybatis.plugin;


import java.util.Properties;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;

@Intercepts(@Signature(type=Executor.class,method="update", args = {MappedStatement.class,Object.class}))
public class ExamplePlugin implements Interceptor {

	@Override
	public Object intercept(Invocation invocation) throws Throwable {
		System.out.println("begin拦截！1");
		return invocation.proceed();
	}

	@Override
	public Object plugin(Object target) {
		System.out.println("begin拦截！2");
		return Plugin.wrap(target, this);
	}

	@Override
	public void setProperties(Properties properties) {
		System.out.println("begin拦截！3");
	}
	
	

}