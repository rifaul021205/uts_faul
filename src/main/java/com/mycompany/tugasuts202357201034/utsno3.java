/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugasuts202357201034;

/**
 *
 * @author rifaul
 */
public class utsno3 {

    public static String binaryAddition(int a, int b) {
        int sum = a + b;

        String binaryString = Integer.toBinaryString(sum);

        return binaryString;
    }

    public static void main(String[] args) {
        System.out.println(binaryAddition(1, 1));
        System.out.println(binaryAddition(5, 9));
    }
}
