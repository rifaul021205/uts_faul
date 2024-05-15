/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugasuts202357201034;

/**
 *
 * @author rifaul
 */
public class utsno2 {

    public class MissingLetterFinder {

        public static char findMissingLetter(char[] array) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i + 1] - array[i] > 1) {
                    return (char) (array[i] + 1);
                }
            }
            
        }return ' ';

        public static void main(String[] args) {
            char[] array1 = {'a', 'b', 'c', 'd', 'f'};
            System.out.println(findMissingLetter(array1));

            char[] array2 = {'O', 'Q', 'R', 'S'};
            System.out.println(findMissingLetter(array2));
        }
    }

}
