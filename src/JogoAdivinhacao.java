import java.util.Scanner;
import java.util.Random;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1;
        int tentativa = 0;

        while (true) {
            System.out.print("Tente adivinhar o número (entre 1 e 100): ");
            int numeroDigitado = scanner.nextInt();

            if (numeroDigitado < numeroAleatorio) {
                System.out.println("O número é maior que " + numeroDigitado);
            } else if (numeroDigitado > numeroAleatorio) {
                System.out.println("O número é menor que " + numeroDigitado);
            } else {
                System.out.println("Parabéns! Você acertou o número em " + (tentativa + 1) + " tentativas.");
                break;
            }

            tentativa++;
        }
    }
}