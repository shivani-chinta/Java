//FlowLayout is the default layout manager,  The direction of the layout by default, is left to right, top to bottom
//FlowLayout.LEFT, FlowLayout.CENTER,FlowLayout.RIGHT, FlowLayout.LEADING,FlowLayout.TRAILING

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code="FlowLayoutDemo" width=500 height=600>
</applet>
*/
public class FlowLayoutDemo extends Applet
{
 Button b1,b2,b3;
 public void init()
{
 b1=new Button("1");
 b2=new Button("2");
 b3=new Button("3");
 setLayout(new FlowLayout(FlowLayout.CENTER));
 add(b1);
 add(b2);
 add(b3);
}}