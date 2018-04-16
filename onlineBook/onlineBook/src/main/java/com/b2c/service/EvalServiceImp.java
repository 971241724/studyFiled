package com.b2c.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.b2c.dao.IEvalDao;
import com.b2c.entity.Eval;
import com.b2c.utils.PageBean;

/**
 * ��ͼ�����۵�ʵ����
 * @author Administrator
 */
@Component(value="evalServiceImp")
public class EvalServiceImp implements IEvalService{
    
	@Resource(name="evalDaoImp")
	private IEvalDao evalDaoImp;
	 /**
     * ͨ���û�Id��ѯ����
     * @param user_id
     * @param pc
     * @param ps
     * @return
     */
	public PageBean<Eval> selectEvalgetUserID(Integer user_id, Integer pc,Integer ps) {
		return evalDaoImp.selectEvalgetUserID(user_id, pc, ps);
	}
	/**
	 * ɾ��ͼ�������
	 * @param eval_id
	 * @return
	 */
	public boolean deleteEvalId(Integer eval_id) {
		return evalDaoImp.deleteEvalId(eval_id);
	}
	
	/**
	 * ͨ��ͼ���Id��ѯ����
	 * @return
	 */
	public PageBean<Eval> selectEvalgetBookId(Integer book_id,Integer pc,Integer ps){
		return evalDaoImp.selectEvalgetBookId(book_id, pc, ps);
	}
	/**
	 * ����Ա��ѯ�����������
	 * @return
	 */
	public PageBean<Eval> adminSelectEval(Integer pc,Integer ps,Integer book_id){
		return evalDaoImp.adminSelectEval(pc, ps,book_id);
	}
	/**
	 * �û���������
	 */
	public boolean addEval(Integer user_id, Integer book_id,String eval_content, Double eval_score) {
		return evalDaoImp.addEval(user_id,book_id,eval_content,eval_score);
	}
}