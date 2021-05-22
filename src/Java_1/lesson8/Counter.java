package Java_1.lesson8;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.MatteBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Counter extends JFrame {
    private int counter = 0;


    public static void main(String[] args) {
        EventQueue.invokeLater(Counter::new);

//        То же самое, но не так оптимально
//        EventQueue.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                new Counter();
//            }
//        });

    }


    public Counter() {
        setTitle("Simple counter");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(350, 150);
//        setLocation(100, 100);
//        setBounds(100, 100, 350, 150);
        setAlwaysOnTop(true);


        setLayout(new GridLayout(2,3));


        Font font = new Font("Trebuchet MS", Font.BOLD, 14);
        int padding = 3;
        //        Border myBorder = BorderFactory.createLineBorder(Color.lightGray);
        Border mainBorder = BorderFactory.createCompoundBorder(
                new EtchedBorder(),
                new EmptyBorder(padding, padding, padding, padding)
        );
        Border noRightBorder = BorderFactory.createCompoundBorder(
                new MatteBorder(0, 0, 0, 0, Color.lightGray),
                new EmptyBorder(padding, padding, padding, padding)
        );


//        Buttons creation
        JButton btnClear = new JButton("Clear");
        JLabel stepLabel = new JLabel("Counter step:");
        JTextField stepField = new JTextField("1");
        JButton btnDecrease = new JButton("<");
        JLabel resultField = new JLabel(String.valueOf(counter));
        JButton btnIncrease = new JButton(">");


//        Set Fonts
        btnClear.setFont(font);
        stepLabel.setFont(font);
        stepField.setFont(font);
        btnDecrease.setFont(font);
        resultField.setFont(font);
        btnIncrease.setFont(font);


//        Set Alignments
        stepLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        stepField.setHorizontalAlignment(SwingConstants.CENTER);
        resultField.setHorizontalAlignment(SwingConstants.CENTER);


//        Set Borders
        btnClear.setBorder(mainBorder);
        stepLabel.setBorder(noRightBorder);
        stepField.setBorder(mainBorder);
        btnDecrease.setBorder(mainBorder);
        resultField.setBorder(mainBorder);
        btnIncrease.setBorder(mainBorder);


//        Buttons addition
        add(btnClear);
        add(stepLabel);
        add(stepField);
        add(btnDecrease);
        add(resultField);
        add(btnIncrease);


//        Action Listeners
        btnDecrease.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter -= stringToInteger(stepField);
                updateLabel(resultField);
            }
        });

        btnIncrease.addActionListener(e -> {
            counter += stringToInteger(stepField);
            updateLabel(resultField);
        });

        btnClear.addActionListener(e -> {
            counter = 0;
            stepField.setText("1");
            updateLabel(resultField);

            System.out.println(
                "Settings are reset to basic: " + System.lineSeparator() +
                "counter: " + resultField.getText() + System.lineSeparator() +
                "counter step: " + stepField.getText()
            );
        });

        setVisible(true);
    }


    private int stringToInteger(JTextField textField) {
        return Integer.parseInt(textField.getText());
    }


    private void updateLabel(JLabel labelField) {
        labelField.setText(String.valueOf(counter));
    }

}
