package com.yyaccp.auth.service;

public interface SmsService {
    String send(String mobileNumber) throws Exception;
}
