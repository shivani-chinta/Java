//DIVISION SWING
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class DivisionSwing implements ActionListener
{
JFrame f;
JButton btn,cbtn;
JLabel lb1,lb2,lb3;
JTextField tf1,tf2,tf3;
DivisionSwing()
{
f= new JFrame("Division");
btn=new JButton("Divide");
cbtn=new JButton("Clear");
btn.addActionListener(this);
cbtn.addActionListener(this);
tf1=new JTextField();
tf2=new JTextField();
tf3=new JTextField();
lb1=new JLabel("Number1",JLabel.CENTER);
lb2=new JLabel("Number2",JLabel.CENTER);
lb3=new JLabel("Result",JLabel.CENTER);
f.setLayout(new GridLayout(4,2));
f.add(lb1);
f.add(tf1);
f.add(lb2);
f.add(tf2);
f.add(lb3);
f.add(tf3);
f.add(btn);
f.add(cbtn);
f.setSize(300,300);
f.setVisible(true);
f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
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
JDialog d = new JDialog(f);
d.setLayout( new FlowLayout());
d.add( new JLabel ("NumberFormatException-didnot enter integers",JLabel.CENTER));
d.setSize(400,100);
d.setVisible(true);
d.setDefaultCloseOperation(d.DISPOSE_ON_CLOSE);
}
try
{
r=a/b;
}
catch(ArithmeticException e1)
{
JDialog d = new JDialog(f);
d.setLayout( new FlowLayout());
d.add( new JLabel ("ArithmeticException-divide by zero",JLabel.CENTER));
d.setSize(400,100);
d.setVisible(true);
d.setDefaultCloseOperation(d.DISPOSE_ON_CLOSE);
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
public static void main(String args[])
{
DivisionSwing ds= new DivisionSwing();
}
}

