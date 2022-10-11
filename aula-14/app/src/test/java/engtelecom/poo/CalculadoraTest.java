package engtelecom.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {

  @Test
  public void testarSoma() {
    Calculadora calc = new Calculadora();

    assertEquals(2, calc.somar(1, 1));
    assertEquals(3, calc.somar(2, 1));
    assertEquals(3, calc.somar(1, 2));

    assertEquals(-2, calc.somar(-1, -1));
    assertEquals(-3, calc.somar(-2, -1));
    assertEquals(-3, calc.somar(-1, -2));

    assertEquals(2, calc.somar(0, 2));
    assertEquals(2, calc.somar(2, 0));
  }

}
