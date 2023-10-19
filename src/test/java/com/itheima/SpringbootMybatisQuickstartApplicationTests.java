package com.itheima;

import com.itheima.mapper.UserMapper;
import com.itheima.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootMybatisQuickstartApplicationTests {

    @Autowired
    private UserMapper userMapper;
    @Test
    public void testListUser() {
        List<User> userList = userMapper.list();
        userList.forEach(System.out::println);
    }

    @Test
    public void testDelete(){
        userMapper.delete(3);
    }

}