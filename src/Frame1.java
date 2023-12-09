import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

class Frame1 extends Defult_frame {
    JTextField supject_num = new JTextField("Enter, Subjects number");
    JButton confirm = new JButton("Confirm");
    Frame1() {
        f.add(supject_num);
        supject_num.setFont(font1);
        supject_num.setBackground(Color.CYAN);
        supject_num.setBounds(100, 150, 300, 50);
        f.add(confirm);
        confirm.setFont(font);
        confirm.addActionListener(this);
        confirm.setBackground(Color.CYAN);
        confirm.setBounds(150, 300, 200, 50);
        backButton.setVisible(false);
        f.add(background1);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new Frame1();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == confirm) {
            try {
                int x=Integer.parseInt(supject_num.getText());
                f.setVisible(false);
                new Frame2(x);
            }catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(this, " only integers allowed");
            }
        }

    }
}
