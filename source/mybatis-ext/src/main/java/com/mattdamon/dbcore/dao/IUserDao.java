package com.mattdamon.dbcore.dao;

import java.util.List;
import java.util.Map;

import com.mattdamon.dbcore.annotation.DataSource;
import com.mattdamon.pojo.User;

public interface IUserDao {

	@DataSource("master")
	public int insert(String statement, User base);

	@DataSource("master")
	public int update(String statement, User base);

	@DataSource("master")
	public int delete(String statement, User base);

	@DataSource("slave")
	public User selectOne(String statement, User base);

	@DataSource("slave")
	public List<User> query(String statement, Map<String, Object> params);
}