//It supports the selection of one or more items from a list. 
import javax.swing.*;
public class JListExample
{
 JListExample(){
 JFrame f= new JFrame();
 DefaultListModel<String> l1 = new DefaultListModel<>();//generic
 l1.addElement("Item1");
 l1.addElement("Item2");
 l1.addElement("Item3");
 l1.addElement("Item4");
 JList<String> list = new JList<>(l1);
 list.setBounds(100,100, 75,75);
 f.add(list);
 f.setSize(400,400);
 f.setLayout(null);
 f.setVisible(true);
 } 
public static void main(String args[])
 {
 new JListExample();
 }} 