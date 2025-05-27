//The JDialog control represents a top level window with a border and a title used to take some form of input from the user. It inherits the Dialog class.
//Unlike JFrame, it doesn't have maximize and minimize buttons.
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JDialogExample
{
 private static JDialog d;
 JDialogExample()
 {
 JFrame f= new JFrame();
 d = new JDialog(f , "Dialog Example", true);
 d.setLayout( new FlowLayout() );
 JButton b = new JButton ("OK");
 b.addActionListener ( new ActionListener()
 {
 public void actionPerformed( ActionEvent e )
 {
 JDialogExample.d.setVisible(false);
 }
 }); 
 d.add( new JLabel ("Click button to continue."));
 d.add(b);
 d.setSize(300,300);
 d.setVisible(true);
 }
 public static void main(String args[])
 {
 new JDialogExample();
 }
}