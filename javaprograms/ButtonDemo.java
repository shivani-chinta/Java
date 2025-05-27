//a push button is a component that contains a label and that generates an event when it is pressed, are objects of type Button.

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code="ButtonDemo" width=500 height=600>
</applet>
*/
public class ButtonDemo extends Applet implements ActionListener
{
 String msg="";
Button yes,no,maybe;
 public void init()
{
yes=new Button("YES");
no=new Button("NO");
maybe=new Button("MAYBE");
add(yes);
add(no);
add(maybe);
yes.addActionListener(this);
no.addActionListener(this);
maybe.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
 String str=ae.getActionCommand();//getActionCommand() returns whatever is written on the button
 if(str.equals("YES"))
msg="U PRESSED YES";
else if(str.equals("NO"))
msg="U PRESSED NO";
else
msg="U PRESSED MAYBE";
repaint();
}
public void paint(Graphics g)
{
g.drawString(msg,30,200);
}
}