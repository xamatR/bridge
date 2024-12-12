package com.bridge;

public abstract class CareService {
    protected CareProvider provider;

    protected float cost;
    protected float careDays;

    protected CareService(CareProvider provider) {
        this.provider = provider;
    }

    public void setCareDays(float careDays) {
        this.careDays = careDays;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public abstract float calculateBudget();
}