package com.company;

public class ThrowsKeyword {

    public static void main(String[] args)  {

        ThrowsKeyword throwsKeyword = new ThrowsKeyword();
        throwsKeyword.sum();
        throwsKeyword.sum();
        System.out.println("ABC");
    }

    public void sum()  {
        try {
            div();

        }catch (ArithmeticException e){

        }


    }
    public void div() throws ArithmeticException{

        int i = 9/0;
    }
}
