package com.example.demo.controller;

import com.example.demo.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Api("用户模块")
@RestController("user")
@RequestMapping("/user")
public class userController {

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ApiOperation(value = "登陆", notes="验证用户名密码")
    @CrossOrigin
    @ResponseBody
    public WebResponse test(@RequestParam(name = "name", required = true) String name, @RequestParam(name = "password", required = true) String password) {
        if ("lsf".equals(name) && "123".equals(password)) {
            System.out.print("success");
        }
        User user = new User("lsf", 24);
        Map<String, Object> users = new HashMap<>();
        users.put("user", user);
        WebResponse response = new WebResponse(WebResponse.REQUEST_SUCCESS_CODE, users);
        return response;
    }
}
