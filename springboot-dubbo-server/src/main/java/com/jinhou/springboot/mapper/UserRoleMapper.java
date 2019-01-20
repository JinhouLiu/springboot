package com.jinhou.springboot.mapper;

import com.jinhou.springboot.domain.RolePO;
import com.jinhou.springboot.domain.UserRolePO;
import org.apache.ibatis.annotations.Param;

import java.util.Set;


public interface UserRoleMapper {

	int deleteByPrimaryKey(Long id);

	int insert(UserRolePO record);

	int insertSelective(UserRolePO record);

	UserRolePO selectByPrimaryKey(Long id);

	int updateByPrimaryKeySelective(UserRolePO record);

	int updateByPrimaryKey(UserRolePO record);
	
	
	boolean  isExistUserRole(@Param("roleId") Long roleId, @Param("userId") Long userId);
	
	//  根据用户id 和角色id 删除对应的用户角色关系
	void deleteByUserRole(@Param("roleId") Long roleId, @Param("userId") Long userId);

	Set<RolePO>  findByUserId(@Param("userId") Long userId);
}
