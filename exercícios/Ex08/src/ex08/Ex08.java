/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex08;

import java.util.Scanner;

/**
 * 8: Escreva um programa que leia um valor em metros e o exiba convertido em centímetros e milímetros
 * @author Luca
 */
public class Ex08 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tc = new Scanner(System.in);
        
        System.out.print("Digite o valor em metros: ");
        float m = tc.nextFloat();
        float cm = m * 100;
        float mm = cm * 10;
        System.out.printf("%.2fm é igual a %.2fcm e %.2fmm\n", m, cm, mm);
    }
    
}
