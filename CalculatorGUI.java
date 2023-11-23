import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class CalculatorGUI extends JFrame implements ActionListener {
    JLabel lblNumber1 = new JLabel("Number 1 : ");
    JLabel lblNumber2 = new JLabel("Number 2 : ");
    JLabel lblAnswer = new JLabel("Answer : ");
    JLabel lblStatus = new JLabel();

    JTextField txtNumber1 = new JTextField();
    JTextField txtNumber2 = new JTextField();
    JTextField txtAnswer = new JTextField();

    JButton btnAdd = new JButton("+");
    JButton btnSub = new JButton("-");
    JButton btnMul = new JButton("*");
    JButton btnClear = new JButton("CLEAR");

    public CalculatorGUI(String Title) {
        super(Title);
        setSize(300, 300);

        JPanel dataIO = new JPanel(new GridLayout(3, 2));
        dataIO.add(lblNumber1);
        dataIO.add(txtNumber1);
        dataIO.add(lblNumber2);
        dataIO.add(txtNumber2);
        dataIO.add(lblAnswer);
        dataIO.add(txtAnswer);

        btnAdd.addActionListener(this);
        btnSub.addActionListener(this);
        btnMul.addActionListener(this);
        btnClear.addActionListener(this);

        JPanel math = new JPanel(new FlowLayout());
        math.add(btnAdd);
        math.add(btnSub);
        math.add(btnMul);
        math.add(btnClear);

        add(dataIO, BorderLayout.NORTH);
        add(math, BorderLayout.SOUTH);
        add(lblStatus, BorderLayout.CENTER);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae) {
        int number1 = Integer.parseInt(txtNumber1.getText());
        int number2 = Integer.parseInt(txtNumber2.getText());

        if (ae.getSource() == btnAdd) {
            int ans = number1 + number2;
            txtAnswer.setText(String.valueOf(ans));
            lblStatus.setText(number1 + " + " + number2 + " = " + ans);
        } else if (ae.getSource() == btnSub) {
            int ans = number1 - number2;
            txtAnswer.setText(String.valueOf(ans));
            lblStatus.setText(number1 + " - " + number2 + " = " + ans);
        } else if (ae.getSource() == btnMul) {
            int ans = number1 * number2;
            txtAnswer.setText(String.valueOf(ans));
            lblStatus.setText(number1 + " * " + number2 + " = " + ans);
        } else if (ae.getSource() == btnClear) {
            txtAnswer.setText("");
            txtNumber1.setText("");
            txtNumber2.setText("");
            lblStatus.setText("CLEARED!!");
        }
    }

    public static void main(String[] args) {
        CalculatorGUI m = new CalculatorGUI("MATH-CALCULATOR!!");
    }
}
