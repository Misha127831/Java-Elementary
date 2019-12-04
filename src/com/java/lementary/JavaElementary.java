package com.java.lementary;
import java.util.Scanner;

public class JavaElementary {
    private static Scanner read;
    public static void main(String[] args) {

        read = new Scanner(System.in);

        double first;
        double second;
        int operator;

        System.out.println("Введите первое число:");
        first = read.nextDouble();
        System.out.println("Введите второе число:");
        second = read.nextDouble();
        System.out.println();
        System.out.println("Введите число соответствующее нужному вам дейстивию: 1-Сумма, 2-разница, 3-произведение, 4-деление");
        operator = read.nextInt();

        if (operator == 1) {
            System.out.println(sum(first, second));
        }
        if (operator == 2) {
            System.out.println(difference(first, second));
        }
        if (operator == 3) {
            System.out.println(multiplication(first, second));
        }
        if (operator == 4) {
            System.out.println(division(first, second));
        }

    }
    private static double sum(double firstN, double secondN){
        double answer;
        answer = firstN + secondN;
        return answer;
    }
    private static double difference(double firstN, double secondN){
        double answer;
        answer = firstN - secondN;
        return answer;
    }
    private static double multiplication(double firstN, double secondN){
        double answer;
        answer = firstN * secondN;
        return answer;
    }
    private static double division(double firstN, double secondN){
        double answer;
        answer = firstN / secondN;
        return answer;
    }


}

