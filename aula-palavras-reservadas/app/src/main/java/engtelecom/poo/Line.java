package engtelecom.poo;

public class Line {
  public static final int MAX_TICKNESS = 10;
  public static final int MIN_TICKNESS = 0;

  private int[] initialPoint;
  private int[] finalPoint;

  private int color;

  private int tickness; // max 10

  public Line(int[] initialPoint, int[] finalPoint, int color, int tickness) {
    this.initialPoint = initialPoint;
    this.finalPoint = finalPoint;
    this.color = color;
    this.tickness = setTickness(tickness);
  }

  public int setTickness(int tickness) {
    if (tickness >= MAX_TICKNESS) {
      this.tickness = MAX_TICKNESS;
    } else if (this.tickness <= MIN_TICKNESS) {
      this.tickness = MIN_TICKNESS;
    } else {
      this.tickness = tickness;
    }

    return this.tickness;
  }
}
