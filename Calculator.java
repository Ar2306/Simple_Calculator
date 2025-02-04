import java.awt.*;
import java.awt.event.*;

class Calculator extends Frame implements ActionListener {
    Frame f = new Frame();
    Label l1 = new Label("first number");
    Label l2 = new Label("second number");
    Label l3 = new Label("result");
    TextField t1 = new TextField();
    TextField t2 = new TextField();
    TextField t3 = new TextField();
    Button b1 = new Button("add");
    Button b2 = new Button("sub");
    Button b3 = new Button("multiply");
    Button b4 = new Button("divide");
    Button b5 = new Button("cancel");

    Calculator() {
        l1.setBounds(50, 100, 100, 20);
        l2.setBounds(50, 140, 100, 20);
        l3.setBounds(50, 180, 100, 20);
        t1.setBounds(160, 100, 100, 20);
        t2.setBounds(160, 140, 100, 20);
        t3.setBounds(160, 180, 100, 20);
        b1.setBounds(50, 250, 100, 20);
        b2.setBounds(160, 250, 100, 20);
        b3.setBounds(270, 250, 100, 20);
        b4.setBounds(50, 280, 100, 20);
        b5.setBounds(160, 280, 100, 20);

        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);

        f.setLayout(null);
        f.setSize(400, 350);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int n1 = Integer.parseInt(t1.getText());
        int n2 = Integer.parseInt(t2.getText());

        if (e.getSource() == b1) {
            t3.setText(String.valueOf(n1 + n2));
        }
        if (e.getSource() == b2) {
            t3.setText(String.valueOf(n1 - n2));
        }
        if (e.getSource() == b3) {
            t3.setText(String.valueOf(n1 * n2));
        }
        if (e.getSource() == b4) {
            if (n2 != 0) {
                t3.setText(String.valueOf((double) n1 / n2));
            } else {
                t3.setText("Cannot divide by zero");
            }
        }
        if (e.getSource() == b5) {
            System.exit(0);
        }
    }

    public static void main(String args[]) {
        new Calculator();
    }
}
