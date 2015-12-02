package com.zhaochao.service;

import java.util.List;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;
import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;
import com.zhaochao.bean.User;
import com.zhaochao.mapper.UserMapper;


@Service("userService")

public class UserService extends BaseService<User> {
	private final static Logger log = Logger.getLogger(UserService.class);

	@Autowired
	private UserMapper<User> mapper;

	public UserMapper<User> getMapper() {
		return mapper;
	}


}
