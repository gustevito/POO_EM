import java.awt.*;
import javax.swing.*;

public class Menu {
    JFrame window;
    JPanel mainPanel, titlePanel, buttonPanel;
    JLabel title, subtitle;
    JButton enterButton, optionsButton, exitButton;

    Font titleFont = new Font("SansSerif", Font.BOLD, 32);
    Font buttonFont = new Font("SansSerif", Font.PLAIN, 16);

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Menu::new);
    }

    public Menu() {
        window = new JFrame("Pipoca & Guaraná");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(800, 600);
        window.setLocationRelativeTo(null);
        window.setResizable(false);

        mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(new Color(25, 25, 25));

        titlePanel = new JPanel();
        titlePanel.setBackground(new Color(25, 25, 25));
        title = new JLabel("Pipoca & Guaraná", SwingConstants.CENTER);
        title.setForeground(Color.WHITE);
        title.setFont(titleFont);
        titlePanel.add(title);
        subtitle = new JLabel("Seu cinema digital em Java Swing");
        subtitle.setForeground(Color.white);
        titlePanel.add(subtitle);

        buttonPanel = new JPanel();
        buttonPanel.setBackground(new Color(25, 25, 25));
        buttonPanel.setLayout(new GridLayout(3, 1, 0, 15));

        enterButton = createButton("Entrar");
        optionsButton = createButton("Opções");
        exitButton = createButton("Sair");

        buttonPanel.add(enterButton);
        buttonPanel.add(optionsButton);
        buttonPanel.add(exitButton);

        mainPanel.add(titlePanel, BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);
        mainPanel.setBorder(BorderFactory.createEmptyBorder(100, 200, 100, 200));

        window.add(mainPanel);
        window.setVisible(true);
    }

    private JButton createButton(String text) {
        JButton button = new JButton(text);
        button.setFont(buttonFont);
        button.setFocusPainted(false);
        button.setBackground(new Color(45, 45, 45));
        button.setForeground(Color.WHITE);
        button.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        return button;
    }
}
