package com.company;

public class ThrowKeyword {

    public static void main(String[] args) {

        System.out.println("ABC");

        try {
            throw new java.lang.Exception("New Exception");
        }catch (java.lang.Exception e){
            e.printStackTrace();
        }
        System.out.println("PQR");
    }
}
