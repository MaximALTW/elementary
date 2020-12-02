package com.company;

import com.sun.org.apache.xpath.internal.objects.XNumber;

public class Main2 {
    public static void main(String[] args) {
        recursionFunc(0);
    }

    public static void recursionFunc(int number) {
        System.out.println("Hello, Java!");
        System.out.println("number" + number);
        if (number < 100)
            recursionFunc(number + 1);

    }
}
