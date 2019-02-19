package com.yyaccp.auth.service;

import com.yyaccp.beans.pojo.ItripUser;

public interface UserService {
    ItripUser login(String userCode, String userPassword) throws Exception;
}
