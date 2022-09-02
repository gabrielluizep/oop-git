public class CalculoFatorial {

  public static int fatorial(int numero) {
    int fatorial = 1;

    for (int i = 1; i <= numero; i++) {
      fatorial *= i;
    }

    return fatorial;
  }

  public static void main(String[] args) {
    if (args.length > 0) {
      int soma = 0;

      for (int i = 0; i < args.length; i++) {
        int numero = Integer.parseInt(args[i]);

        int fatorial = fatorial(numero);

        System.out.println("Fatorial de " + numero + " é " + fatorial);

        soma += fatorial;
      }

      System.out.println("Soma dos fatoriais: " + soma);
    } else {
      System.out.println("Nenhum argumento foi passado.");
    }
  }

}
