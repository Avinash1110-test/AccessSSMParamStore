package com.aws.ssm.controller;

import com.aws.ssm.service.SSMService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ssm/")
public class SSMController {

    @Autowired
    private SSMService ssmService;

    @GetMapping(value = "getValue")
    public ResponseEntity<String> getValue(@RequestParam String name) {

        String value = ssmService.getValue(name);
        return new ResponseEntity<>(value, HttpStatus.OK);
    }
}
