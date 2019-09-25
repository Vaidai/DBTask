package com.company;

public class Main {

    public static void main(String[] args) {

        mainProgram();
    }

    public static void mainProgram() {

        int magicNumber = 142857;

//        Number userInputNumber = new UserInputNumber();
        Number testNumber = new TestNumber();

        Checker checker = new Checker();

        boolean isMagic = checker.checkIfANumberIsAMagic(magicNumber, testNumber.getNumber());

        if (isMagic) {
            System.out.println("It's magic!");
        } else {
            System.out.println("No magic!");
        }
    }

}


