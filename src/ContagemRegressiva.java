import java.util.Scanner;

public class ContagemRegressiva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inicial: ");
        int numeroInicial = scanner.nextInt();

        System.out.println("Contagem regressiva de " + numeroInicial + " até 0:");
        int contador = numeroInicial;
        while (contador >= 0) {
            System.out.println(contador);
            contador--;
        }
    }
}