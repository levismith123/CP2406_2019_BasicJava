package week9;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JVacationRental extends JFrame {
    ButtonGroup locations = new ButtonGroup();
    JCheckBox rent1 = new JCheckBox("Parkside for $600 per week");
    JCheckBox rent2 = new JCheckBox("Poolside for $750 per week");
    JCheckBox rent3 = new JCheckBox("Lakeside for $825 per week");

    ButtonGroup bedrooms = new ButtonGroup();
    JCheckBox oneBedroom = new JCheckBox("One bedroom for no extra cost");
    JCheckBox twoBedrooms = new JCheckBox("Two bedrooms for an extra $75");
    JCheckBox threeBedrooms = new JCheckBox("Three bedrooms for an extra $150");

    ButtonGroup meals = new ButtonGroup();
    JCheckBox mealsYes = new JCheckBox("Meals included for an extra $200");
    JCheckBox mealsNo = new JCheckBox("Meals not included");


    final int HEIGHT = 250;
    final int WIDTH = 700;

    JVacationRental(){
        super("Lambert's Vacation Rentals");
        setSize(WIDTH, HEIGHT);
        setLayout(new FlowLayout());

        add(rent1);
        add(rent2);
        add(rent3);

        locations.add(rent1);
        locations.add(rent2);
        locations.add(rent3);

        add(oneBedroom);
        add(twoBedrooms);
        add(threeBedrooms);

        bedrooms.add(oneBedroom);
        bedrooms.add(twoBedrooms);
        bedrooms.add(threeBedrooms);

        add(mealsYes);
        add(mealsNo);

        meals.add(mealsYes);
        meals.add(mealsNo);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args){
        new JVacationRental().show();
    }
}
