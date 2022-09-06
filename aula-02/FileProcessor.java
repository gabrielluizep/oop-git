import java.util.Scanner;

public class FileProcessor {
  public static String filter(String line, String regexp) {
    if (line.contains(regexp)) {
      return line;
    }

    return "";
  }

  void finish(Scanner teclado, String msg) {

  }

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    if (args.length < 1) {
      System.out.println("Insira um comando para executar (up, down, filter)");

      teclado.close();

      return;
    }

    switch (args[0]) {
      case "filter":
        if (args.length < 2) {
          System.out.println("Insira uma string que deseja filtrar");

          teclado.close();

          return;
        }

        while (teclado.hasNext()) {
          String finded = filter(teclado.nextLine(), args[1]);

          if (finded.length() > 0)
            System.out.println(finded);
        }
        break;

      case "up":
        while (teclado.hasNext()) {
          System.out.println(teclado.nextLine().toUpperCase());
        }
        break;

      case "down":
        while (teclado.hasNext()) {
          System.out.println(teclado.nextLine().toLowerCase());
        }
        break;

    }

    teclado.close();
  }
}
