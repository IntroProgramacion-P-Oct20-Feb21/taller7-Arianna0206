/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String cadenaReporte = "";
        String cadenaEdades = "";
        String nombreJugador;
        String posicionCampo;
        double estatura;
        int edad;
        boolean bandera = true;
        String salir;
        int sumaEdades = 0;
        double sumaEstaturas = 0.0;
        int contadorIteraciones = 0;
        double promedioEdad;
        double promedioEstatura;
        cadenaReporte = String.format("%s%s\n", cadenaReporte,
                "Listado de Jugadores");
        
        do {
            System.out.println("Ingrese el nombre del Jugador: ");
            nombreJugador = entrada.nextLine();
            System.out.println("Ingrese la posición en el campo: ");
            posicionCampo = entrada.nextLine();
            System.out.println("Ingrese la edad del Jugador: ");
            edad = entrada.nextInt();
            System.out.println("Ingrese la estatura del jugador: ");
            estatura = entrada.nextDouble();
            
            sumaEdades = sumaEdades + edad;
            sumaEstaturas = sumaEstaturas + estatura;
            contadorIteraciones = contadorIteraciones + 1;
            
            cadenaReporte = String.format("%s%d\n", cadenaReporte,
                "Listado de Edades");

            cadenaReporte = String.format("%s%d.) %s -%s-, edad %d, %s%d "
                    + "estatura %.2f\n",
                    cadenaReporte,
                    contadorIteraciones,
                    nombreJugador,
                    posicionCampo,
                    edad,
                    cadenaEdades,
                    estatura);
            
  
            entrada.nextLine();
            System.out.println("Desea salir del ciclo; digite: si");
            salir = entrada.nextLine();
            if (salir.equals("si")) {
                bandera = false;
            }
        } while (bandera);
        promedioEdad = (double) sumaEdades / contadorIteraciones;
        promedioEstatura = sumaEstaturas / contadorIteraciones;

        cadenaReporte = String.format("%sPromedio de edades: %.2f\n",
                cadenaReporte, promedioEdad);

        cadenaReporte = String.format("%sPromedio de estaturas: %.2f\n",
                cadenaReporte, promedioEstatura);

        System.out.printf("%s\n", cadenaReporte);      
    }
}
