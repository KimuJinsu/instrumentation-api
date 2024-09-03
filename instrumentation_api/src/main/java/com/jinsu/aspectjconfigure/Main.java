package com.jinsu.aspectjconfigure;

import com.jinsu.aspectjconfigure.config.AppConfig;
import com.jinsu.aspectjconfigure.dao.Account;
import com.jinsu.aspectjconfigure.service.EntitlementCalculationService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        System.out.println("Initializing Spring Application Context...");
        
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
        System.out.println("Spring Application Context initialized.");

        // Account 객체 생성 및 메서드 호출
        Account account = new Account();
        System.out.println("Calling Account.doSomething() method...");
        account.doSomething();
        System.out.println("Finished Account.doSomething() method.");

        // EntitlementCalculationService Bean 가져오기 및 메서드 호출
        EntitlementCalculationService service = context.getBean(EntitlementCalculationService.class);
        System.out.println("Calling EntitlementCalculationService.calculateEntitlement() method...");
        service.calculateEntitlement();
        System.out.println("Finished EntitlementCalculationService.calculateEntitlement() method.");
    }
}