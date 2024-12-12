package com.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicCareServiceTest {
    
    @Test
    public void calculateBudgetHospitalBasic() {
        CareProvider provider = new HospitalCareProvider();
        CareService service = new BasicCareService(provider);
        service.setCost(1000);
        service.setCareDays(10);
        assertEquals(15000, service.calculateBudget());
    }


    @Test
    public void calculateBudgetHomeCareBasic() {
        CareProvider provider = new HomeCareProvider();
        CareService service = new BasicCareService(provider);
        service.setCost(1000);
        service.setCareDays(10);
        assertEquals(11000, service.calculateBudget());
    }
}
