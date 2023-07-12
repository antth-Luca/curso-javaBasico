/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex05;

import java.util.Scanner;

/**
 * 5: Faça um programa que leia um número Inteiro e mostre na tela o seu sucessor e seu antecessor.
 * @author Luca
 */
public class Ex05 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = tc.nextInt();
        System.out.printf("Seu antecessor é %s e seu sucessor é %s\n", n - 1, n + 1);
    }
    
}
