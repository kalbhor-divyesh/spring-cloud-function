package com.spring.cloud.divyesh.sample.service;

import org.springframework.stereotype.Service;

@Service
public class SampleService {
    public String appendMessage(String input) {
        return "HELLO DIVYESH " + input;
    }
}
