package com.itheima.mapper;

import com.itheima.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    // 查询全部用户信息
    @Select("select * from `table`")
    public List<User> list();

    // 删除指定id的用户信息
    @Select("delete from `table` where id = #{id}")
    public void delete(Integer id);
}
