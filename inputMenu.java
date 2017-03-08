import javax.swing.*;
import java.awt.*;

public class InputMenu extends JFrame{
	JPanel mainPanel;
	JLabel selectInputLabel;
	JLabel inputCustomerLabel;
	JLabel inputCabLabel;
	JLabel inputUserLabel;
	JButton exitBtn;

	public inputMenu(){
		setSize(450,300);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainPanel = new JPanel();
        mainPanel.setLayout(null);
		
		selectInputLabel = new JLabel("Select Your Input");
        selectInputLabel.setFont(new Font("Arial",1,36));
        selectInputLabel.setHorizontalAlignment(JLabel.CENTER);
        selectInputLabel.setBounds(100, 10, 250, 50);
        mainPanel.add(selectInputLabel);
		
		inputCustomerLabel = new JLabel("Input New Fix Customer");
        inputCustomerLabel.setFont(new Font("Arial",1,36));
        inputCustomerLabel.setHorizontalAlignment(JLabel.CENTER);
        inputCustomerLabel.setBounds(100, 10, 250, 50);
        mainPanel.add(inputCustomerLabel);
		
		inputCabLabel = new JLabel("Input New Cab");
        inputCabLabel.setFont(new Font("Arial",1,36));
        inputCabLabel.setHorizontalAlignment(JLabel.CENTER);
        inputCabLabel.setBounds(100, 10, 250, 50);
        mainPanel.add(inputCabLabel);
		
		inputUserLabel = new JLabel("Input New User");
        inputUserLabel.setFont(new Font("Arial",1,36));
        inputUserLabel.setHorizontalAlignment(JLabel.CENTER);
        inputUserLabel.setBounds(100, 10, 250, 50);
        mainPanel.add(inputUserLabel);
		
		exitBtn = new JButton("X");
        exitBtn.setBounds(10,10,10,10);
        exitBtn.setFont(new Font("Arial",1,10));
        mainPanel.add(exitBtn);
	}
	
	public static void main(String args[]){
			new InputMenu().setVisible(true);
		}
	}
