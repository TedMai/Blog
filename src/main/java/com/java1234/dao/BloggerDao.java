package com.java1234.dao;

import com.java1234.entity.Blogger;

/**
 * ����Dao�ӿ�
 * @author Administrator
 *
 */
public interface BloggerDao {

	/**
	 * ͨ���û�����ѯ�û�
	 * @param userName
	 * @return
	 */
	public Blogger getByUserName(String userName);
	
	/**
	 * ��ѯ������Ϣ
	 * @return
	 */
	public Blogger find();
	
	/**
	 * ���²�����Ϣ
	 * @param blogger
	 * @return
	 */
	public Integer update(Blogger blogger);
}