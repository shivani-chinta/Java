import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="FactorialApplet" width=300 height=300>
</applet>
*/
public class FactorialApplet extends Applet implements ActionListener
{
Button btn,cbtn;
Label lb1,lb2;
TextField tf1,tf2;
public void init()
{
btn=new Button("Compute");
cbtn=new Button("Clear");
btn.addActionListener(this);
cbtn.addActionListener(this);
tf1=new TextField(30);
tf2=new TextField(30);
lb1=new Label("Number");
lb2=new Label("Result");
setLayout(new GridLayout(3,2));
add(lb1);
add(tf1);
add(lb2);
add(tf2);
add(btn);
add(cbtn);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==btn)
{
int a=Integer.parseInt(tf1.getText());
int fact=1;
for(int i=1;i<=a;i++)
{
fact=fact*i;
}
tf2.setText(""+fact);
}
else
{
tf1.setText("");
tf2.setText("");
}
}
}
