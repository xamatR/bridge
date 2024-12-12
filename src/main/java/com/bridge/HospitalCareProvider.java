package com.bridge;

public class HospitalCareProvider implements CareProvider {

    @Override
    public float provideBasicCare() {
        return 0.5f;
    }

    @Override
    public float provideAdvancedCare() {
        return 0.7f;
    }
}