package com.yyaccp.auth.service;

import com.alibaba.fastjson.JSONObject;
import com.yyaccp.beans.pojo.ItripUser;
import com.yyaccp.common.MD5;
import com.yyaccp.common.RedisAPI;
import com.yyaccp.common.UserAgentUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TokenServiceImpl implements TokenService {
    @Resource
    private RedisAPI redisAPI;

    @Override
    public String generateToken(String userAgent, ItripUser user) throws Exception {
        StringBuffer token = new StringBuffer();
        if(UserAgentUtils.isPc(userAgent)) {
            token.append("token:PC-");
        } else {
            token.append("token:MOBILE-");
        }
        token.append(MD5.md5(user.getUsercode()) + "-" + user.getId() + "-");
        token.append(MD5.md5(userAgent).substring(0,6));
        return token.toString();
    }

    @Override
    public void saveToken(String token, ItripUser user) throws Exception {
        if(token.startsWith("token:PC")) {
            redisAPI.setEx(token,2*60*60, JSONObject.toJSONString(user));
        } else {
            redisAPI.set(token, JSONObject.toJSONString(user));
        }
    }
}
