package com.mrchen.dockerdemo.controller;

import cn.dev33.satoken.stp.StpUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: dockerdemo
 * @Package: com.mrchen.dockerdemo.controller
 * @ClassName: UserController
 * @Author: Administrator
 * @Description:
 * @Date: 2021/9/24 16:34
 * @Version: 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {


    @GetMapping("/login")
    public String login(String id){
        StpUtil.login(id);
        return "登录成功";
    }

    @GetMapping("/isLogin")
    public String isLogin(String id){
      if (StpUtil.isLogin()){
          return "已经登录";
      }
      return "没有登录";
    }


    @GetMapping("/token")
    public String getToken(String id){
        System.out.println("加一段测试");
       return StpUtil.getTokenValueByLoginId(id);
    }
}
