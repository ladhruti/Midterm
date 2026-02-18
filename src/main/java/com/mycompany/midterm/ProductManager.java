/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.midterm;

/**
 *
 * @author Princ
 */
public class ProductManager {
    
     public static void main(String[] args) {
        System.out.println("Product Manager running");
    }
     // This method calculates the final price after applying a percentage discount.

     public double calculateDiscount(double price, double percent) {
    return price - (price * percent / 100);
}
     
    
}
