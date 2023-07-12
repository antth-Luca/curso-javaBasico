/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex36;

import java.util.Scanner;

/**
 * 36: Escreva um programa para aprovar o empréstimo bancário para a compra de uma casa. Pergunte o valor da casa, o salário
 * do comprador e em quantos anos ele vai pagar. A prestação mensal não pode exceder 30% do salário ou então o empréstimo será negado.
 * @author Luca
 */
public class Ex36 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tc = new Scanner(System.in);
        
        System.out.print("Qual o valor da casa que pretende comprar?\nR$ ");
        float v_casa = tc.nextFloat();
        System.out.print("E o valor do seu salário?\nR$ ");
        float v_sal = tc.nextFloat();
        System.out.print("Em quantos anos pretende pagar o empréstimo?\nR: ");
        int anos = tc.nextInt();
        
        float v_parcela = v_casa / (anos * 12);
        
        System.out.printf("O valor das parcelas serão de %s vezes de %.2f", anos * 12, v_parcela);
        if (v_parcela > (0.3 * v_sal)) {
            System.out.print(" que excedem 30% do seu salário. Empréstimo NEGADO!\n");
        } else {
            System.out.print(". Espréstimo APROVADO! Dirija-se ao gerente para mais detalhes.\n");
        }
    }
    
}
