import javax.swing.*;
import java.awt.*;

public class ServerNull extends JFrame{
	JPanel mainPanel;
	JLabel serverNullLabel;
	JScrollPane errorMsgScrollPane;
	JTextArea errorMsgTxtArea;
	JButton okBtn;
	
	public serverNull(){
		setSize(450,300);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainPanel = new JPanel();
        mainPanel.setLayout(null);

		serverNullLabel = new JLabel("SERVER ERROR");
        serverNullLabel.setFont(new Font("Arial",1,36));
        serverNullLabel.setHorizontalAlignment(JLabel.CENTER);
        serverNullLabel.setBounds(100, 10, 250, 50);
        mainPanel.add(serverNullLabel);
		
		errorMsgScrollPane.setBounds(175,150,220,20);
		mainPanel.add(errorMsgScrollPane);
		
		errorMsgTxtArea = new JTextArea(50);
        errorMsgTxtArea.setBounds(175,150,220,20);
        errorMsgTxtArea.setFont(new Font("Arial",2,18));
        errorMsgScrollPane.add(errorMsgTxtArea);
		
		okBtn = new JButton("OK");
        okBtn.setBounds(290,230,100,25);
        okBtn.setFont(new Font("Arial",1,20));
        mainPanel.add(okBtn);
	}
	
		
		public static void main(String args[]){
			new ServerNull().setVisible(true);
		}
	}
		