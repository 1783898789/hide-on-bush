package cn.jiyun.service;

import cn.jiyun.mapper.UserMapper;
import cn.jiyun.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public List<User> selectUserByPro(){
        return userMapper.selectUserByPro();
    }
}
