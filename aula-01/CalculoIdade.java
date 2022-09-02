import java.time.LocalDate;
import java.util.Scanner;

public class CalculoIdade {

  public static void main(String[] args) {

    String nome;
    int anoNascimento;
    int anoAtual = LocalDate.now().getYear();

    Scanner teclado = new Scanner(System.in);

    System.out.print("Entre com o seu nome: ");
    nome = teclado.nextLine();

    System.out.print("Entre com o ano de nascimento: ");
    anoNascimento = teclado.nextInt();

    System.out.println(nome + " sua idade atual é de " + (anoAtual - anoNascimento) + " anos.");

    teclado.close();
  }

}
