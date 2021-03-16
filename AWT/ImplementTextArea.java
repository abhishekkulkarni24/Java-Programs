import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class ImplementTextArea extends Applet
{

    Label l1,l2;
    TextArea t1,t2;
 

    public void init(){


        l1 = new Label("username");
        l1.setBounds(100,100,150,100);

        t1 = new TextArea(5,50);
        l1.setBounds(200,100,50,100);

        l2 = new Label("password");
        l2.setBounds(100,200,150,200);

        t2 = new TextArea(5,50);
        l2.setBounds(200,200,50,200);

        add(l1);
        add(t1);

        add(l2);
        add(t2);

       
    }

   
    public void paint(Graphics g){

      
    }

}

/*
<applet code="ImplementTextArea" width=900 height=900> </applet>
*/