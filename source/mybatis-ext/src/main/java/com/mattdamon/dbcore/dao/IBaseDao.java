package com.mattdamon.dbcore.dao;

import java.util.List;
import java.util.Map;

import com.mattdamon.dbcore.annotation.DataSource;

public interface IBaseDao<T> {

	/**
	 * 单表插入记录
	 * 
	 * @param statement
	 * @param obj
	 * @return
	 */
	@DataSource("master")
	public int insert(String statement, T base);

	/**
	 * 更新单表
	 * 
	 * @param obj
	 */
	@DataSource("master")
	public int update(String statement, T base);

	/**
	 * 删除记录
	 * 
	 * @param clz
	 * @param id
	 */
	@DataSource("master")
	public int delete(String statement, T base);

	/**
	 * 查询单个数据
	 * 
	 * @param queryString
	 * @param object
	 * @return
	 */
	@DataSource("slave")
	public T selectOne(String statement, T base);

	/**
	 *
	 * 返回查询一览表的信息
	 * 
	 * @param <T>
	 * @param _mybitsId
	 *            mybatis中对应业务标识
	 * @param _params
	 * @return
	 */
	@DataSource("slave")
	public List<T> query(String statement, Map<String, Object> params);

}
