import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code="AdapterDemo" width=500 height=500>
</applet>*/
//adapter classes provide empty implementation of all methods in an event listener interface 

public class AdapterDemo extends Applet
{
 String msg="";
 public void init()
{
 addMouseListener(new MyMouseAdapter(this));
 addMouseMotionListener(new MyMouseMotionAdapter(this));
}
}
class MyMouseAdapter extends MouseAdapter
{
 AdapterDemo ad;
public MyMouseAdapter(AdapterDemo ob)
{
ad=ob;
}
public void mouseClicked(MouseEvent me)
{
 ad.showStatus("MouseClicked");
}
}
class MyMouseMotionAdapter extends MouseMotionAdapter
{
 AdapterDemo ad;
public MyMouseMotionAdapter(AdapterDemo ob)
{
ad=ob;
}
public void mouseDragged(MouseEvent me)
{
 ad.showStatus("MouseDragging");
}
}