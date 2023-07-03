package com.practice.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.practice.api.CommonResult;
import com.practice.entity.User;
import com.practice.mapper.UserMapper;
import com.practice.service.impl.UserServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Author G
 * @Date 2023/7/1 22:55
 * @PackageName:com.practice.controller
 * @ClassName: LoginController
 * @Description: TODO mysql 未实现
 * @Version 1.0
 */
@RestController
@Slf4j
public class LoginController {
    @Resource
    private UserServiceImpl userService;

    @RequestMapping(value = "/user/login", method = RequestMethod.POST)
    @CrossOrigin
    public CommonResult login(@RequestBody User user) {
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(User::getUsername, user.getUsername()).eq(User::getPassword, user.getPassword());
        User userlogin = userService.getOne(queryWrapper);

        log.info(user.toString());
        if (user.getUsername().equals(userlogin.getUsername()) && user.getPassword().equals(userlogin.getPassword()))
            return CommonResult.success("登录成功");
        else
            return CommonResult.validateFailed();
    }
    @RequestMapping(value = "/user/register", method = RequestMethod.POST)
    @CrossOrigin
    public CommonResult register(@RequestBody User user) {
        boolean save = userService.save(user);
        if (save)
            return CommonResult.success("登录成功");
        else
            return CommonResult.validateFailed();
    }
}
