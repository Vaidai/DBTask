package com.company;

public class Checker {

    public boolean checkIfANumberIsAMagic(int magicNumber, int testNumber) {

        String magic = Integer.toString(magicNumber);

        for (int i = 0; i < magic.length(); i++) {
            char temp = magic.charAt(0);
            magic = magic.substring(1) + temp;

            if (magic.equals(Integer.toString(testNumber))) {
                return true;
            }
        }
        return false;
    }

}
