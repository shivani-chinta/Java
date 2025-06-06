//GridLayout lays out components in a two-dimensional grid. When you instantiate a GridLayout, you define the number of rows and columns. 

import java.awt.*;
import java.applet.*;
/*
<applet code="GridLayoutDemo" width=300 height=200> </applet>
*/
public class GridLayoutDemo extends Applet
{ static final int n = 3;
 public void init()
 {
 setLayout(new GridLayout(n, n));
 setFont(new Font("SansSerif", Font.BOLD, 24));
 for(int i = 0; i < n; i++)
  { for(int j = 0; j < n; j++)
   {
    int k = i * n + j; if(k > 0)
    add(new Button("" + k));
   }
  }
 }
}