package com.yyaccp.auth.controller;

import com.yyaccp.auth.service.SmsService;
import com.yyaccp.auth.service.TokenService;
import com.yyaccp.auth.service.UserService;
import com.yyaccp.beans.dto.Result;
import com.yyaccp.beans.pojo.ItripUser;
import com.yyaccp.common.MD5;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Api
@Controller
@RequestMapping("/api")
public class UserController {
    @Resource
    private UserService userService;
    @Resource
    private TokenService tokenService;
    @Resource
    private SmsService smsService;

    @ApiOperation(value = "登录方法",httpMethod = "POST",protocols = "HTTP")
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public Result login(
            @ApiParam(value = "用户code",required = true) @RequestParam String userCode,
            @ApiParam(value = "密码",required = true) @RequestParam String userPassword,
            HttpServletRequest request) {
        try {
            ItripUser user = userService.login(userCode, MD5.md5(userPassword));
            if(user==null) return Result.returnFailed("用户名或密码不对");
            //
            String token = tokenService.generateToken(request.getHeader("user-agent"),user);
            tokenService.saveToken(token, user);
        } catch (Exception e) {
            e.printStackTrace();
            return Result.returnFailed("未知错误"+e.getMessage());
        }

        return Result.returnSuccess();
    }

    @ApiOperation(value = "发送验证码",httpMethod = "POST",protocols = "HTTP")
    @RequestMapping(value = "/sendSms",method = RequestMethod.POST)
    @ResponseBody
    public Result sendCode(
            @ApiParam(value = "手机号码",required = true) @RequestParam String mobilePhone) throws Exception {
        String code = smsService.send(mobilePhone);
        return Result.returnSuccess("验证码是：" + code);
    }

}
