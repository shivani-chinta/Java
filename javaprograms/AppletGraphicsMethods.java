import java.awt.*;
import java.applet.*;
/*<applet code="AppletGraphicsMethods" width=500 height=600>
</applet>
*/
public class AppletGraphicsMethods extends Applet
{
 public void paint(Graphics g)
{
 g.drawLine(20,30,100,200);

 g.drawRect(10,10,60,50);
 g.fillRect(400,100,60,50);
 g.drawRoundRect(190,10,60,50,15,15);
 g.fillRoundRect(250,250,140,100,30,40);
 g.drawOval(150,150,50,50);
 g.fillOval(200,200,75,50);
 g.drawArc(150,40,70,70,0,75);
g.setColor(Color.blue);
 g.fillArc(100,40,70,70,0,75);
g.setColor(Color.red);
 int xpo[]={30,200,30,200,30};
 int ypo[]={30,30,200,200,30};
 int num=5;
 g.drawPolygon(xpo,ypo,num);
g.setColor(Color.cyan);
 int xpo1[]={300,200,300,200,300};
 int ypo1[]={300,300,200,200,300};
 int num1=5;
g.setXORMode(Color.white);
 g.fillPolygon(xpo1,ypo1,num1);
}
}