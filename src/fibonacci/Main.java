/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonacci;

/**
 *
 * @author ADMIN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
//    4
    public static void main(String[] args) {
        Fibonacci fibo = new Fibonacci(45);
        fibo.generateFibonacci();
        fibo.display(); 
    }
}
