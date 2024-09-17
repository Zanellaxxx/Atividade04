import java.util.Scanner;
import java.util.InputMismatchException;

public class ValidacaoEntrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade = 0;
        boolean idadeValida = false;

        while (!idadeValida) {
            try {
                System.out.print("Digite sua idade: ");
                idade = scanner.nextInt();

                if (idade > 0) {
                    idadeValida = true;
                } else {
                    System.out.println("Idade inválida. Por favor, digite uma idade maior que 0.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                scanner.next();
            }
        }

        System.out.println("Idade válida: " + idade);
    }
}