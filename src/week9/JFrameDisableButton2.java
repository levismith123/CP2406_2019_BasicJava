package week9;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class JFrameDisableButton2 extends JFrame implements ActionListener {


    JButton button = new JButton("Disable");
    JLabel label = new JLabel("Thats enough!");
    int buttonCount = 0;
    final int HEIGHT = 100;
    final int WIDTH = 250;

    JFrameDisableButton2(){
        super("Wassup 2");
        setSize(WIDTH, HEIGHT);
        setLayout(new FlowLayout());
        add(button);
        add(label);
        label.setVisible(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        button.addActionListener(this);
    }

    public static void main(String[] args){
        new JFrameDisableButton2().show();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        buttonCount++;
        if (buttonCount >= 8){
            button.setEnabled(false);
            label.setVisible(true);
        }
    }
}
