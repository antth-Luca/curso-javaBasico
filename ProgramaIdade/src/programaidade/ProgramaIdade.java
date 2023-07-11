/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programaidade;

import java.util.Scanner;

/**
 *
 * @author Luca
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o ano de nascimento: ");
        int ano_nasc = (int) teclado.nextInt();
        int idade = (int) 2023 - ano_nasc;
        if (idade >= 18) {
            System.out.printf("%s anos é Maior de idade\n", idade);
        } else {
            System.out.printf("%s anos é Menor de idade\n", idade);
        }
    }
    
}
