package week10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JMovieFrame extends JFrame implements ActionListener {

    JButton east = new JButton("East");
    JButton west = new JButton("West");
    JButton south = new JButton("South");
    JButton north = new JButton("North");
    JLabel movie = new JLabel("Release date");

    final int HEIGHT = 200;
    final int WIDTH = 500;


    JMovieFrame(){
        super();
        setSize(WIDTH, HEIGHT);
        setLayout(new BorderLayout());

        add(BorderLayout.LINE_START, east);
        add(BorderLayout.LINE_END, west);
        add(BorderLayout.PAGE_END, south);
        add(BorderLayout.PAGE_START, north);

        add(BorderLayout.CENTER, movie);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        east.addActionListener(this);
        west.addActionListener(this);
        north.addActionListener(this);
        south.addActionListener(this);
    }

    public static void main(String[] args){
        new JMovieFrame().show();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        if (actionEvent.getSource() == north){
            movie.setText("North");
        }

        else if (actionEvent.getSource() == east){
            movie.setText("East");
        }

        else if (actionEvent.getSource() == south){
            movie.setText("South");
        }

        else if (actionEvent.getSource() == west){
            movie.setText("West");
        }
    }
}
