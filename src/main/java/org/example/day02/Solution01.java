package org.example.day02;

public class Solution01 {
    /**
     * 두 수의 나눗셈
     */
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 2;
        int answer = 0;

        Double dubl = Double.valueOf(num1) / Double.valueOf(num2) * 1000;
        answer = (int) Math.floor(dubl);

        System.out.println(answer);
    }
}
