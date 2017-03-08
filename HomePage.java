import javax.swing.*;
import java.awt.*;

public class HomePage extends JFrame{
	JPanel mainPanel;
	JLabel titleLabel;
	JLabel reserveCabLabel;
	JLabel releaseCabLabel;
	JLabel businessDetailsLabel;
	JLabel dataInputLabel;
	JLabel logOutLabel;

	public HomePage(){
		setSize(450,300);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainPanel = new JPanel();
        mainPanel.setLayout(null);
		
		titleLabel = new JLabel("Perera Cab Rent Management System");
        titleLabel.setFont(new Font("Arial",1,36));
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        titleLabel.setBounds(100, 10, 250, 50);
        mainPanel.add(titleLabel);
		
		reserveCabLabel = new JLabel("RESERVE YOUR CAB");
        reserveCabLabel.setFont(new Font("Arial",1,36));
        reserveCabLabel.setHorizontalAlignment(JLabel.CENTER);
        reserveCabLabel.setBounds(100, 10, 250, 50);
        mainPanel.add(reserveCabLabel);
		
		releaseCabLabel = new JLabel("RELEASE YOUR CAB");
        releaseCabLabel.setFont(new Font("Arial",1,36));
        releaseCabLabel.setHorizontalAlignment(JLabel.CENTER);
        releaseCabLabel.setBounds(100, 10, 250, 50);
        mainPanel.add(releaseCabLabel);
		
		businessDetailsLabel = new JLabel("BUSINESS DETAILS");
        businessDetailsLabel.setFont(new Font("Arial",1,36));
        businessDetailsLabel.setHorizontalAlignment(JLabel.CENTER);
        businessDetailsLabel.setBounds(100, 10, 250, 50);
        mainPanel.add(businessDetailsLabel);
		
		dataInputLabel = new JLabel("DATA INPUT");
        dataInputLabel.setFont(new Font("Arial",1,36));
        dataInputLabel.setHorizontalAlignment(JLabel.CENTER);
        dataInputLabel.setBounds(100, 10, 250, 50);
        mainPanel.add(dataInputLabel);
		
		logOutLabel = new JLabel("Login");
        logOutLabel.setFont(new Font("Arial",1,36));
        logOutLabel.setHorizontalAlignment(JLabel.CENTER);
        logOutLabel.setBounds(100, 10, 250, 50);
        mainPanel.add(logOutLabel);
		
		}
	public static void main(String args[]){
		new HomePage().setVisible(true);
	}
} 

		
		
		
	