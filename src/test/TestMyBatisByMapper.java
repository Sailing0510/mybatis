package test;

import static org.junit.Assert.*;

import java.util.List;

import mapper.CustomerMapper;
import model.Customer;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import util.MyBatisUtil;

public class TestMyBatisByMapper {

	@Test
	public void testAdd() {
		SqlSession session = null;
		try{
			session = MyBatisUtil.createSession();
			Customer customer = new Customer();
			customer.setName("猪八戒");
			customer.setDescription("天蓬元帅");
			customer.setCountry("中国");
			session.getMapper(CustomerMapper.class).add(customer);
			session.commit();
		}catch(Exception e){
			e.printStackTrace();
			session.rollback();
		}finally{
			MyBatisUtil.closeSession(session);
		}
	}
	
	@Test
	public void testList() {
		SqlSession session = null;
		try{
			session = MyBatisUtil.createSession();
			List<Customer> us = session.getMapper(CustomerMapper.class).list();
			System.out.println(us.size());
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			MyBatisUtil.closeSession(session);
		}
	}

}
