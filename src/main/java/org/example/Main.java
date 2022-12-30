package org.example;

public class Main {
    public static void main(String[] args) {
        long[] sales = new long[]{1, 5, 3, 4, 6, 8, 3, 7};
        SalesManager salesManager = new SalesManager(sales);
        System.out.println(salesManager.max());
        System.out.println(salesManager.avg());
    }
}