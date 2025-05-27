/*•An appletAn applet is a small Internet-based program
written in Java, a programming language for the Web,
which can be downloaded by any computer.
•The applet is also able to run in HTML.
•The applet is usually embedded in an HTML page on a
Web site and can be executed from within a browser.*/

import java.applet.*;
import java.awt.*;
 /* <applet code = "AppletFace" width = 300 height = 300> </applet> */
public class AppletFace extends Applet
{
 public void paint(Graphics g)
 {
 g.drawOval(100,100,100,100);
 g.fillOval(120,125,20,20);
 g.fillOval(160,125,20,20);
 g.drawLine(150,165,150,150);
 g.drawLine(130,170,170,170);
 }
}