/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ex02;

/*02: Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boas-vindas.*/

import java.util.Scanner;
public class Ex02 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tc = new Scanner(System.in);
        
        System.out.println("Olá, qual é o seu nome?\nR: ");
        String nome = tc.nextLine();
        System.out.printf("Seja bem vindo, %s, aos exercícios de Java!\n", nome);
    }
    
}
