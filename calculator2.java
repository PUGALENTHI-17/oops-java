import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class CalculatorOp{ 
 public int total;
 public int convertertonumber(String n){
     return Integer.parseInt(n);

 }
 public  CalculatorOp(){
     total =0 ;

 }
 public String getTotalString(){
     return ""+total;

 }
 public void setTotal(String n ){
     total = convertertonumber(n);class OperatorListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String displayText = textfield.getText();
            if (e.getActionCommand().equals("sin"))
            {
                textfield.setText("" + Math.sin(Double.valueOf(displayText).doubleValue()));
                
            }else
            if (e.getActionCommand().equals("cos"))
            {
                textfield.setText("" + Math.cos(Double.valueOf(displayText).doubleValue()));
                
            }
            else
            if (e.getActionCommand().equals("log"))
            {
                textfield.setText("" + Math.log(Double.valueOf(displayText).doubleValue()));
                
            }
            else if (e.getActionCommand().equals("C"))
            {
                textfield.setText("");
            }
    
            else
            {
                if (number)
                {
                    
                    action();
                    textfield.setText("");
                    
                }
                else
                {
                    number = true;
                    if (equalOp.equals("="))
                    {
                        op.setTotal(displayText);
                    }else
                    if (equalOp.equals("+"))
                    {
                        op.add(displayText);
                    }
                    else if (equalOp.equals("-"))
                    {
                        op.subtract(displayText);
                    }
                    else if (equalOp.equals("*"))
                    {
                        op.multiply(displayText);
                    }
                    else if (equalOp.equals("/"))
                    {
                        op.divide(displayText);
                    }
                    
                    textfield.setText("" + op.getTotalString());
                    equalOp = e.getActionCommand();
                }
            }
        }
    }
    class NumberListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String digit = event.getActionCommand();
            if (number) {
                textfield.setText(digit);
                number = false;
            } else {
                textfield.setText(textfield.getText() + digit);
            }
        }
    }
    public class CalculatorOp {
        private int total;
        public CalculatorOp() {
            total = 0;
        }
        public Str

 }
 public void add(String n){
     total += convertertonumber(n);
 }
 public void sub(String n){
    total -= convertertonumber(n);
}
public void mul(String n){
    total *= convertertonumber(n);
}
public void div(String n){
    total /= convertertonumber(n);
}
}

public class NumberListener implements ActionListener{
    public void actionPerformed(ActionEvent event){
        String digit = event.getActionCommand();
        if (number){
            textfield.setText(digit);
            number =false;
        }
        else{
            textfield.setText(textField.getText()+digit);
        }
    }

}

class operatorListener implements ActionListener{
    public void actionPerformed(ActionEvent e){
        String displayText = textfield.getText();
        if(e.getActionCommand().equals("sin")){
            textfield.setText(""+Math.sin(Double.valueOf(displayText).doubleValue()))
        }
    }
}