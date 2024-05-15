/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.tugasuts202357201034;

/**
 *
 * @author rifaul
 */
public class Tugasuts202357201034 {

    public static String toJadenCase(String phrase) {
        if (phrase == null || phrase.isEmpty()) {
            return null;
        }
        String[] words = phrase.split(" ");
        StringBuilder jadenCasedPhrase = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                jadenCasedPhrase.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1).toLowerCase())
                        .append(" ");
            }
        }

        return jadenCasedPhrase.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(toJadenCase("How can mirrors be real if our eyes aren't real")); 
        System.out.println(toJadenCase("")); 
        System.out.println(toJadenCase(null)); 
    }
}
