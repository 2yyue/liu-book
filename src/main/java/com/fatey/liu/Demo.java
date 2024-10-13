package com.fatey.liu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Liu Fatey
 * @description 类描述
 * @created 2024/10/13 下午7:49
 */
public class Demo {
	private static final Logger LOGGER = LoggerFactory.getLogger(Demo.class);
	
	public static void main(String[] args) {
		LOGGER.info("info");
		LOGGER.error("error");
	}
}
