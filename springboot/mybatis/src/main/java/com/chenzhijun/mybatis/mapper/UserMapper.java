package com.chenzhijun.mybatis.mapper;

import com.chenzhijun.mybatis.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select * from user_tbl where name = #{name}")
    User findByName(@Param("name")String name);

    @Insert("insert into user_tbl(name, age) values(#{name}, #{age})")
    int insert(@Param("name") String name, @Param("age") Integer age);
}
