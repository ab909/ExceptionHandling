package com.company;

public class Exception {

    public static void main(String[] args) {

        try {
            int i = 9/0;
            System.out.println(i);
        }catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println("ABC");
        System.out.println("ABC");
        System.out.println("ABC");
        System.out.println("ABC");
        System.out.println("ABC");

    }


}


