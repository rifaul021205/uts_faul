/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugasuts202357201034;

/**
 *
 * @author rifaul
 */
public class utsno4 {
     public static boolean isValid(char[] walk) {
        if (walk.length != 10) {
            return false;
        }
        int vertical = 0;
        int horizontal = 0;
        for (char direction : walk) {
            switch (direction) {
                case 'n':
                    vertical++;
                    break;
                case 's':
                    vertical--;
                    break;
                case 'e':
                    horizontal++;
                    break;
                case 'w':
                    horizontal--;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid direction: " + direction);
            }
        }
        return vertical == 0 && horizontal == 0;
    }
}
