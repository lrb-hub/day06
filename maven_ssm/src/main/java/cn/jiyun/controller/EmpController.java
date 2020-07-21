package cn.jiyun.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.jiyun.pojo.Emp;
import cn.jiyun.pojo.EmpVo;
import cn.jiyun.service.EmpService;

@Controller
@RequestMapping("emp")
@CrossOrigin(value="http://localhost:63342")
//@RestController
public class EmpController {

	@Autowired
	private EmpService service;

	@RequestMapping("findAll")
	@ResponseBody
	public 	PageInfo<EmpVo> findAll(@RequestParam(defaultValue="1")Integer pageNum,@RequestParam(defaultValue="2")Integer pageSize) {
		
		return service.findAll(new EmpVo(),pageNum,pageSize);
	}
	@RequestMapping("add")
	public void add(@RequestBody Emp emp){
		service.add(emp);
		
	}
	@RequestMapping("findById")
	public Emp findById(Integer id){
		Emp emp = service.findById(id);
		return emp;
	}
	
}
