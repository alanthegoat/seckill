package com.alanthegoat.seckill.controller;

import com.alanthegoat.seckill.bean.User;
import com.alanthegoat.seckill.redis.RedisService;
import com.alanthegoat.seckill.result.Result;
import com.alanthegoat.seckill.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by jiangyunxiong on 2018/5/23.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    RedisService redisService;

    @RequestMapping("/info")
    @ResponseBody
    public Result<User> info(Model model, User user) {
        return Result.success(user);
    }
}