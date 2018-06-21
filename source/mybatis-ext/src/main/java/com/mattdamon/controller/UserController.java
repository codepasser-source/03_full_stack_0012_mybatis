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
import com.mattdamon.pojo.User;

@Controller
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	private IBaseService<User> userService;

	@RequestMapping(value = "/view.action", method = RequestMethod.GET)
	public ModelAndView view() {
		User base = new User();
		base.setId(1);
		base = userService.selectOne(base);
		return new ModelAndView("/result.jsp");
	}

	@RequestMapping(value = "/select.do", method = RequestMethod.GET)
	@ResponseBody
	public User select() {
		User base = new User();
		base.setId(1);
		base = userService.selectOne(base);
		return base;
	}

	@RequestMapping(value = "/insert.do", method = RequestMethod.GET)
	@ResponseBody
	public int insert() {
		User base = new User();
		base.setPassword("password");
		base.setUsername("username");
		base.setShipid(1);
		int result = userService.insert(base);
		return result;
	}

	@RequestMapping(value = "/update.do", method = RequestMethod.GET)
	@ResponseBody
	public int update() {
		User base = new User();
		base.setId(1);
		base.setPassword("password1");
		base.setUsername("username1");
		base.setShipid(2);
		int result = userService.update(base);
		return result;
	}

	@RequestMapping(value = "/delete.do", method = RequestMethod.GET)
	@ResponseBody
	public int delete() {
		User base = new User();
		base.setId(1);
		int result = userService.delete(base);
		return result;
	}

	@RequestMapping(value = "/query.do", method = RequestMethod.GET)
	@ResponseBody
	public List<User> query() {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("username", "username");
		List<User> users = userService.query(params);
		return users;
	}

}
