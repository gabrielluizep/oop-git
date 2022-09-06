import java.util.Scanner;

public class ProcessaEntrada {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    while (teclado.hasNext()) {
      System.out.println(teclado.nextLine().toUpperCase());
    }

    teclado.close();
  }
}
