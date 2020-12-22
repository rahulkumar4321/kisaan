package com.info.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class KisaanRestController {
	private static Logger logger=LogManager.getLogger(KisaanRestController.class);
	@GetMapping(value="/rahul")
	public String getName()
	{
		logger.info("rahul");
		return "rahul";
	}
}
