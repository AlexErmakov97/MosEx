package com.moex;

import java.util.Scanner;

public class Input {

    private static boolean flag = true;
    public NumerationSystem a; //Основание исходной системы счисления
    public NumerationSystem b; //Основание целевой системы счисления
    public String x; //Число в а-ричной сиситеме

    public void checkInputData() {
        NumerationSystemType[] number = NumerationSystemType.values();
        while (flag) {
            System.out.println("Введите систему счисления числа:");
            Scanner scanner_a = new Scanner(System.in);
            String a = "_" + scanner_a.nextLine();
            System.out.println("Введите число");
            Scanner scanner_x = new Scanner(System.in);
            String x = scanner_x.nextLine();
            System.out.println("Введите основание системы в которую переводите");
            Scanner scanner_b = new Scanner(System.in);
            String b = "_" + scanner_b.nextLine();
            try {
                if (a == null || b == null || x == null) {
                    throw new IllegalArgumentException();
                }
                var temp_a = NumerationSystemType.valueOf(a);
                var temp_b = NumerationSystemType.valueOf(b);
                for (NumerationSystemType i : number) {
                    if (i.equals(temp_a)) {
                        flag = false;
                    }
                }
                this.a = NumerationSystemType.valueOf(a);
                this.b = NumerationSystemType.valueOf(b);
                this.x = x;
            } catch (IllegalArgumentException e) {
                System.out.println("Проверьте правильность введенных параметров");
            }
        }
    }
}
