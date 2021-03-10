import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class UseOfChoise extends Applet implements ItemListener
{

    Choice c1;
    String s;

    public void init(){

        c1 = new Choice();
        c1.add("True");
        c1.add("False");

        add(c1);

        c1.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent ie){
        repaint();
    }

    public void paint(Graphics g){

        s = "Current Choice";
        s += c1.getSelectedItem();
        s += c1.getSelectedIndex();
        s += c1.getItemCount();

        g.drawString(s,6,120); // display text on screen
    }

}

/*
<applet code="UseOfChoise" width=900 height=900> </applet>
*/