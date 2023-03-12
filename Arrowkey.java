import javax.swing.*;

public class ArrowKey {

    public ArrowKey() {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setFocusable(true);
    }

    public static void main(String[] args) {
        new ArrowKey();
    }
}
