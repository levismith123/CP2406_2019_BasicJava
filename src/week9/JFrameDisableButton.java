package week9;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class JFrameDisableButton extends JFrame implements ActionListener {


    JButton button = new JButton("Disable");
    final int HEIGHT = 100;
    final int WIDTH = 250;

    JFrameDisableButton(){
        super("Wassup");
        setSize(WIDTH, HEIGHT);
        setLayout(new FlowLayout());
        add(button);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        button.addActionListener(this);
    }

    public static void main(String[] args){
        new JFrameDisableButton().show();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        button.setEnabled(false);
    }
}
