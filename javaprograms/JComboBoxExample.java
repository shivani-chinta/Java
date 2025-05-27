//Swing provides a combo box (a combination of a text field and a drop-down list)
//A combo box normally displays one entry, but it will also display a dropdown list that allows a user to select a different entry
import javax.swing.*;
public class JComboBoxExample {
JFrame f;
JComboBoxExample(){
 f=new JFrame("ComboBox Example");
 String country[]={"India","Aus","U.S.A","England","Newzealand"};
 JComboBox<String> cb=new JComboBox<>(country);
 cb.setBounds(50, 50,90,20);
 f.add(cb);
 f.setLayout(null);
 f.setSize(400,500);
 f.setVisible(true);
}
public static void main(String[] args) {
 new JComboBoxExample();
}
} 