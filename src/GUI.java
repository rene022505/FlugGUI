import java.awt.*;
import javax.swing.*;

public class GUI extends JFrame {
    private JLabel nameLabel = new JLabel();
    private JLabel vornameLabel = new JLabel();
    private JLabel passagierNrLabel = new JLabel();
    private JLabel zielLabel = new JLabel();
    private JLabel datumLabel = new JLabel();
    private JTextField nameText = new JTextField();
    private JTextField vornameText = new JTextField();
    private JTextField passagierNrText = new JTextField();
    private JTextField zielText = new JTextField();
    private JTextField datumText = new JTextField();

    public GUI() {
        super();
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        int frameWidth = 600;
        int frameHeight = 600;
        setSize(frameWidth, frameHeight);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (d.width - getSize().width) / 2;
        int y = (d.height - getSize().height) / 2;
        setLocation(x, y);
        setTitle("Flug GUI");
        setResizable(false);
        Container cp = getContentPane();
        cp.setLayout(null);

        nameLabel.setBounds(20, 20, 100, 20);
        nameLabel.setText("Name:");
        cp.add(nameLabel);
        vornameLabel.setBounds(20, 50, 110, 20);
        vornameLabel.setText("Vorname:");
        cp.add(vornameLabel);
        passagierNrLabel.setBounds(20, 80, 110, 20);
        passagierNrLabel.setText("Passagier Nr:");
        cp.add(passagierNrLabel);
        zielLabel.setBounds(20, 110, 110, 20);
        zielLabel.setText("Ziel:");
        cp.add(zielLabel);
        datumLabel.setBounds(20, 140, 110, 20);
        datumLabel.setText("Datum:");
        cp.add(datumLabel);
        nameText.setBounds(130, 20, 300, 20);
        cp.add(nameText);
        vornameText.setBounds(130, 50, 300, 20);
        cp.add(vornameText);
        passagierNrText.setBounds(130, 80, 300, 20);
        cp.add(passagierNrText);
        zielText.setBounds(130, 110, 300, 20);
        cp.add(zielText);
        datumText.setBounds(130, 140, 300, 20);
        cp.add(datumText);

        setVisible(true);
    }

}
