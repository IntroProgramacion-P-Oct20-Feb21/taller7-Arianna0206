/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String cadenaFinal = "";
        int contador = 3;
        int contador2 =1;
        int número = 2;
        cadenaFinal = String.format("%s%d ", cadenaFinal, número);
        do {
            número = número + contador;
            cadenaFinal = String.format("%s%d ", cadenaFinal, número);
            contador = contador + 2;
            
            contador2 = contador2 + 1;    
        }while (contador2 <=5);
        System.out.printf("%s\n", cadenaFinal);        
    }
    
}
