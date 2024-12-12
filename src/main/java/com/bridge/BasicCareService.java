package com.bridge;

public class BasicCareService extends CareService {

    public BasicCareService(CareProvider provider) {
        super(provider);
    }

    @Override
    public float calculateBudget(){
        return cost * careDays * (1 + this.provider.provideBasicCare());
    }

}