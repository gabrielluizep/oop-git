import java.util.Scanner;

public class SplitPasswd {

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    while (teclado.hasNext()) {
      System.out.println(teclado.nextLine().split(":")[0]);
    }

    teclado.close();
  }
}
