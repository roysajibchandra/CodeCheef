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
        long[] fib = new long[61];

        fib[0] = 0;
        fib[1] = 1;


        for(int i=2; i<=60; i++)
        {
            fib[i] = fib[i-2] + fib[i-1];

        }
        for(int j=0; j<T; j++)
        {
            int N = timtim.nextInt();
            System.out.println("Fib("+N+") = " +fib[N]);
        }
//        System.out.println(Arrays.toString(fib));

    }
}
