package com.b2c.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.b2c.dao.IOrderBooksDao;
import com.b2c.entity.Order;
import com.b2c.entity.OrderBooks;

@Component(value="orderBooksServiceImp")
public class OrderBooksServiceImp implements IOrderBooksService{
	
	@Resource(name="orderBooksDaoImp")
	private IOrderBooksDao orderBooksDaoImp;
	/**
	 * ���ӵ������
	 */
	public int addOrderBooks(List<String> lists,Integer user_id){
		return orderBooksDaoImp.addOrderBooks(lists,user_id);
	}
	/**
	 * ��ȡ���ﳵ��Ϣ
	 */
	public List<OrderBooks> selectCart_id(Integer order_id) {
		return orderBooksDaoImp.selectCart_id(order_id);
	}
}