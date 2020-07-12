package com.moex;

import java.math.BigInteger;

public class ConvertNumber {
    public static Number convertNumberToOtherNumerationSystem(Number number, NumerationSystem expectedNumerationSystem) {
        Number result = null;
        int system = number.getNumerationSystem().getNumerationSystemIntValue();
        try {
            String strNum = "" + new BigInteger(number.getDigit(), system);
            BigInteger a = new BigInteger(strNum);
            String s = a.toString(expectedNumerationSystem.getNumerationSystemIntValue());
            result = new Number(expectedNumerationSystem, s);
        } catch (NumberFormatException e) {
            System.out.println("Основание системы счисления и число - несоответствуют");
        }
        return result;
    }
}

