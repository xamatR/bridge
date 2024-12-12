package com.bridge;

public class AdvancedCareService extends CareService {

    public AdvancedCareService(CareProvider provider) {
        super(provider);
    }

    @Override
    public float calculateBudget(){
        return cost * careDays * (1 + this.provider.provideAdvancedCare());
    }

}