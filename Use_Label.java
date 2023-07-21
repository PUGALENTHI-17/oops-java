import java.awt.*;
public class Use_Label {
public static void main(String[] args){
    int i;
    Frame fr =new Frame("this program is for displaying the label");
    fr.setSize(800,600);
    fr.setLayout(new FlowLayout());
    fr.setVisible(true);
    //label
    Label l1 =new Label("OK");
    Label l2 = new Label("CANCEL");
   // button 
    // if button is used label not necessary
    Button B1 = new Button("OK");
    Button B2 = new Button("CANCEL");
   // array in java
    Button Button[]= new Button[3];
    String name[]={"Button1","Button2","Button3"};
    for(i=0;i<3;i++)
    {
       Button[i]=new Button(""+name[i]);
       fr.add(Button[i]);    }
    Canvas c1 =new Canvas();
    c1.setSize(120,120);
    c1.setBackground(Color.BLUE);
    fr.add(l1);
    fr.add(l2);
    fr.add(B1);
    fr.add(B2);
}    
}
