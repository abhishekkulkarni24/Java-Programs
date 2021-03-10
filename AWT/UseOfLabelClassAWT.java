import java.awt.*;
import java.applet.*;

public class UseOfLabelClassAWT extends Applet
{

    Label l1,l2,l3,l4;

    public void init(){

        l1 = new Label();
        l2 = new Label("Name");
        l3 = new Label("Roll Number",Label.RIGHT);
        l4 = new Label("Advance Java");

        add(l1);
        add(l2);
        add(l3);
        add(l4);

        l1.setText("Demo");
        l2.getText();
        l3.getAlignment();
        l4.setAlignment(Label.LEFT);

    }

}

/*
<applet code="UseOfLabelClassAWT" width=900 height=900> </applet>
*/