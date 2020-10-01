package ejercicio_7;

/**
 * 7. Mostrar por pantalla los números del 1 al 100.
 *
 */
public class Ejercicio_7 {

    public static void main(String[] args) {
        int contador = 0;
        for (int i = 0; i <= 100; i++) {
            if (i == 100) {
                System.out.println(i + ".");
            }

            if (i < 100) {
                System.out.print(i + ",");
            }

            if(contador==10){
                System.out.println("");
                contador=0;
            }
            contador++;
        }
    }

}
