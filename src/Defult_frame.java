import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Defult_frame extends JFrame implements ActionListener {
    JFrame f = new JFrame();
    //fonts
    Font font = new Font("ALGERIAN", Font.BOLD, 24);
    Font font1 = new Font("Serif", Font.BOLD, 26);
    Font font2 = new Font("Arial Black", Font.BOLD, 18);
    Font font3 = new Font("Arial ", Font.BOLD, 12);
    //pictures
    ImageIcon i1 = new ImageIcon("src/background1.jpg");
    ImageIcon icon = new ImageIcon("src/icon.png");
    JLabel background1 = new JLabel("", i1, JLabel.CENTER);
    ;
    JButton backButton = new JButton("<<");

    Defult_frame() {
        backButton.setBounds(10, 10, 50, 30);

        background1.setBounds(0, 0, 500, 600);
        f.setLayout(null);
        f.setVisible(false);
        f.setResizable(false);
        f.setIconImage(icon.getImage());
        f.setBounds(400, 200, 500, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(backButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
