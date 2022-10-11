package engtelecom.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ThermometerTest {

  @Test
  public void testContructor() {
    Thermometer t = new Thermometer('C', 0, 0, 0);
    /**
     * Temperatura mínima não pode ser maior que a máxima;
     * Temperatura atual precisa estar no intervalo entre a mínima e a máxima;
     * Escala tem que ser um dos seguintes caracteres: C, F ou K;
     */
    assertEquals('C', t.getDefaultScale());
    assertEquals(0, t.getCurrentTemperature());
    assertEquals(0, t.getMaxTemperature());
    assertEquals(0, t.getMinTemperature());
  }
}
