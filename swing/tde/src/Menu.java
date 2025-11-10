import javax.swing.*;
import java.awt.*;

public class Menu {
    // main window
    JFrame window;
    Container con;

    // comps
    JPanel menuTitlePanel, menuButtonPanel;
    JLabel menuTitle;
    JButton menuButton, optionsButton;

    Font titleFont = new Font("Century", Font.PLAIN, 30);
    Font normalFont = new Font("Century", Font.PLAIN, 14);

    public static void main(String[] args) throws Exception {
        new Menu();
    }

    public Menu() {
        window = new JFrame("Pipoca & Guaraná");
        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(new FlowLayout());

        con = window.getContentPane();

        menuTitlePanel = new JPanel();
        menuTitlePanel.setBackground(Color.black);

        menuTitle = new JLabel("Pipoca & Guaraná");
        menuTitle.setFont(titleFont);
        menuTitle.setForeground(Color.white);

        menuButtonPanel = new JPanel();

        menuButton = new JButton("Entrar");
        // fazer grid com os botoes (n tem grid ainda)

        menuTitlePanel.add(menuTitle);

        con.add(menuTitlePanel);
        window.setVisible(true);
    }
}
