package test;

import java.io.IOException;
import java.io.InputStream;

import model.Customer;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import util.MyBatisUtil;


public class TestMyBatis {

	@Test
	public void testDelete(){
		try {
			// 1. 创建配置文件（mybatis-config.xml）的输入流
			InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
			// 2. 创建SQLSessionFactory
			SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
			// 3. 创建SQLSession
			SqlSession session = factory.openSession();
			// 4. 调用mapper文件插入数据(调用之前需要将mapper文件加入到mybatis-config.xml中)
			session.delete(Customer.class.getName() + ".delete", 9752);
			session.commit();
			session.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testAdd(){
		SqlSession session = null;
		try{
			session = MyBatisUtil.createSession();
			Customer customer = new Customer();
			customer.setName("孙悟空1");
			customer.setDescription("齐天大圣");
			customer.setCountry("中国");
			session.insert(Customer.class.getName() + ".add", customer);
			session.commit();
		}catch(Exception e){
			e.printStackTrace();
			session.rollback();
		}finally{
			MyBatisUtil.closeSession(session);
		}
	}
	
	@Test
	public void testLoad(){
		SqlSession session = null;
		try{
			session = MyBatisUtil.createSession();
			Customer customer = session.selectOne(Customer.class.getName() + ".load", 1);
			System.out.println(customer.getName());
		}finally{
			MyBatisUtil.closeSession(session);
		}
	}

}
