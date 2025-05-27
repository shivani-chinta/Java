//TRAFFIC LIGHTS PROGRAM
import javax.swing.*; 
import javax.swing.event.*; 
import java.awt.*; 
import java.awt.event.*;
class A extends JFrame implements ItemListener 
{  
 public JLabel l1; 
 public JRadioButton r1, r2, r3; 
 ButtonGroup bg;

  public A()
  {  
   setSize(800, 400); 
   l1 = new JLabel();
   bg=new ButtonGroup();
   r1 = new JRadioButton("Red Light");
   r1.setBackground(Color.red);  
   r1.addItemListener(this); 
   r2 = new JRadioButton("Yellow Light");
   r2.setBackground(Color.YELLOW); 
   r2.addItemListener(this);
   r3 = new JRadioButton("Green Light"); 
   r3.setBackground(Color.GREEN);
   r3.addItemListener(this);  
   setLayout(new FlowLayout());
   add(l1); 
   bg.add(r1); 
   bg.add(r2);  
   bg.add(r3); 
   add(r1);
   add(r2);
   add(r3);
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
   setVisible(true); 
  }  
 public void itemStateChanged(ItemEvent i)
 { 
  JRadioButton jb = (JRadioButton)i.getSource();//typecasting explicity 
  switch (jb.getText())
   {  
    case "Red Light":l1.setForeground(Color.red); 
      		     l1.setText("STOP"); 
    		     break; 
    case "Yellow Light":l1.setForeground(Color.YELLOW);  
			l1.setText("Ready");
			break; 
    case "Green Light":l1.setText("GO"); 
     		       l1.setForeground(Color.GREEN); 
    		       break; 
   }
 }
} 
public class TrafficLights
{ 
 public static void main(String[] args) 
  {  
   A a = new A();
  }
}
