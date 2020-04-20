package com.company;

public class test {
    public static class Test {
        public static void main(String[] args) {
            double[] myArray = {11, 5.8, 11.1, 10.9};
            double min = Double.MAX_VALUE;
            for (int i = 0; i < myArray.length; i++) {
                min = Math.min(min, myArray[i]);
            }
            System.out.println("Минимальный элемент в массиве Array: " + min);
        }
    }
}