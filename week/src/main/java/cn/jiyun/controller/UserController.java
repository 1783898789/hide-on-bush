package cn.jiyun.controller;

import cn.jiyun.pojo.User;
import cn.jiyun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("goShow")
    /*@ResponseBody*/
    public String selectAll(Model model){
        List<User> users = userService.selectUserByPro();
        model.addAttribute("userList",users);
        return "show";
    }

    @RequestMapping("goQuery")
    public String goQuery(Model model){
        return "query";
    }
}
