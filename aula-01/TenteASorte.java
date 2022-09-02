import java.util.Random;
import java.util.Scanner;

public class TenteASorte {
  public static void main(String[] args) {
    Random r = new Random();

    int numeroSorteado = r.nextInt(10) + 1;

    Scanner teclado = new Scanner(System.in);

    System.out.print("Tente a sorte, entre com um número de (1 a 10): ");

    int numeroTentativa;
    do {
      numeroTentativa = teclado.nextInt();

      if (numeroTentativa == numeroSorteado) {
        System.out.println("Parabéns, você acertou!");
      } else {
        System.out.println("Que pena, você errou! Tente novamente");
      }

    } while (numeroTentativa != numeroSorteado);

    teclado.close();
  }
}
