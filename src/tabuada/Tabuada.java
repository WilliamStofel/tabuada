/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabuada;
import java.util.Scanner;
/**
 *
 * @author 082170033
 */
public class Tabuada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          int num;
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite um número para calcular a tabuada: ");
        num = sc.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            System.out.println( num + "*" + i + "=" + i*num );
        }
    }
    
}
