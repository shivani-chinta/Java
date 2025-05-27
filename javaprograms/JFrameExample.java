//swing using desktop application
import java.awt.FlowLayout;
import javax.swing.*;
public class JFrameExample {
 public static void main(String s[]) {
 JFrame frame = new JFrame("JFrame Example");
 JPanel panel = new JPanel();
 JLabel label = new JLabel("JFrame By Example");
 JButton button = new JButton("Button");
 panel.add(label);
 panel.add(button);
 frame.add(panel);
 frame.setSize(200, 300);
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setVisible(true);
 } 
}