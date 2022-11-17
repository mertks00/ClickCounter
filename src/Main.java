import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Click Counter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(Color.BLACK);
        JLabel label = new JLabel();
        label.setText("0");
        label.setBounds(290,150,200,60);

        JButton btn = new JButton();
        btn.setBounds(190,200,200,60);
        btn.setText("TIKLA");

        JButton rbtn = new JButton();
        rbtn.setBounds(235,270,100,30);
        rbtn.setText("Reset");

        btn.addActionListener(new ActionListener() {
            int c = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                     label.setText(String.valueOf(c++));
            }
        });

        frame.add(btn);
        frame.add(label);


        frame.setSize(600,600);
        frame.setLayout(null);
        frame.setVisible(true);

    }
}