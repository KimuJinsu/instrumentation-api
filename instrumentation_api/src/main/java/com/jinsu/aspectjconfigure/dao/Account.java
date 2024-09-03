// Account.java
package com.jinsu.aspectjconfigure.dao;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

import com.jinsu.aspectjconfigure.service.MyService;

@Configurable(autowire = Autowire.BY_TYPE, 
            dependencyCheck = true,
            preConstruction = true)
public class Account {
    
    @Autowired
    private MyService myService;
    
    public void doSomething() {
        if (myService != null) {
            myService.performService();
        } else {
            System.out.println("Account::doSomething:MyService is not injected");
        }
    }
}