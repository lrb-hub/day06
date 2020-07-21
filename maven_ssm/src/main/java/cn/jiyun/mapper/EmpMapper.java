package cn.jiyun.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import cn.jiyun.pojo.Emp;
import cn.jiyun.pojo.EmpVo;

public interface EmpMapper {


	List<EmpVo> findAll(EmpVo emp);

	void add(Emp emp);
	Emp findById(Integer id);
	
}
