package com.company;

import java.util.Scanner;

public class Main {
//dfgdff
    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        float firstn;
        float secoundn;
        float answer;
        System.out.println("first number");
        firstn = input.nextFloat();
        System.out.println("secound number");
        secoundn = input.nextFloat();
        answer = firstn * secoundn;
        System.out.println("the answer");
        System.out.println(answer);
    }
}
