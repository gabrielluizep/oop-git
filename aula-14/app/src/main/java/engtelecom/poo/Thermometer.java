package engtelecom.poo;

/**
 * Esta classe representa um termômetro.
 */
public class Thermometer {
  private char scale;
  private double currentTemperature;
  private double minTemperature;
  private double maxTemperature;

  /**
   * Construtor da classe Thermometer.
   * 
   * @param scale              Escala de temperatura (C, F ou K)
   * @param currentTemperature Temperatura atual
   * @param minTemperature     Temperatura mínima
   * @param maxTemperature     Temperatura máxima
   */

  public Thermometer(char scale, double currentTemperature, double minTemperature, double maxTemperature) {
    this.scale = setScale(scale);
    this.currentTemperature = setCurrentTemperature(currentTemperature);
    this.minTemperature = setMinTemperature(minTemperature);
    this.maxTemperature = setMaxTemperature(maxTemperature);
  }

  /**
   * Retorna a escala de temperatura padrão.
   * 
   * @return Escala de temperatura padrão
   */
  public char getScale() {
    return scale;
  }

  /**
   * Retorna a temperatura máxima baseado na escla.
   * 
   * @return Temperatura atual
   */
  public double getMaxTemperature() {
    if (scale == 'F') {
      return convertKelvinToFarenheit(this.maxTemperature);
    }

    if (scale == 'C') {
      return convertKelvinToCelsius(this.maxTemperature);
    }

    return maxTemperature;
  }

  public char setScale(char scale) {
    if (scale == 'K' || scale == 'F' || scale == 'C') {
      return this.scale = scale;
    }

    return this.scale = 'K';
  }

  public double setCurrentTemperature(double currentTemperature) {
    if (scale == 'F') {
      return this.currentTemperature = convertFarenheitToKelvin(currentTemperature);
    }

    if (scale == 'C') {
      return this.currentTemperature = convertCelsiusToKelvin(currentTemperature);
    }

    return this.currentTemperature = currentTemperature;
  }

  private double setMinTemperature(double minTemperature) {
    if (scale == 'F') {
      return this.minTemperature = convertFarenheitToKelvin(minTemperature);
    }

    if (scale == 'C') {
      return this.minTemperature = convertCelsiusToKelvin(minTemperature);
    }

    return this.minTemperature = minTemperature;
  }

  private double setMaxTemperature(double maxTemperature) {
    if (scale == 'F') {
      return this.maxTemperature = convertFarenheitToKelvin(maxTemperature);
    }

    if (scale == 'C') {
      return this.maxTemperature = convertCelsiusToKelvin(maxTemperature);
    }

    return this.maxTemperature = maxTemperature;
  }

  /**
   * Retorna a temperatura mínima.
   * 
   * @return Temperatura atual
   */
  public double getMinTemperature() {
    if (scale == 'F') {
      return convertKelvinToFarenheit(minTemperature);
    }

    if (scale == 'C') {
      return convertKelvinToCelsius(minTemperature);
    }

    return minTemperature;
  }

  /**
   * Retorna a temperatura atual em Celsius.
   * 
   * @return Temperatura atual em Celsius
   */
  public double getTemperatureInKelvin() {
    return this.currentTemperature;
  }

  /**
   * Retorna a temperatura atual em Fahrenheit.
   * 
   * @return Temperatura atual em Fahrenheit
   */

  public double getTemperatureInFahrenheit() {
    return convertKelvinToFarenheit(this.currentTemperature);
  }

  /**
   * Retorna a temperatura atual em Celsius.
   * 
   * @return Temperatura atual em Celsius
   */
  public double getTemperatureInCelsius() {
    return convertKelvinToCelsius(this.currentTemperature);
  }

  private double convertKelvinToCelsius(double k) {
    return k - 273.15;
  }

  private double convertKelvinToFarenheit(double k) {
    return (k - 273.15) * 9 / 5 + 32;
  }

  private double convertCelsiusToKelvin(double c) {
    return c + 273.15;
  }

  private double convertFarenheitToKelvin(double f) {
    return (f - 32) * 5 / 9 + 273.15;
  }
}
