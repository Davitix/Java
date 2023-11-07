package numeros;

import java.util.*;

/**
 *
 * @author david
 */
public class Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        List<Integer> nums = new ArrayList<>();
        int suma = 0;
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese números, o escriba -99 para terminar: ");
        int num = Integer.parseInt(leer.nextLine());
        while (num != -99) {
            nums.add(num);
            suma += num;
            System.out.print("Ingrese un número: ");
            num = Integer.parseInt(leer.nextLine());
        }
        //Imprimir arreglo de números
        System.out.print("\nNumeros: " + Arrays.toString(nums.toArray()));
        
        //Imprimir con forEach        
        //nums.forEach((number) -> {System.out.print(number+" ");});
        
        System.out.println("\nLa suma de los números es: " + suma + ", y su promedio: " + suma / nums.size());
    }
}
