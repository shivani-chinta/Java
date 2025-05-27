//DIVISION APPLET
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="DivisionApplet" width=300 height=300>
</applet>
*/
public class DivisionApplet extends Applet implements ActionListener
{
Button btn,cbtn;
Label lb1,lb2,lb3;
TextField tf1,tf2,tf3;
public void init()
{
btn=new Button("Divide");
cbtn=new Button("Clear");
btn.addActionListener(this);
cbtn.addActionListener(this);
tf1=new TextField(30);
tf2=new TextField(30);
tf3=new TextField(30);
lb1=new Label("Number1");
lb2=new Label("Number2");
lb3=new Label("Result");
setLayout(new GridLayout(4,2));
add(lb1);
add(tf1);
add(lb2);
add(tf2);
add(lb3);
add(tf3);
add(btn);
add(cbtn);
}
public void actionPerformed(ActionEvent ae)
{
int r=0;
int a=999,b=999;
if(ae.getSource()==btn)
{
try
{
a=Integer.parseInt(tf1.getText());
b=Integer.parseInt(tf2.getText());
}
catch(NumberFormatException e)
{
System.out.println("numbers not correct");
}
try
{
r=a/b;
}
catch(ArithmeticException e1)
{
System.out.println("handling the exception");
}
tf3.setText(""+r);
}
else
  {
     tf1.setText("");
     tf2.setText("");
     tf3.setText("");
  }
}
}

