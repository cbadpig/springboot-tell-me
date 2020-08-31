package com.cbadpig.tell.me.demo.util;

/**
 * 全排列
 */
public class FullPermutationUtil {
    public static void permutation(char a[], int m, int n) {
        int i;
        char t;
        if (m < n - 1) {
            permutation(a, m + 1, n);
            for (i = m + 1; i < n; i++) {
                t = a[m];
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
        System.out.println();
    }

    public static char[] text = { 'a', 'b' };

    public static void main(String[] args) {
        permutation(text, 0, text.length);
        System.exit(0);
    }
}
