package com.jinhou.springboot.mapper;

import com.jinhou.springboot.domain.UserPO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface UserMapper {

    UserPO findByUserId(@Param("id") Long id);

    UserPO findByUserName(@Param("username") String   username);
}
