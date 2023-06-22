import java.io.IOException;
import java.util.*;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
        Scanner timtim = new Scanner(System.in);
        int T = timtim.nextInt();
        int[] array = new int[1000];
        int i, j;
        for (  i = 0,j = 0; i < 1000; j++,i++) 
        {
            array[j] = j;
            if ((array[j]) == T) 
            {
                j = 0;
            }
            System.out.print("N["+i+"] = "+array[j]+"\n");
        }
 
    }
 
}
