//It has four narrow,fixed-width components at the edges and one large area in the center.The four sides are referred to as north,south, east, and west. The middle area is called the center

import java.awt.*;
import java.applet.*;
import java.util.*;
 /*
<applet code="BorderLayoutDemo" width=400 height=200> </applet>
*/
public class BorderLayoutDemo extends Applet
{ public void init()
{
setLayout(new BorderLayout());
add(new Button("across the top."), BorderLayout.NORTH);
add(new Label("footer message "), BorderLayout.SOUTH);
add(new Button("Right"), BorderLayout.EAST);
add(new Button("Left"), BorderLayout.WEST);
String msg = "ONE WHO ASKS A QUESTION \n" +"IS A FOOL FOR 5 MINUTES\n" +"ONE WHO NEVER ASKS A QUESTION\n" + "IS A FOOL FOREVER\n"+" - ANONYMOUS \n\n";
add(new TextArea(msg), BorderLayout.CENTER); }
}