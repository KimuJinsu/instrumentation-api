package com.jinsu.aspectjconfigure.service;

import org.springframework.stereotype.Service;

@Service
public class MyService {
    
    public void performService() {
        System.out.println("MyService::performService: Service is performing an operation.");
    }
}