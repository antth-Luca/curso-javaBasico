/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex06;

import java.util.Scanner;

/**
 * 6: Crie um algoritmo que leia um número e mostre o seu dobro, triplo e raiz quadrada.
 * @author Luca
 */
public class Ex06 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tc = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int n = tc.nextInt();
        System.out.printf("Seu dobro é %s, seu triplo %s e a raiz quadrada é %s\n", 2 * n, 3 * n, Math.sqrt(n));
    }
}
