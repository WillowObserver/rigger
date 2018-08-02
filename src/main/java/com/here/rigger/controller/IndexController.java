package com.here.rigger.controller;

import com.here.rigger.domain.SysUser;
import com.here.rigger.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller()
@RequestMapping("/index")
public class IndexController {

	@RequestMapping("/hello")
	public String index(Model model){
		model.addAttribute("welcome","你好呀!");
		return "index";
	}

	@Autowired
	SysUserService sysUserService;

	@RequestMapping("/test/{str}")
	@ResponseBody
	public String test(@PathVariable(value = "str") String str) {
		SysUser sysUser = new SysUser();
		sysUser.setUserAddr(str);
		int i = sysUserService.insertNonEmptySysUser(sysUser);
		return String.valueOf(i);
	}

}
