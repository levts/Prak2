package org.example;

public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
    public int avg(){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for(int sale: sales){
            if(sale > max){
                max = sale;
            }
            if(sale < min){
                min = sale;
            }
            sum+=sale;
        }
        return((sum-max-min)/(sales.length-2));
    }
}