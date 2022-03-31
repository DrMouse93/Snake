import javax.swing.*;

public class Menu extends JFrame {
    JPanel panel = new JPanel();


    public Menu() {
        this.setBounds(100, 100, 250, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setBounds(100, 100, 250, 100);
        add(panel);

    }
}
