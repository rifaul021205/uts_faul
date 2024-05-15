/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugasuts202357201034;

/**
 *
 * @author rifaul
 */
public class utsno1 {

    public static int countBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countBits(1234));
        System.out.println(countBits(0));
        System.out.println(countBits(15));
        System.out.println(countBits(1));
        System.out.println(countBits(1023));
    }
}
