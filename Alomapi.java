package com.alom.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Controller
public class Alomapi {
	
	@GetMapping("/")
	public String indexMethod() {
		log.debug("Log file Description : {}","This my log limit test file, here we can set specific limit for log file to gz archive file!");
		return "index";
	}
}
