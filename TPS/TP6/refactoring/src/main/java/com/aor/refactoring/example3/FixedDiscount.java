package com.aor.refactoring.example3;

public class FixedDiscount extends Discount{
    private final int fixed;

    public FixedDiscount(int fixed) {
        this.fixed = fixed;
    }

    @Override
    public double applyDiscount(double price) {
        price = fixed > price ? 0 : price - fixed;
        return price;
    }
}
