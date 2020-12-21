package com.cbadpig.tell.me.demo.util;

/**
 * 全排列
 */
public class FullPermutationUtil {
    public static void permutation(char a[], int m, int n) {
        if (m < n - 1) {
            permutation(a, m + 1, n);
            for (int i = m + 1; i < n; i++) {
                char t = a[m];
                a[m] = a[i];
                a[i] = t;

                permutation(a, m + 1, n);
                t = a[m];
                a[m] = a[i];
                a[i] = t;
            }
        } else {
            printResult(a);
        }
    }

    public static void printResult(char[] text) {
        for (int i = 0; i < text.length; i++) {
            System.out.print(text[i]);
        }
        System.out.print(",");
    }

    public static char[] text = { 'a', 'b', 'c', 'd'};

    public static void fullPermutation(String[] strs) {
        int start = 0;
        int end = strs.length - 1;

        if(start == end) {

        }
    }


    public static void main(String[] args) {
        permutation(text, 0, text.length);
        String str = "ABC";
        fullPermutation(str.split(""));
    }
}
