/*
package com.here.rigger.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.here.rigger.dao.DemoDao;
import com.here.rigger.domain.DemoEntity;

import java.util.List;

@controller()
@RequestMapping("/demo")
public class DemoController {
	@Autowired
	DemoDao demoDao;
	@RequestMapping("/add/{name}")
	@ResponseBody
	String add(@PathVariable(name = "name") String name){
		DemoEntity d = new DemoEntity();
		d.setName(name);
		DemoEntity save = demoDao.save(d);
		return save.getId()+save.getName();
	}

	@RequestMapping("/get")
	@ResponseBody
	List<DemoEntity> get(){
		List<DemoEntity> all = demoDao.findAll();
		return all;
	}
}
*/
