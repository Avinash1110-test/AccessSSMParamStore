package com.aws.ssm.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SSMServiceImpl implements SSMService {

    // get value from application.properties file
    @Value("${spring.aws.app.password}")
    private String password;

    @Override
    public String getValue(String name) {
        return password;
    }
}
