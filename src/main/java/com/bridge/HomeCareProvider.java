package com.bridge;

public class HomeCareProvider implements CareProvider {

   @Override
    public float provideBasicCare() {
         return 0.1f;
    }

    @Override
    public float provideAdvancedCare() {
        return 0.3f;
    }
}