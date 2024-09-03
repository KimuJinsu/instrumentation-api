package com.jinsu.aspectjconfigure.service;

import org.springframework.stereotype.Service;

@Service
public class SubEntitlementCalculationService implements EntitlementCalculationService {
    
    @Override
    public void calculateEntitlement() {
        try {
            System.out.println("SubEntitlementCalculationService::calculateEntitlement: Starting calculation...");
            Thread.sleep(1000);
            System.out.println("SubEntitlementCalculationService::calculateEntitlement: Calculation completed.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("SubEntitlementCalculationService::calculateEntitlement: Calculation interrupted.");
        }
    }
}