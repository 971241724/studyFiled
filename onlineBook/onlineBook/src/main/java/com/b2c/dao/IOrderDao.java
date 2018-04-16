package com.b2c.dao;

import java.util.List;

import com.b2c.entity.Order;
import com.b2c.entity.OrderBooks;
import com.b2c.utils.PageBean;

public interface IOrderDao {
	/**
	 * ���ӵ�������
	 * @param order
	 * @return
	 */
	public int addMyOrder(List<String> lists, Integer user_id);
	/**
	 * ɾ����������Ϣ
	 * @param Order_id
	 * @return
	 */
	public boolean deleteOrder(Integer Order_id);
	/**
	 * �ύ����
	 * @param Order_id
	 * @return
	 */
	public boolean submitOrder(List<Integer> list,Integer Order_id);
	/**
	 * ��ѯ������Ϣ
	 * @param order_id
	 * @return
	 */
	public List<Order> selectSaleBook(Integer order_id);
	
	/**
	 * �û���ѯ���ж�����Ϣ
	 * @param user_id
	 * @return
	 * @author �߻�
	 */
	public PageBean userSelectAllOrder(Integer user_id,Integer pc,Integer ps);
	/**
	 * ɾ��������Ϣ
	 * @param order_id
	 * @return
	 * @author �߻�
	 */
	public boolean deleteOrderMessage(Integer order_id);
	/**
	 * �޸�����״̬
	 * @param order_id
	 * @return
	 * @author �߻�
	 */
	public boolean alterOrderAccess(Integer order_id);
	/**
	 * ����֧��
	 * @author �߻�
	 */
	public boolean alipayOrder(Integer order_id);
	
	/**
	 * ����Ա��ѯδ��������
	 * @param pc
	 * @param ps
	 * @return
	 */
	public PageBean<Order> findUnDealOrder(Integer pc,Integer ps);
	/**
	 * ����Ա��������
	 * @param order_id
	 * @return
	 */
	public boolean adminAddOrder(Integer order_id);
	/**
	 * ����Ա��ѯ�Ѵ�������
	 * @param pc
	 * @param ps
	 * @return
	 */
	public PageBean<Order> findDealedOrder(Integer pc,Integer ps);
}