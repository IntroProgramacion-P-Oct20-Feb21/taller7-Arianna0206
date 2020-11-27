/*
 * Generar la serie: +1/1-1/3+1/5-1/7+1/9 
 */
package ejemplos07;

/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    /**
     * 
     */
    public static void main(String[] args) {
        // variables 
        int numerador = 1;
        int denominador = 1;
        int contador = 1;
        
        while (contador<=5) { // 2<=5|V || 3<=5|V || 4<=5|V || 5<=5|V || 6<=5|F
            if((contador%2)==0){ // (1%2)==0 | Fal || (2%2)==0 | Ver || (3%2)==0|Fal || (4%2)==0 |Ver || (5%2)==0|Fal
                System.out.printf("%s%d/%d", "-", numerador, denominador); // -1/3 -1/7
            }else{
                System.out.printf("%s%d/%d", "+", numerador, denominador); // +1/1 +1/5 +1/9
            }
            contador = contador + 1; // 1+1=2| 2+1=3| 3+1=4| 4+1=5| 5+1=6
            denominador = denominador + 2; // 1+2=3| 3+2=5| 5+2=7| 7+2=9| 9+2=11
        }
        System.out.println(); // Impresión de una líneas en blanco
       
    }
    
}
