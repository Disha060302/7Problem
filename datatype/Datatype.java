package com.datatype;

public class Datatype {
    public static void main(String[] args) {
        int value = 13;
        System.out.println("Integer value is "+value);
        double salary = 23000.00;
        System.out.println("Decimal value is "+salary);
        char grade = 'A';
        System.out.println("Char value is "+grade);
        long number = 298490987L;
        System.out.println("Long num is "+number);
        float a = 3475.9857f;
        System.out.println("Float value is "+a);
        String name = "Disha";
        System.out.println("Name is "+name);
        boolean isRaining = true;
        boolean hasPermission = false;
        if(isRaining){
            System.out.println("Remember to take umbrella");
        }
        if(hasPermission){
            System.out.println("Access granted");
        }else{
            System.out.println("Access denied");
        }

    }
}

