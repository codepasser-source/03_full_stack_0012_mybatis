package com.mattdamon.dbcore.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mattdamon.dbcore.annotation.DataSource;
import com.mattdamon.pojo.User;

@Repository
public class UserDao implements IUserDao {

	@Autowired
	private SqlSessionTemplate sqlSession;

	@DataSource("master")
	public int insert(String statement, User base) {
		return sqlSession.insert(statement, base);
	}

	@DataSource("master")
	public int update(String statement, User base) {
		return sqlSession.update(statement, base);
	}

	@DataSource("master")
	public int delete(String statement, User base) {
		return sqlSession.delete(statement, base);
	}

	@DataSource("slave")
	public User selectOne(String statement, User base) {
		return sqlSession.selectOne(statement, base);
	}

	@DataSource("slave")
	public List<User> query(String statement, Map<String, Object> params) {
		return sqlSession.selectList(statement, params);
	}

}
