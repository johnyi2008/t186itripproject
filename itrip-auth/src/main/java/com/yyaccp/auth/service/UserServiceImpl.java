package com.yyaccp.auth.service;

import com.yyaccp.beans.pojo.ItripUser;
import com.yyaccp.dao.ItripUserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private ItripUserMapper itripUserMapper;
    @Override
    public ItripUser login(String userCode, String userPassword) throws Exception {
        Map<String,Object> map = new HashMap<>();
        map.put("userCode",userCode);
        map.put("userPassword",userPassword);
        List<ItripUser> list = itripUserMapper.selectByMap(map);
        if(list.isEmpty()) return null;
        return list.get(0);
    }
}
