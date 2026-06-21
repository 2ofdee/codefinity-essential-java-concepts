package com.example;

public class Main {
    public static int[] manipulateArray(int[] array, int multiplyBy, int addValue) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i] * multiplyBy + addValue;
        }
        return result;
    }

    public static void main(String[] args) {
        manipulateArray(new int[]{1, 2, 3}, 2, 1);
    }
}