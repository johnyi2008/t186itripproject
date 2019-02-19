package com.yyaccp.auth.service;

import com.yyaccp.beans.pojo.ItripUser;

public interface TokenService {
    String generateToken(String userAgent, ItripUser user) throws Exception;
    void saveToken(String token, ItripUser user) throws Exception;
}
