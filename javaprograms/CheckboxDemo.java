//A checkbox is a control that is used to turn an option on or off.

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code="CheckboxDemo" width=500 height=600>
</applet>
*/
public class CheckboxDemo extends Applet implements ItemListener
{
 String msg="";
Checkbox winXP,solaris,mac;
 public void init()
{
winXP=new Checkbox("Windows XP",null,true);
solaris=new Checkbox("Solaris");
mac=new Checkbox("Mac Os",true);
add(winXP);
add(solaris);
add(mac);
winXP.addItemListener(this);
solaris.addItemListener(this);
mac.addItemListener(this);
}
public void itemStateChanged(ItemEvent ae)
{
 repaint();
}
public void paint(Graphics g)
{
msg="windows XP : "+winXP.getState();
g.drawString(msg,30,200);
msg="Solaris : "+solaris.getState();
g.drawString(msg,30,250);
msg="mac OS : "+mac.getState();
g.drawString(msg,30,300);
}
}