package com.moex;

import static com.moex.ConvertNumber.convertNumberToOtherNumerationSystem;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Input input = new Input();
        input.checkInputData();
        Number number = new Number(input.a, input.x);
        Number result = convertNumberToOtherNumerationSystem(number, input.b);
        System.out.println(result);    //expected abcdefabcdef
    }
}
