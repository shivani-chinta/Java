import java.awt.*;
import java.applet.*;
/*<applet code="CylinderShape" width=500 height=500>
</applet>
*/
public class CylinderShape extends Applet
{
public void paint(Graphics g)
{
/*Cylinder*/
g.drawString("Cylinder",10,110);
g.drawOval(10,10,50,10);
g.drawOval(10,80,50,10);
g.drawLine(10,15,10,85);
g.drawLine(60,15,60,85);
}
}
