package com.mattdamon.logic.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mattdamon.dbcore.IBaseDao;
import com.mattdamon.logic.IBaseService;
import com.mattdamon.pojo.User;

@Service
public class UserService implements IBaseService<User> {

	@Autowired
	private IBaseDao<User> userDao;

	@Override
	public User selectOne(User base) {
		return userDao.selectOne("com.mattdamon.pojo.User.selectOne", base);
	}

	@Override
	@Transactional
	public int insert(User base) {
		return userDao.insert("com.mattdamon.pojo.User.insert", base);
	}

	@Override
	@Transactional
	public int update(User base) {
		return userDao.update("com.mattdamon.pojo.User.update", base);
	}

	@Override
	@Transactional
	public int delete(User base) {
		return userDao.delete("com.mattdamon.pojo.User.delete", base);
	}

	@Override
	public List<User> query(Map<String, Object> params) {
		return userDao.query("com.mattdamon.pojo.User.query", params);
	}

}
