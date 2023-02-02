package com.sparta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a time: ");
        int time=scanner.nextInt();
        String greeting=Program.greeting(time);
        System.out.println(greeting);
//        int[] iArr={1,2};
//        float f=21.0f;
//        double d=2.0;
//        long l=12334;
//        byte b=1;
//        short s=1;
//        boolean boolean1=false;
//        char c='c';
    }
}
