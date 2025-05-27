//APPLET PARAMETERS
/*THE HTML APPLET TAG
 <APPLET
[CODEBASE= codebaseURL] 
[ALT=alternate text]
[NAME=applet instance name]
WIDTH=pixels HEIGHT=pixels
[ALIGN=alignment] [VSPACE=pixels][HSPACE=pixels] >
[PARAM NAME=AttributeName
VALUE=AttributeValue]
</APPLET>
<HTML>
<HEAD>
<TITLE>Java applet example - Passing applet
parameters to Java applets</TITLE>
</HEAD>
</HTML>*/

/*<APPLET CODE="AppletParameterTest.class"
WIDTH="400" HEIGHT="50">
 <PARAM NAME="font" VALUE="Dialog">
 <PARAM NAME="size" VALUE="24">
 <PARAM NAME="string" VALUE="Hello, world ...
it's me. :)">
</APPLET>*/

import java.applet.*;
import java.awt.*;
 public class AppletParameterTest extends Applet {
 public void paint(Graphics g) {
 String myFont = getParameter("font");
 String myString = getParameter("string");
 int mySize =Integer.parseInt(getParameter("size"));
 Font f = new Font(myFont, Font.BOLD, mySize);
 g.setFont(f);
 g.setColor(Color.red);
 g.drawString(myString, 20, 20); } }