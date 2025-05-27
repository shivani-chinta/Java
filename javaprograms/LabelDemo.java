//A label is object of type Label and contains a string which it displays

import java.awt.*;
import java.applet.*;
/*<applet code="LabelDemo" width=500 height=600>
</applet>
*/
public class LabelDemo extends Applet
{
 public void init()
{
Label one=new Label("ONE");
Label two=new Label("TWO");
Label three=new Label("THREE");
add(one);
add(two);
add(three);
}}