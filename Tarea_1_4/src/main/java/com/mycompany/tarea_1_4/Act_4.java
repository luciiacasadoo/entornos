/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tarea_1_4;

import java.util.Scanner;

/**
 *
 * @author laawa
 */
public class Act_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
         Scanner in = new Scanner(System.in);
         System.out.println("Escriba un número: ");
         int num1 = in.nextInt();
         System.out.println("Escriba otro mayor que el anterior: ");
         int num2 = in.nextInt();
         System.out.println("Escriba un número para mostrar sus divisores: ");
         int num3 = in.nextInt();
         i = num1;
         while (i <= num2){
             if (num3 % i == 0){
                 System.out.println(i);
             }
             i++;
         }
    }
    
}