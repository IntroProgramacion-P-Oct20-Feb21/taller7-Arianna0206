/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String cadena = "";
        int numerador = 1;
        int contadordenominador = 3;
        double operación = 0;
        
        cadena = String.format("%s%d", cadena, numerador);
        operación = operación + numerador;
        
        for (int i = 1; i<= 7; i++) {
            if ((i%2) == 0){
                cadena = String.format("%s + %d/%d",
                        cadena,
                        numerador,
                        contadordenominador);
                operación = operación + (double)numerador/contadordenominador;
            }else{ 
                cadena = String.format("%s - %d/%d",
                        cadena,
                        numerador,
                        contadordenominador, 
                        operación);
                operación = operación - (double)numerador/contadordenominador;
            }
            contadordenominador = contadordenominador + 2;
            
            
        }   
        cadena = String.format("%s = %.2f",cadena, operación);
        System.out.printf("%s\n", cadena);    
    }
    
}
