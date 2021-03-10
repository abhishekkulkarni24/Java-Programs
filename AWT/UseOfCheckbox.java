import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class UseOfCheckbox extends Applet implements ItemListener
{

    Checkbox c1,c2,c3,c4,c5;
    CheckboxGroup cg;
    String msg="";

    public void init(){

      c1 = new Checkbox();
      c2 = new Checkbox("A");
      c3 = new Checkbox("B",true);
      c4 = new Checkbox("C",true,cg);
      c5 = new Checkbox("D",cg,false);

      add(c1);
      add(c2);
      add(c3);
      add(c4);
      add(c5);

      c1.addItemListener(this);
      c2.addItemListener(this);
      c3.addItemListener(this);
      c4.addItemListener(this);
      c5.addItemListener(this);
      
    }

    public void itemStateChanged(ItemEvent ie){
        repaint();
    }

    public void paint(Graphics g){

        msg = "Current State";
        
        g.drawString(msg+"   "+c1.getState(),6,120);
        g.drawString(msg+"   "+c3.getLabel(),6,220);
    }

}

/*
<applet code="UseOfCheckbox" width=900 height=900> </applet>
*/