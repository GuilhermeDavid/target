import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int num = scanner.nextInt();

        if (ehFibonacci(num)) {
            System.out.println(num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(num + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }

    public static boolean ehFibonacci(int num) {
        int a = 0;
        int b = 1;

        while (b < num) {
            int temp = b;
            b = a + b;
            a = temp;
        }

        return b == num;
    }
}
