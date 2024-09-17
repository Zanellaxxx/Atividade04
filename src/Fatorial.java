import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        int fatorial = 1;
        int contador = 1;
        System.out.print("Fatorial de " + numero + " = ");
        do {
            fatorial *= contador;
            contador++;
        } while (contador <= numero);
        System.out.println(fatorial);
    }
}