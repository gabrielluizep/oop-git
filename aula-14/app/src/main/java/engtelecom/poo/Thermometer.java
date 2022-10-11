package engtelecom.poo;

/**
 * Esta classe representa um termômetro.
 */
public class Thermometer {

  private double currentTemperature;
  private double minTemperature;
  private double maxTemperature;
  private char defaultScale;

  /**
   * Construtor padrão.
   */
  public Thermometer(char scale, double currentTemperature, double minTemperature, double maxTemperature) {
    this.defaultScale = setDefaultScale(scale);
    this.currentTemperature = setCurrentTemperature(maxTemperature, minTemperature, currentTemperature);
    this.minTemperature = minTemperature;
    this.maxTemperature = maxTemperature;
  }

  public char getDefaultScale() {
    return defaultScale;
  }

  public char setDefaultScale(char scale) {
    if (scale == 'C' || scale == 'F' || scale == 'K') {
      this.defaultScale = scale;
      return this.defaultScale;
    }

    this.defaultScale = 'K';
    return this.defaultScale;
  }

  public double getCurrentTemperature() {
    return this.currentTemperature;
  }

  public double getCurrentTemperatureInScale(char scale) {
    return 0;
  }

  public double setCurrentTemperature(double temperature, double minTemperature, double maxTemperature) {
    return 0;
  }

  public double getMinTemperature() {
    return 0;
  }

  public double getMinTemperature(char scale) {
    return 0;
  }

  public double getMaxTemperature() {
    return 0;
  }

  public double getMaxTemperature(char scale) {
    return 0;
  }

  public double temperatureDifference(Thermometer other) {
    return 0;
  }

}
