package week10;

import javax.swing.*;
import java.awt.*;

public class JFlexiblePanel extends JPanel {


    JFlexiblePanel(Color foreground, Color background, Font font, String string){

        super();
        setForeground(foreground);
        setBackground(background);
        JLabel message = new JLabel(string);
        add(message);
        message.setFont(font);

    }


}
