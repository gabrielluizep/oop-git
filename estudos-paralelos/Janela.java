import javax.swing.JFrame;

/**
 * Janela
 */
public class Janela {

  public static void main(String[] args) {

    JFrame frame = new JFrame();
    frame.setSize(800, 500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setTitle("Example Frame");
    frame.setVisible(true);

  }
}