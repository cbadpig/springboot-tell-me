package com.cbadpig.tell.me.demo.java_8;

import java.util.Arrays;

/**
 * lambda表达式，好好学吧，少年。
 */
public class Demo_lambda {
    public static void main(String[] args) {
        /**
         * demo_1_线程
         */
        //旧的方式写法
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("线程->旧方式实现");
//            }
//        }).start();
//        // lambda方式的写法
//        new Thread(()-> System.out.println("线程-lambda实现")).start();


        /**
         *
         */
        int[] a = {22,23,25};
//        System.out.println(Arrays.binarySearch(a,24));
        int[] b = {20,23,25};
//        System.out.println(Arrays.copyOf(b,1));
//        System.out.println(Arrays.copyOfRange(b,1,2));

        System.out.println(Arrays.compare(a,b));


    }
}
