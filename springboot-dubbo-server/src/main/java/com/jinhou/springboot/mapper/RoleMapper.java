package com.jinhou.springboot.mapper;

import java.util.List;

import com.jinhou.springboot.domain.RolePO;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface RoleMapper {

    
    List<RolePO> selectByUserId(@Param("userId") Long userId);
    
    
    
}