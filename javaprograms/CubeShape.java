import java.awt.*;
import java.applet.*;
/*<applet code="CubeShape" width=500 height=500>
</applet>
*/
public class CubeShape extends Applet
{
public void paint(Graphics g)
{
/*Cube*/
g.drawString("Cube",95,110);
g.drawRect(80,10,50,50);
g.drawRect(95,25,50,50);
g.drawLine(80,10,95,25);
g.drawLine(130,10,145,25);
g.drawLine(80,60,95,75);
g.drawLine(130,60,145,75);
}
}
