/*The CardLayout class is unique among the other layout managers
in that it stores several different layouts.
Each layout can be thought of as being on a separate index card
in a deck that can be shuffled so that any card is on top at a given time*/

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
 /*
<applet code="CardLayoutDemo" width=300 height=100> </applet>
*/
public class CardLayoutDemo extends Applet implements ActionListener
{
Checkbox winXP, winVista, solaris, mac;
Panel osCards;
CardLayout cardLO;
Button Win, Other;
public void init() {
Win = new Button("Windows");
Other = new Button("Other");
add(Win);
add(Other);
cardLO = new CardLayout();
osCards = new Panel();
osCards.setLayout(cardLO); // set panel layout to card layout
winXP = new Checkbox("Windows XP", null, true);
winVista = new Checkbox("Windows Vista");
solaris = new Checkbox("Solaris");
mac = new Checkbox("Mac OS");
// add Windows check boxes to a panel
Panel winPan = new Panel();
winPan.add(winXP);
winPan.add(winVista);
// add other OS check boxes to a panel
Panel otherPan = new Panel();
otherPan.add(solaris);
otherPan.add(mac);
// add panels to card deck panel
osCards.add(winPan, "Windows");
osCards.add(otherPan, "Other");
// add cards to main applet panel
 add(osCards);
// register to receive action events
Win.addActionListener(this);
Other.addActionListener(this);
}
public void actionPerformed(ActionEvent ae) {
if(ae.getSource() == Win)
 {cardLO.show(osCards, "Windows");
 }
else {cardLO.show(osCards, "Other");
}}}