package ejercicioGuiaExtra;

import java.util.*;

/**
 *
 * @author david
 */
public class Ejercicio23_sopaLetras {

    /*Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
      que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
      20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
      será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
      rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
      por pantalla la sopa de letras creada.
      Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
      de Java substring(), Length() y Math.random().*/
    public static void main(String[] args) {
        // TODO code application logic here
        int escribe = 0, inicio;
        Scanner leer = new Scanner(System.in);
        String[] palabras = new String[5];
        int[] lugares = new int[5];
        String[][] sopa = new String[20][20];

        fill(sopa);

        do {
            System.out.print("Escriba la palabra " + (escribe + 1) + ": ");
            palabras[escribe] = leer.nextLine();
            if (palabras[escribe].length() > 2) {
                if (palabras[escribe].length() < 6) {
                    escribe++;
                } else {
                    System.out.println("Su palabra es muy larga, escriba una de 5 caracteres o menos");
                }
            } else {
                System.out.println("Su palabra es muy corta, escriba una de 3 caracteres o más");
            }
        } while (escribe < 5);

        posicionarY(lugares);
        for (int i = 0; i < lugares.length; i++) {
            inicio = posicionarX(sopa[i].length, palabras[i].length());
            for (int j = 0; j < palabras[i].length(); j++) {
                sopa[lugares[i]][j + inicio] = palabras[i].substring(j, j + 1);
            }
        }
        print(sopa);
    }

    public static void print(String[][] A) {
        System.out.println("\nSopa de Letras\n");
        for (String[] fila : A) {
            System.out.println(Arrays.toString(fila));
        }
    }

    public static String[][] fill(String[][] A) {

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                if (A[i][j] == null) {
                    A[i][j] = Integer.toString((int) (Math.random() * 10));
                }
            }
        }
        return A;
    }

    //Crear arreglo de posiciones de las palabras
    public static void posicionarY(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = new Random().nextInt(20);
        }
        //System.out.println(Arrays.toString(vector));
        valoresDiferentes(vector);
    }

    public static int posicionarX(int size, int word) {
        return new Random().nextInt(size - word);
    }

    //Hacer todos los números del vector diferentes
    public static void valoresDiferentes(int[] vector) {
        boolean diferentes = false;
        int diferencias;
        while (!diferentes) {
            diferencias = 0;
            for (int i = 0; i < vector.length; i++) {
                for (int j = 0; j < vector.length; j++) {
                    if (i != j && vector[i] == vector[j]) {
                        vector[i] = new Random().nextInt(20);
                    } else {
                        diferencias++;
                    }
                }
                if (diferencias == vector.length) {
                    diferentes = true;
                }
            }
        }
        //System.out.println(Arrays.toString(vector));
    }
}
