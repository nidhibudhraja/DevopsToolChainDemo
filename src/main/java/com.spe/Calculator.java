package com.spe;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("add 6+4="+add(6,4));
        System.out.println("subtraction 6-4="+subtract(6,4));
        System.out.println("multiplication 6*4="+multiply(6,4));
        System.out.println("division 16/4="+divide(16,4));
    }

    public static int divide(int i, int i1) {
        int q;
        if(i1!=0)
            q=i/i1;
        else
            q=0;
        return q;
    }

    public static int multiply(int i, int i1) {
        return i*i1;
    }

    public static int subtract(int i, int i1) {
        return i-i1;
    }

    public static int add(int a,int b){
        return a+b;
    }
}
