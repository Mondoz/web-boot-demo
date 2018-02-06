package com.lee.service;

import com.lee.dao.Dao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lcx on 2018/2/6 12:41.
 */
@Service
public class Business {
	private Logger logger = LogManager.getLogger(this.getClass());

	@Autowired
	private Dao dao;

	public String calculateSomething(){
		String value = dao.retrieveSomething();
		logger.info("In Business - {}");
		return value;
	}
}
