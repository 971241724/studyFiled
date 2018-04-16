package com.b2c.service;

import java.util.List;

import com.b2c.entity.Book;
import com.b2c.entity.BookType;
import com.b2c.utils.PageBean;

public interface IBookService {
	/**
	 * ���³�����鼮
	 * @return
	 */
	public List<Book> selectBookNewTime();
	/**
	 * ������ߵ��鼮
	 * @return
	 */
	public List<Book> selectBookNumbMax();
	/**
	 * ��ȡ�������ϸ��Ϣ
	 * @param book_id
	 * @return
	 */
	public Book getBook_id(String book_id);
	/**
	 * ��ѯ����������ͬ���鼮
	 */
	public List<Book> selectLikeBook(Book book);
	/**
     * ��ѯͼ�����͵�����ͼ��+��ҳ
     * @return
     */
	public PageBean<Book> selectBookType(String book_type,Integer pc,Integer ps);
	/**
	 * �����鼮
	 * @return
	 */
	public Book findBook(String book_name);
	/**
	 * �����鼮
	 * @return
	 */
	public PageBean<Book> findBookList(String book_name,Integer pc,Integer ps);
	/**
	 * ͼ�����Ա��ѯͼ��
	 * @return
	 */
	public PageBean<Book> adminSelectBook(Integer pc,Integer ps);
	/**
	 * ����Աɾ��ͼ��
	 * @param book_id
	 * @return
	 */
	public boolean deleteBook(Integer book_id);
	/**
	 * ����Ա�޸�ͼ��
	 */
	public boolean bookAlter(Book book);
	/**
	 * ����Ա�޸�ͼ��ͼƬ
	 */
	public boolean updateBookImage(String book_id,String url);
	/**
	 * ����Ա����ͼ��
	 * @return
	 */
	public boolean adminAddBook(Book book);
	/**
	 * ����Ա����ͼ��ͼƬ
	 */
	public boolean addBookImage(String book_id,String url);
}