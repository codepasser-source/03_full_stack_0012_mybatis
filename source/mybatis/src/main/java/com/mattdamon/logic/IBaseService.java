package com.mattdamon.logic;

import java.util.List;
import java.util.Map;

public interface IBaseService<T> {

	/**
	 * 查询单个数据
	 * 
	 * @param queryString
	 * @param object
	 * @return
	 */
	public T selectOne(T base);

	/**
	 * 单表插入记录
	 * 
	 * @param statement
	 * @param obj
	 * @return
	 */
	public int insert(T base);

	/**
	 * 更新单表
	 * 
	 * @param obj
	 */
	public int update(T base);

	/**
	 * 删除记录
	 * 
	 * @param clz
	 * @param id
	 */
	public int delete(T base);

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
	public List<T> query(Map<String, Object> params);

}
