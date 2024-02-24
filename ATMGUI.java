import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ATMGUI extends JFrame implements ActionListener 
{

    JLabel BLabel;
    JTextField AField;
    JButton WButton,DButton, CBButton;
    double Balance = 500;

    public ATMGUI() {

        // Create labels and fields
        BLabel = new JLabel("Current Balance: " + Balance);
        
        AField = new JTextField(10);
        
        // Create buttons
        WButton = new JButton("Withdraw");
        WButton.addActionListener(this);
        
       DButton = new JButton("Deposit");
       DButton.addActionListener(this);
       
        CBButton = new JButton("Check Balance");
        CBButton.addActionListener(this);

        // Layout components using GridLayout
        setLayout(new GridLayout(4,8));
        
        add(new JLabel("Amount:"));
        add(AField);
        add(WButton);
        add(DButton);
        add(CBButton);
        add(BLabel);
        
        setSize(300, 100);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {

        double Amount = Double.parseDouble(AField.getText());

        if(e.getSource() == WButton) {
            Balance -= Amount;
        } else if(e.getSource() ==DButton) {
            Balance += Amount;
        }

        BLabel.setText("Current Balance: " + Balance);
    }

    public static void main(String[] ab)
    {
        new ATMGUI();
    }
}