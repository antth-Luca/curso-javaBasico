/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex07;

import java.util.Scanner;

/**
 * 7: Desenvolva um programa que leia as duas notas de um aluno, calcule e mostre a sua média.
 * @author Luca
 */
public class Ex07 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite a nota 1: ");
        float n1 = teclado.nextFloat();
        System.out.print("Digite a nota 2: ");
        float n2 = teclado.nextFloat();
        float m = (n1 + n2)/ 2;
        System.out.printf("A média entre as notas é de %.1f\n", m);
    }
    
}
