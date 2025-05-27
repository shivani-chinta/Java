import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="Mousehandling.class" width=300 height=500>
</applet>
*/
//first 5 methods are of MouseListener next 2 are of MouseMotionListener
//all sources = classes, all listeners=interfaces, all events=classes
//Change in the state of a source is called an event
//The control which raises an event is known as a source
//The one which listens to the event raised by a source and acts accordingly is called as a listener

public class Mousehandling extends Applet implements MouseListener,MouseMotionListener
{
String msg="";
int mousex=0,mousey=0;
public void init()
{
addMouseListener(this);//registration of sourse to listener
addMouseMotionListener(this);
}
public void mouseEntered(MouseEvent me)
{
mousex=0;
mousey=10;
msg="mouse entered";
repaint();
}
public void mouseExited(MouseEvent me)
{
mousex=0;
mousey=10;
msg="mouse exited";
repaint();
}
public void mouseClicked(MouseEvent me)
{
mousex=0;
mousey=10;
msg="mouse clicked";
repaint();
}
public void mousePressed(MouseEvent me)
{
mousex=me.getX();
mousey=me.getY();
msg="down";
repaint();
}
public void mouseReleased(MouseEvent me)
{
mousex=me.getX();
mousey=me.getY();
msg="UP";
repaint();
}

public void mouseDragged(MouseEvent me)
{
mousex=me.getX();
mousey=me.getY();
msg="*";
showStatus("Dragging mouse at "+mousex+","+mousey);
repaint();
}
public void mouseMoved(MouseEvent me)
{
showStatus("Moving mouse at "+me.getX()+","+me.getY());
}
public void paint(Graphics g)
{
g.drawString(msg,mousex,mousey);
}
}
