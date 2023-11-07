/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exce02;

/**
 *
 * @author david
 */
public class EXCE02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String[] palabra = new String[4];
        
        try {
            for (int i = 0; i < 10; i++) {
                palabra[i]=String.valueOf(i);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Está intentando agregar más valores que los que el arreglo recibe.");
        }
    }
    
}
