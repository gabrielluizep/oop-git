package engtelecom.poo;

import org.fusesource.jansi.AnsiConsole;
import static org.fusesource.jansi.Ansi.*;
import static org.fusesource.jansi.Ansi.Color.*;

public class ProgressBar {

  private int progressBarSize;
  private char symbol;
  private Color color;
  private int progress;

  public ProgressBar(int size, char symbol, Color color) {
    this.progressBarSize = setProgressBarSize(size);
    this.symbol = symbol;
    this.color = color;
    this.progress = 0;
  }

  public int getSize() {
    return progressBarSize;
  }

  public int setProgressBarSize(int size) {
    if (this.progressBarSize < 20) {
      this.progressBarSize = 20;
    } else if (this.progressBarSize > 100) {
      this.progressBarSize = 100;
    } else {
      this.progressBarSize = size;
    }

    return this.progressBarSize;
  }

  public char getSymbol() {
    return symbol;
  }

  public void setSymbol(char symbol) {
    this.symbol = symbol;
  }

  public Color getColor() {
    return color;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  public int getProgress() {
    return progress;
  }

  private void incrementProgress() {
    var progressStep = 100 / progressBarSize;

    if (this.progress < 100) {
      this.progress += progressStep;
    }
  }

  public void iniciar(boolean hasProgress, String fileName, double fileSize) {
    AnsiConsole.systemInstall();
    System.out.println(ansi().eraseScreen().cursor(1, 1));

    String placeholder = "[";
    for (int i = 0; i < this.progressBarSize; i++) {
      placeholder += "-";
    }
    placeholder += "]";

    int startPosition = 2;

    if (fileName.length() > 0) {
      System.out.println(ansi().fg(BLUE).a(fileName + ':'));

      startPosition = fileName.length() + 4;
    }

    System.out.println(ansi().cursor(2, startPosition - 1).fg(BLUE).a(placeholder.toString()));

    for (int i = startPosition; i < this.progressBarSize + startPosition; i++) {
      incrementProgress();

      System.out.println(ansi().reset().cursor(2,
          i).fg(this.color).a(this.symbol));

      if (hasProgress) {
        System.out.println(
            ansi().cursor(2, startPosition + this.progressBarSize + 4).fg(this.color)
                .a(this.progress + "/100"));
      }

      try {
        Thread.sleep(100);
      } catch (Exception e) {
        System.out.println(e);
      }
    }

    System.out.println();
    AnsiConsole.systemUninstall();
  }

  public void iniciar(boolean hasProgress) {
    iniciar(hasProgress, "", 0);
  }

  public void iniciar() {
    iniciar(false, "", 0);
  }
}