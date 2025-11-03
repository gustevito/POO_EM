import java.awt.*;
import javax.swing.*;
import javax.swing.text.JTextComponent;

public class exercicioslide {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exercicio");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel menu = new JPanel(new GridLayout(1, 2, 10, 10));
        JTextField title = new JLabel("Detalhes Funcionario");

        JPanel grid1 = new JPanel(new GridLayout(2, 2));
        JLabel id = new JLabel("ID");
        JLabel nome = new JLabel("Nome");
        menu.add(title);
        menu.add(grid1);
        grid1.add(id);
        grid1.add(nome);

        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.PAGE_AXIS));
        contentPane.add(menu);
        contentPane.add(linha2);
        contentPane.add(linha3);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
