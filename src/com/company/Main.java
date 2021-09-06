package com.company;

public class Main {

    public static void main(String[] args) {
	    char charToTest = 'Z';

	    switch (charToTest) {
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("The letter found was " + charToTest);
                break;
            default:
                System.out.println("The letter found was not A,B,C,D or E");
                break;
        }
    }
}
