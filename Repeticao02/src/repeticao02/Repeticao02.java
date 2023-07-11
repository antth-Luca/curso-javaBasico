/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repeticao02;

/**
 *
 * @author Luca
 */
public class Repeticao02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cc = 0;
        do {
            cc++;
            System.out.print(cc);
            if (cc != 10) {
                System.out.print(", ");
            } else {
                System.out.print(".\n - Fim da contagem!\n");
            }
        } while (cc < 10);
    }
    
}
