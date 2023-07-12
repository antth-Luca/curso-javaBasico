/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex60;

import java.util.Scanner;

/**
 * 60: Faça um programa que leia um número qualquer e mostre o seu fatorial.
 * @author Luca
 */
public class Ex60 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tc = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro para verificar seu fatorial: ");
        int num, pedido;
        num = pedido = tc.nextInt();
        int result = 1;
        
        while (num != 0) {
            result *= num;
            num--;
        }
        System.out.printf("%s!= %s\n", pedido, result);
    }
    
}
