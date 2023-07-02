package com.practice.controller;


import com.practice.api.CommonResult;
import com.practice.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @Author G
 * @Date 2023/7/1 22:55
 * @PackageName:com.practice.controller
 * @ClassName: LoginController
 * @Description: TODO
 * @Version 1.0
 */
@RestController
@Slf4j
public class LoginController {

    @RequestMapping(value = "/user/login", method = RequestMethod.POST)
    @CrossOrigin
    public CommonResult login(@RequestBody User user) {
        log.info(user.toString());
        if (user.getUsername().equals("test") && user.getPassword().equals("123456"))
            return CommonResult.success("登录成功");
        else
            return CommonResult.validateFailed();
    }
}
