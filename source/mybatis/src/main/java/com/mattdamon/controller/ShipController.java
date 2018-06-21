package com.mattdamon.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.mattdamon.logic.IBaseService;
import com.mattdamon.pojo.Ship;

@Controller
@RequestMapping(value = "/ship")
public class ShipController {

	@Autowired
	private IBaseService<Ship> shipService;

	@RequestMapping(value = "/view.action", method = RequestMethod.GET)
	public ModelAndView view() {
		Ship base = new Ship();
		base.setId(1);
		base = shipService.selectOne(base);
		return new ModelAndView("/result.jsp");
	}

	@RequestMapping(value = "/select.do", method = RequestMethod.GET)
	@ResponseBody
	public Ship select() {
		Ship base = new Ship();
		base.setId(1);
		base = shipService.selectOne(base);
		return base;
	}

	@RequestMapping(value = "/insert.do", method = RequestMethod.GET)
	@ResponseBody
	public int insert() {
		Ship base = new Ship();
		base.setGroupname("groupname");
		int result = shipService.insert(base);
		return result;
	}

	@RequestMapping(value = "/update.do", method = RequestMethod.GET)
	@ResponseBody
	public int update() {
		Ship base = new Ship();
		base.setId(1);
		base.setGroupname("groupname1");
		int result = shipService.update(base);
		return result;
	}

	@RequestMapping(value = "/delete.do", method = RequestMethod.GET)
	@ResponseBody
	public int delete() {
		Ship base = new Ship();
		base.setId(1);
		int result = shipService.delete(base);
		return result;
	}

	@RequestMapping(value = "/query.do", method = RequestMethod.GET)
	@ResponseBody
	public List<Ship> query() {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("id", 1);
		List<Ship> users = shipService.query(params);
		return users;
	}
}
