/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex03;

import java.util.Scanner;

/**
 * 3: Crie um programa que leia dois números e mostre a soma entre eles.
 * @author Luca
 */
public class Ex03 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tc = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        int n1 = tc.nextInt();
        System.out.print("Digite o segundo número: ");
        int n2 = tc.nextInt();
        System.out.printf("A soma entre eles é de %s\n", n1 + n2);
    }
    
}
