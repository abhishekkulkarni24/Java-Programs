import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class ImplementScrollbar extends Applet implements AdjustmentListener
{

    Scrollbar s1,s2;

    public void init(){

        setLayout(null);
        s1 = new Scrollbar(Scrollbar.VERTICAL,12,1,0,140);
        s1.setBounds(100,100,50,100);

        s2 = new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,110);
        s2.setBounds(200,200,150,100);

        add(s1);
        add(s2);

        s1.addAdjustmentListener(this);
        s2.addAdjustmentListener(this);
    }

    public void adjustmentValueChanged(AdjustmentEvent ae){
        repaint();
    }

    public void mouseDragged(MouseEvent m){

       int x = m.getX();
       int y = m.getY();

       s1.setValue(x);
       s2.setValue(y);

       repaint();

    }

    public void paint(Graphics g){

      Color c1 = new Color(s1.getValue(),s2.getValue(),56);
      setBackground(c1);
    }

}

/*
<applet code="ImplementScrollbar" width=900 height=900> </applet>
*/