import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 13.12.2019
 * @author 
 */

public class asdasd extends JFrame {
  // Anfang Attribute
  private JLabel jLabel1 = new JLabel();
  private JLabel jLabel2 = new JLabel();
  private JLabel jLabel3 = new JLabel();
  private JLabel jLabel4 = new JLabel();
  private JLabel jLabel5 = new JLabel();
  private JLabel jLabel6 = new JLabel();
  private JTextField jTextField2 = new JTextField();
  private JTextField jTextField3 = new JTextField();
  private JTextField jTextField1 = new JTextField();
  private JTextField jTextField4 = new JTextField();
  private JTextField jTextField5 = new JTextField();
  private JTextField jTextField6 = new JTextField();
  // Ende Attribute
  
  public asdasd() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 501; 
    int frameHeight = 394;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("asdasd");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    jLabel1.setBounds(136, 80, 110, 20);
    jLabel1.setText("text");
    cp.add(jLabel1);
    jLabel2.setBounds(104, 176, 110, 20);
    jLabel2.setText("text");
    cp.add(jLabel2);
    jLabel3.setBounds(112, 56, 110, 20);
    jLabel3.setText("text");
    cp.add(jLabel3);
    jLabel4.setBounds(160, 224, 110, 20);
    jLabel4.setText("text");
    cp.add(jLabel4);
    jLabel5.setBounds(160, 312, 110, 20);
    jLabel5.setText("text");
    cp.add(jLabel5);
    jLabel6.setBounds(200, 152, 110, 20);
    jLabel6.setText("text");
    cp.add(jLabel6);
    jTextField2.setBounds(288, 104, 150, 20);
    cp.add(jTextField2);
    jTextField3.setBounds(376, 184, 150, 20);
    cp.add(jTextField3);
    jTextField1.setBounds(232, 24, 150, 20);
    cp.add(jTextField1);
    jTextField4.setBounds(328, 312, 150, 20);
    cp.add(jTextField4);
    jTextField5.setBounds(144, 136, 150, 20);
    cp.add(jTextField5);
    jTextField6.setBounds(336, 264, 150, 20);
    cp.add(jTextField6);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public asdasd
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new asdasd();
  } // end of main
  
  // Ende Methoden
} // end of class asdasd

