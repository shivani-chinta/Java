import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="keyhandling" width=300 height=500>
</applet>
*/
public class keyhandling extends Applet implements KeyListener
{
 String msg="";
 int x=90,y=200;
 public void init()
 {
 addKeyListener(this);
 }
 public void keyPressed(KeyEvent ke)
 {
  showStatus("key down");
  }

 public void keyReleased(KeyEvent ke)
 {
  showStatus("key up");
  }
 
 public void keyTyped(KeyEvent ke)
 {
 msg+=ke.getKeyChar();
 repaint();
 }
 public void paint(Graphics g)
 {
 g.drawString(msg,x,y);
 }}
