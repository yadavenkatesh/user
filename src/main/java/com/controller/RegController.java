package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class RegController {
	@RequestMapping(value="/reg")
public String register(@RequestParam("name")String username)
{
	System.out.println("testing application"+username);
	return "test";
}
}
