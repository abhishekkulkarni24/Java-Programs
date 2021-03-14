import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class UseOfList extends Applet implements ItemListener
{

    List l1;String msg="";

    public void init(){

        l1 = new List();
        l1.add("Test1");
        l1.add("Test2");

        add(l1);

        l1.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent ie){
        repaint();
    }

    public void paint(Graphics g){

       msg = "Current State";
       msg+=l1.getSelectedItem();

        g.drawString(msg,6,120); // display text on screen
    }

}

/*
<applet code="UseOfList" width=900 height=900> </applet>
*/