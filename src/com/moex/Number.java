package com.moex;

public class Number {
    private NumerationSystem numerationSystem;
    private String digit;

    public Number(NumerationSystem numerationSystem, String digit) {
        this.numerationSystem = numerationSystem;
        this.digit = digit;
    }

    public NumerationSystem getNumerationSystem() {
        return numerationSystem;
    }

    public String getDigit() {
        return digit;
    }

    @Override
    public String toString() {
        return "Исходное число в " + numerationSystem.getNumerationSystemIntValue() +
                " системе = " + digit + '\'';
    }
}