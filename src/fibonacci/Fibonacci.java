/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fibonacci;

/**
 *
 * @author ADMIN
 */
public class Fibonacci {

    private long[] arr;

    public Fibonacci(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("Size must be positive.");
        }
        arr = new long[size];
    }

    public long[] getArr() {
        return arr;
    }

    public void generateFibonacci() {
        long a = 0, b = 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = a;
            long next = a + b;
            a = b;
            b = next;
        }
    }

    public void display() {
        System.out.println("The 45 sequence fibonacci: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(".");
    }
}
