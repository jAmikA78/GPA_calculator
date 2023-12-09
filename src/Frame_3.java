import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Map;

public class Frame_3 extends Defult_frame {
    JLabel passed, failed, gpa;
    JLabel motivate = new JLabel("U can if u trust in yourself");
    int x;

    Frame_3(Map<String, String> map) {
        x = map.size();
        int AP = 0, A = 0, AM = 0, BP = 0, B = 0, BM = 0, CP = 0, C = 0, CM = 0, DP = 0, D = 0, DM = 0, F = 0, pass = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String grade = entry.getValue();
            if (grade.equals("A+")) AP++;
            else if (grade.equals("A")) A++;
            else if (grade.equals("A-")) AM++;
            else if (grade.equals("B+")) BP++;
            else if (grade.equals("B")) B++;
            else if (grade.equals("B-")) BM++;
            else if (grade.equals("C+")) CP++;
            else if (grade.equals("C")) C++;
            else if (grade.equals("C-")) CM++;
            else if (grade.equals("D+")) DP++;
            else if (grade.equals("D")) D++;
            else if (grade.equals("D-")) DM++;
            else if (grade.equals("F")) F++;
        }
        pass = AP + A + AM + BP + B + BM + CP + C + CM + DP + D + DM;
        double GPA = (AP * 4) + (A * 3.7) + (AM * 3.4) + (BP * 3.2) + (B * 3) + (BM * 2.8) + (CP * 2.6) + (C * 2.4) + (CM * 2.4) + (CM * 2.2) + (DP * 2) + (D * 1.5) + (D);
        GPA = GPA / map.size();
        passed = new JLabel(pass + " ,Passed Subjects");
        failed = new JLabel(F + " ,Failed subjects");
        gpa = new JLabel("Your GPA = " + GPA);

        f.add(passed);
        passed.setFont(font2);
        passed.setBackground(Color.CYAN);
        passed.setBounds(145, 100, 250, 50);

        f.add(failed);
        failed.setFont(font2);
        failed.setBackground(Color.CYAN);
        failed.setBounds(150, 200, 250, 50);

        f.add(gpa);
        gpa.setFont(font);
        gpa.setBackground(Color.CYAN);
        gpa.setBounds(150, 300, 250, 50);

        f.add(motivate);
        motivate.setFont(font1);
        motivate.setBackground(Color.CYAN);
        motivate.setBounds(100, 400, 400, 50);

        backButton.addActionListener(this);

        f.add(background1);
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == backButton) {
            f.setVisible(false);
            new Frame2(x);
        }
    }
}