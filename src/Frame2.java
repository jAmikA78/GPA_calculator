import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class Frame2 extends Defult_frame {
    JButton save = new JButton("Save"), confirm = new JButton("Confirm");
    JComboBox sub;
    JComboBox<String> GPA = new JComboBox<>(new String[]{"A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "F"});
    Map<String, String> map = new HashMap<>();
    int x;

    /**
     * @param sup_num
     */
    Frame2(int sup_num) {
        x = sup_num;
        Vector<String> v = new Vector<>(sup_num);
        for (int i = 0; i < sup_num; i++) {
            String str = Integer.toString(i + 1);
            v.add("Subject number " + str);
        }
        sub = new JComboBox(v);
        f.add(sub);
        sub.setFont(font2);
        sub.setBackground(Color.cyan);
        sub.setBounds(125, 75, 250, 50);
        f.add(GPA);
        GPA.setFont(font2);
        GPA.setBackground(Color.cyan);
        GPA.setBounds(125, 205, 250, 50);
        f.add(save);
        save.setFont(font);
        save.addActionListener(this);
        save.setBackground(Color.CYAN);
        save.setBounds(150, 335, 200, 50);
        f.add(confirm);
        confirm.setFont(font);
        confirm.addActionListener(this);
        confirm.setBackground(Color.CYAN);
        confirm.setBounds(150, 465, 200, 50);
        f.add(background1);
        f.setVisible(true);
        backButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == save) {
            map.put((String) sub.getSelectedItem(), (String) GPA.getSelectedItem());
        } else if (e.getSource() == confirm) {
            if (map.size() == x) {
                f.setVisible(false);
                Frame_3 f3=new Frame_3(map);
            } else {
                JOptionPane.showMessageDialog(this, "you must enter all grades");
            }
        } else if (e.getSource()==backButton) {
            f.setVisible(false);
            new Frame1();
        }
    }
}
