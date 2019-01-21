package cn.li.controller;

import cn.li.entity.User;
import cn.li.service.UserService;
import cn.li.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author:libuxin
 * @Date:2019/1/21 14:01
 * @Version 1.0
 */

@Controller
public class RegisterController {

    @Autowired
    private UserService userService;

    @RequestMapping("/register")
    public String register(@RequestBody User user, Model model){
        if(userService.findByName(user.getUsername())==null){
            userService.create(user);
            System.out.println("可注册" );
            return "redirect:index.do";
        }else {
            model.addAttribute("用户已存在");
            return "register";

        }
    }

}
