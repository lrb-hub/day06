package cn.jiyun.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.jiyun.pojo.Dept;
import cn.jiyun.pojo.EmpVo;
import cn.jiyun.service.DeptService;
import cn.jiyun.service.EmpService;

@Controller
@RequestMapping("dept")
@CrossOrigin(value="http://localhost:63342")
//@RestController
public class DeptController {

	@Autowired
	private DeptService service;

	@RequestMapping("findDept")
	@ResponseBody
	public List<Dept> findDept() {
		
		return service.findDept();
	}
}
