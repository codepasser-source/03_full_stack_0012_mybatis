package com.mattdamon.dbcore.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mattdamon.dbcore.IBaseDao;
import com.mattdamon.pojo.Ship;

@Repository
public class ShipDao implements IBaseDao<Ship> {

	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public Ship selectOne(String statement, Ship base) {
		return sqlSession.selectOne(statement, base);
	}

	@Override
	public int insert(String statement, Ship base) {
		return sqlSession.insert(statement, base);
	}

	@Override
	public int update(String statement, Ship base) {
		return sqlSession.update(statement, base);
	}

	@Override
	public int delete(String statement, Ship base) {
		return sqlSession.delete(statement, base);
	}

	@Override
	public List<Ship> query(String statement, Map<String, Object> params) {
		return sqlSession.selectList(statement, params);
	}

}
