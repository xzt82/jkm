package com.jkm.web.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Controller
public class SysController extends WebMvcConfigurerAdapter{
	@RequestMapping("/sys")
	public String sys(Map<String, Object> model) {
		model.put("message", "系统管理页面");
		model.put("title", "系统管理");
		return "sys";
	}
}
