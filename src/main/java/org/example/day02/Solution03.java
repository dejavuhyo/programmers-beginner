package org.example.day02;

import java.util.Arrays;

public class Solution03 {
    /**
     * 분수의 덧셈
     */
    public static void main(String[] args) {
        int numer1 = 1;
        int denom1 = 2;
        int numer2 = 3;
        int denom2 = 4;
        int[] answer = {};

        answer = new int[2];
        int denom = denom1 * denom2;
        int numer = denom2 * numer1 + denom1 * numer2;
        int val = getGcd(denom, numer);

        answer[0] = numer / val; // 기약분수의 분자
        answer[1] = denom / val; // 기약분수의 분모

        System.out.println(Arrays.toString(answer));
    }

    public static int getGcd(int a, int b) {
        if (b == 0) return a;
        return getGcd(b, a % b);
    }
}
