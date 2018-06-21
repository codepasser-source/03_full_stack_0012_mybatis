package com.mattdamon.dbcore.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mattdamon.dbcore.IBaseDao;
import com.mattdamon.pojo.User;

@Repository
public class UserDao implements IBaseDao<User> {

	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public User selectOne(String statement, User base) {
		return sqlSession.selectOne(statement, base);
	}

	@Override
	public int insert(String statement, User base) {
		return sqlSession.insert(statement, base);
	}

	@Override
	public int update(String statement, User base) {
		return sqlSession.update(statement, base);
	}

	@Override
	public int delete(String statement, User base) {
		return sqlSession.delete(statement, base);
	}

	@Override
	public List<User> query(String statement, Map<String, Object> params) {
		return sqlSession.selectList(statement, params);
	}

}
