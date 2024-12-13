package org.example.day02;

import java.util.Arrays;

public class Solution04 {
    /**
     * 배열 두 배 만들기
     */
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] answer = {};

        int idx = 0;
        answer = new int[numbers.length];
        for (Integer number : numbers) {
            answer[idx] = number * 2;
            idx++;
        }

        System.out.println(Arrays.toString(answer));
    }
}
