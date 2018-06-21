package com.mattdamon.logic.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mattdamon.dbcore.IBaseDao;
import com.mattdamon.logic.IBaseService;
import com.mattdamon.pojo.Ship;

@Service
public class ShipService implements IBaseService<Ship> {

	@Autowired
	private IBaseDao<Ship> shipDao;

	@Override
	public Ship selectOne(Ship base) {
		return shipDao.selectOne("com.mattdamon.pojo.Ship.selectOne", base);
	}

	@Override
	@Transactional
	public int insert(Ship base) {
		return shipDao.insert("com.mattdamon.pojo.Ship.insert", base);
	}

	@Override
	@Transactional
	public int update(Ship base) {
		return shipDao.update("com.mattdamon.pojo.Ship.update", base);
	}

	@Override
	@Transactional
	public int delete(Ship base) {
		return shipDao.delete("com.mattdamon.pojo.Ship.delete", base);
	}

	@Override
	public List<Ship> query(Map<String, Object> params) {
		return shipDao.query("com.mattdamon.pojo.Ship.query", params);
	}

}
