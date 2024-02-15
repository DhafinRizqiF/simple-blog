package com.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import ch.qos.logback.core.model.Model;

import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PostPageController {
	
	@RequestMapping("/page/index")
	public String getIndexPage() {
		return "index";
	}
	
	@RequestMapping("/page/detail/{id}")
	public String getDetailPage(@PathVariable("id") int id, Model model) {
		model.addAttribute("id", id);
		return "detail";
	}
}
