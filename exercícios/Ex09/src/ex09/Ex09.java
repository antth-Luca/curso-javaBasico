/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex09;

import java.util.Scanner;

/**
 * 9: Faça um programa que leia um número Inteiro qualquer e mostre na tela a sua tabuada.
 * @author Luca
 */
public class Ex09 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tc = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int num = tc.nextInt();
        for (int cont = 0; cont < 11; cont++) {
            System.out.printf("%s x %s = %s\n", cont, num, cont * num);
        }
    }
    
}
