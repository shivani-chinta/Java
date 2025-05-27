//JTabbedPane encapsulates a tabbed pane. It manages a set of components by linking them with tabs.Selecting a tab causes the component associated with that tab to come to the forefront.
import javax.swing.*;
public class JTabbedPaneExample {
JFrame f;
JTabbedPaneExample(){
 f=new JFrame();
 JTextArea ta=new JTextArea("WELCOME");
 JPanel p1=new JPanel();
 p1.add(ta);
 JPanel p2=new JPanel();
 JButton b=new JButton("HELLO");
 p2.add(b);
 JPanel p3=new JPanel();
 JLabel l=new JLabel("HI");
 p3.add(l);
 JTabbedPane tp=new JTabbedPane();
 tp.setBounds(50,50,200,200);
 tp.add("main",p1); 
 tp.add("visit",p2);
 tp.add("help",p3);
 f.add(tp);
 f.setSize(400,400);
 f.setLayout(null);
 f.setVisible(true);
}
public static void main(String[] args) {
 new JTabbedPaneExample();
}} 
