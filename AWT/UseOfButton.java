import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class UseOfButton extends Applet
{

   Button b1,b2;

    public void init(){

      b1 = new Button();
      b2 = new Button("Name");

      add(b1);
      add(b2);

      b1.setLabel("Test");
      b2.getLabel();
      
    }

   

}

/*
<applet code="UseOfButton" width=900 height=900> </applet>
*/