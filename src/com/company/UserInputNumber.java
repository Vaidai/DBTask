package com.company;

import java.util.Scanner;

public class UserInputNumber implements Number {

    @Override
    public int getNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = sc.nextInt();

        return number;
    }
}
