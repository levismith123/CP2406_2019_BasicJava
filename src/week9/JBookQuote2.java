package week9;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JBookQuote2 extends JFrame implements ActionListener{


    JButton button = new JButton("get book");
    JLabel bookQuote = new JLabel("Stuff");
    final int WIDTH = 250;
    final int HEIGHT = 100;

    public JBookQuote2(){

        super("Hello");
        setSize(WIDTH, HEIGHT);
        setLayout(new FlowLayout());
        add(button);
        add(bookQuote);
        button.addActionListener(this);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args){
       new JBookQuote2().show();
    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        bookQuote.setText("Hitch Hikers guide to the galaxy");
    }
}
