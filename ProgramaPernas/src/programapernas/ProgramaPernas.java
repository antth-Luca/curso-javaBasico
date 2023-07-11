/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programapernas;

import java.util.Scanner;

/**
 *
 * @author Luca
 */
public class ProgramaPernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tc = new Scanner(System.in);
        
        System.out.print("Quantas pernas tem seu animal?\nR: ");
        int pernas = (int) tc.nextInt();
        System.out.println("...");
        switch (pernas) {
            case 1:
                System.out.println("Certeza! É um Saci");
                break;
            case 2:
                System.out.println("O animal é bípede!");
                break;
            case 4:
                System.out.println("O animal é quadrúpede!");
                break;
            case 6:
                System.out.println("O animal é hexápode!");
                break;
            case 8:
                System.out.println("O animal é octópode!");
                break;
            default:
                System.out.println("Só pode ser alienígena O_O");
                break;
        }
    }
    
}
