/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repeticao03;

/**
 *
 * @author Luca
 */
public class Repeticao03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int cc = 1; cc <=10; cc++) {
            System.out.print(cc);
            if (cc != 10) {
                System.out.print(", ");
            } else {
                System.out.print(".\n - Fim da contagem!\n");
            }
        }
    }
    
}
