package test;

import java.io.IOException;
import java.io.InputStream;

import model.Customer;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class TestFirstMybatis {
	
	public static void main(String[] args) {
		
		testUpdate();
	}
	
	private static void testAdd(){
		try {
			// 1. 创建配置文件（mybatis-config.xml）的输入流
			InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
			// 2. 创建SQLSessionFactory
			SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
			// 3. 创建SQLSession
			SqlSession session = factory.openSession();
			// 4. 调用mapper文件插入数据(调用之前需要将mapper文件加入到mybatis-config.xml中)
			Customer customer = new Customer();
			customer.setName("Sailing");
			customer.setDescription("这是个SUPER VIP客户");
			customer.setCountry("China");
			session.insert("model.Customer.add", customer);
			session.commit();
			session.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void testUpdate(){
		try {
			// 1. 创建配置文件（mybatis-config.xml）的输入流
			InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
			// 2. 创建SQLSessionFactory
			SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
			// 3. 创建SQLSession
			SqlSession session = factory.openSession();
			// 4. 调用mapper文件插入数据(调用之前需要将mapper文件加入到mybatis-config.xml中)
			Customer customer = new Customer();
			customer.setName("Sailing");
			customer.setDescription("这是个VIP客户~~");
			customer.setCountry("中国");
			customer.setId(9752);
			session.update("model.Customer.update", customer);
			session.commit();
			session.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void testDelete(){
		try {
			// 1. 创建配置文件（mybatis-config.xml）的输入流
			InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
			// 2. 创建SQLSessionFactory
			SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
			// 3. 创建SQLSession
			SqlSession session = factory.openSession();
			// 4. 调用mapper文件插入数据(调用之前需要将mapper文件加入到mybatis-config.xml中)
			Customer customer = new Customer();
			customer.setName("Sailing");
			customer.setDescription("这是个VIP客户~~");
			customer.setCountry("中国");
			customer.setId(9752);
			session.update("model.Customer.update", customer);
			session.commit();
			session.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
