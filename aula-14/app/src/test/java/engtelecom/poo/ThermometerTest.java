package engtelecom.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ThermometerTest {

  @Test
  public void testContructor() {
    Thermometer t = new Thermometer('C', 0, -100, 100);

    assertEquals(100, t.getMaxTemperature());
    assertEquals(-100, t.getMinTemperature());

    assertEquals(273.15, t.getTemperatureInKelvin());
    assertEquals(32, t.getTemperatureInFahrenheit());
    assertEquals(0, t.getTemperatureInCelsius());
  }
}
