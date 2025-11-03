import java.awt.*;
import javax.swing.*;

public class hello {
    public static void main(String[] args) {
        JFrame frame = new JFrame("oi :->");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new FlowLayout());

        JLabel label = new JLabel("butao ->");
        contentPane.add(label);
        JButton button = new JButton("butao!");
        contentPane.add(button);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
