package cn.jiyun.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.jiyun.mapper.EmpMapper;
import cn.jiyun.pojo.Emp;
import cn.jiyun.pojo.EmpVo;

@Service
public class EmpService {
	
	@Autowired 
	private EmpMapper mapper;

	public PageInfo<EmpVo> findAll(EmpVo emp,@RequestParam(defaultValue="1")Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum,pageSize);
		
		List<EmpVo> list = mapper.findAll(emp);
		
		return new PageInfo<EmpVo>(list);
		
	}

	public void add(Emp emp) {
		mapper.add(emp);
	}

	public Emp findById(Integer id) {
		// TODO Auto-generated method stub
		return mapper.findById(id);
	}
	
}
