import javax.swing.*;
import java.awt.*;

public class LoginView extends JFrame{
	JPanel mainPanel;
	JLabel loginLabel;
	JLabel userNameLabel;
	JLabel passwordLabel;
	JTextField userNameTxt;
	JPasswordField passwordTxt;
	JButton loginBtn;
	
	public loginView(){
		setSize(450,300);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainPanel = new JPanel();
        mainPanel.setLayout(null);      
        
        loginLabel = new JLabel("Login");
        loginLabel.setFont(new Font("Arial",1,36));
        loginLabel.setHorizontalAlignment(JLabel.CENTER);
        loginLabel.setBounds(100, 10, 250, 50);
        mainPanel.add(loginLabel);
        
        userNameLabel = new JLabel("User Name   :");
        userNameLabel.setFont(new Font("Arial",2,18));
        userNameLabel.setBounds(20,80,170,20);
        mainPanel.add(userNameLabel);
        
        userNameTxt = new JTextField(50);
        userNameTxt.setBounds(175,80,220,20);
        userNameTxt.setFont(new Font("Arial",2,18));
        mainPanel.add(userNameTxt);
        
        passwordLabel = new JLabel("Password   :");
        passwordLabel.setBounds(20,150,170,20);
        passwordLabel.setFont(new Font("Arial",2,18));
        mainPanel.add(passwordLabel);
        
        passwordTxt = new JPasswordField(50);
        passwordTxt.setBounds(175,150,220,20);
        passwordTxt.setFont(new Font("Arial",2,18));
        mainPanel.add(passwordTxt);
        
        loginBtn = new JButton("Login");
        loginBtn.setBounds(290,230,100,25);
        loginBtn.setFont(new Font("Arial",1,20));
        mainPanel.add(loginBtn);
        
        getContentPane().add(mainPanel);
	}
	public static void main(String args[]){
		new LoginView().setVisible(true);
	}
} 

