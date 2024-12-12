package com.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdvancedCareServiceTest {

    @Test
    public void calculateBudgetHospitalAdvanced() {
        CareProvider provider = new HospitalCareProvider();
        CareService service = new AdvancedCareService(provider);
        service.setCost(1000);
        service.setCareDays(10);
        assertEquals(17000, service.calculateBudget());
    }

    @Test
    public void calculateBudgetHomeCareAdvanced() {
        CareProvider provider = new HomeCareProvider();
        CareService service = new AdvancedCareService(provider);
        service.setCost(1000);
        service.setCareDays(10);
        assertEquals(13000, service.calculateBudget());
    }
}