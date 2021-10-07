package com.makhabatusen;

public class Main {

    public static void main(String[] args) {
        Color blue = Color.BLUE;
        System.out.println(blue.getCode() + " " + blue.getOrder());

        System.out.println("______");

        Operation divide = Operation.DIVIDE;
        System.out.println(divide.action(20, 5));

    }
}
