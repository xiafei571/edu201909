package edu201909.spring.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import edu201909.spring.domain.DeptInfo;

public interface DeptMapper {

	static String COLUMN_ALL = "deptno, dname, loc";

	@Select("SELECT " + COLUMN_ALL + " FROM dept")
	@ResultMap("deptResultMapper")
	List<DeptInfo> getDeptList();
}
