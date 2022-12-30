import java.util.Arrays;

public class WhatIsBetween {
    public static int[] between(int a, int b) {
        int arrLength;

        if ((a < 0)) {
            arrLength = (-a + b) + 1;
        }
        else {
            arrLength = (b - a) + 1;
        }

        int[] result = new int[arrLength];

        for (int i = 0; i < result.length; i++) {
            result[i] = a++;
        }

        return result;
    }

    public static void main(String[] args) {
            System.out.println(Arrays.toString(between(-2, 2)));
        }
}
