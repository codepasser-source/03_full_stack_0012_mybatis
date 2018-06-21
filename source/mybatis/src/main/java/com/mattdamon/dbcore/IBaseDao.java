package com.mattdamon.dbcore;

import java.util.List;
import java.util.Map;

public interface IBaseDao<T> {

	/**
	 * 查询单个数据
	 * 
	 * @param queryString
	 * @param object
	 * @return
	 */
	public T selectOne(String statement, T base);

	/**
	 * 单表插入记录
	 * 
	 * @param statement
	 * @param obj
	 * @return
	 */
	public int insert(String statement, T base);

	/**
	 * 更新单表
	 * 
	 * @param obj
	 */
	public int update(String statement, T base);

	/**
	 * 删除记录
	 * 
	 * @param clz
	 * @param id
	 */
	public int delete(String statement, T base);

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
	public List<T> query(String statement, Map<String, Object> params);

}
