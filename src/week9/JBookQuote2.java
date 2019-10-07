package week9;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class JBookQuote2 implements ActionListener{

    public static void main(String[] args){

        JFrame quote = new JFrame("Quote");
        JLabel bookQuote = new JLabel("Stuff");
        JButton title = new JButton("getTitle");


        bookQuote.setFont(new Font("Arial", Font.BOLD, 16));
        quote.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        quote.setSize(250, 100);
        quote.setVisible(true);

        quote.add(bookQuote, BorderLayout.WEST);
        quote.add(title, BorderLayout.EAST);
        title.addActionListener(actionEvent -> {});

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        bookQuote.setText("Hitch Hikers guide to the galaxy");
    }
}
