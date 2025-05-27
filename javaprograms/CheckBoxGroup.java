//to create a set of mutually exclusive check boxes in which one and only one checkbox in the group can be checked at anyone time …these are often called radio buttons

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code="CheckBoxGroup" width=500 height=600>
</applet>
*/
public class CheckBoxGroup extends Applet implements ItemListener
{
 String msg="";
Checkbox winXP,solaris,mac;
CheckboxGroup cbg;
 public void init()
{
cbg=new CheckboxGroup();
winXP=new Checkbox("Windows XP",cbg,true);
solaris=new Checkbox("Solaris",cbg,true);
mac=new Checkbox("Mac Os",cbg,false);
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
msg=cbg.getSelectedCheckbox().getLabel();
g.drawString(msg,30,200);
}
}