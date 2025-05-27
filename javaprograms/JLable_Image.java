// Demonstrate JLabel and ImageIcon.
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;
class Frame extends JFrame{
 Frame() {
 setTitle("ImageIcon");
 setLayout(new FlowLayout());
ImageIcon icon = new ImageIcon("nature.png");
 JLabel jl = new JLabel("NATURE",icon,JLabel.CENTER);
 add(jl);
 setSize(700, 350);
 setVisible(true);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); }}
public class JLable_Image {
 public static void main(String[] args) {
 Frame frame = new Frame(); }}