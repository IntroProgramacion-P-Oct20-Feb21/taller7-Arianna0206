/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String cadenaFinal = "";
        int contador = 1;
        int contador2 = 2;
        int contador3 = 1;
        int número;
        do {
            número = (contador * contador2);
            cadenaFinal = String.format("%s%d ", cadenaFinal, número);
            contador = contador + 1;
            contador2 = contador2 + 1;  
            contador3 = contador3 + 1;
        }while (contador3 <= 10);  
        System.out.printf("%s\n", cadenaFinal);    
    }
    
}
