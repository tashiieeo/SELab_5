package com.example.lab_5;

public class MathUtil {
    public static double abs(double a){
        if(a<0){
            a=a*-1;
        }
        return a;
    }
    public static double add(double a, double b){
        double x = a+b;
        return x;
    }
    public static double sub(double y, double z){
        double r = y - z;
        return r;
    }
}
