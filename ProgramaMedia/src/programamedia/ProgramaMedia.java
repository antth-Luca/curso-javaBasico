/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programamedia;

import java.util.Scanner;

/**
 *
 * @author Luca
 */
public class ProgramaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Qual o nome do aluno? ");
        String nome = teclado.nextLine();
        System.out.printf("Digite a primeira nota de %s: ", nome);
        float n1 = (float) teclado.nextFloat();
        System.out.printf("Digite a segunda nota de %s: ", nome);
        float n2 = (float) teclado.nextFloat();
        float m = (n1 + n2)/2;
        System.out.printf("A media de %s e de %.1f \n", nome, m);
        if (m >= 8) {
            System.out.println("Parabens ao aluno, uma nota boa!");
        }
    }
    
}
