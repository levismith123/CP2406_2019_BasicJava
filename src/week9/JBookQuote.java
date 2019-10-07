package week9;
import java.awt.*;
import javax.swing.*;
public class JBookQuote {

    public static void main(String[] args){

        JFrame quote = new JFrame("Quote");
        JLabel bookQuote = new JLabel("Stuff");
        bookQuote.setFont(new Font("Arial", Font.BOLD, 16));
        quote.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        quote.setSize(250, 100);
        quote.setVisible(true);
        quote.add(bookQuote);
        //bookQuote.setText("Stuff");

    }

}
