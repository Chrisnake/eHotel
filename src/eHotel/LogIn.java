package eHotel;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class LogIn extends JFrame 
{
	private JPanel contentPane;
	static LogIn frame = new LogIn();
	
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try {frame.setVisible(true);} 
				catch (Exception e) { e.printStackTrace();}
			}
		});
	}

	public LogIn() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(255, 204, 51));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		/**
		 * JPanel and JLabel components
		 */
	
		RoomClean logo = new RoomClean(); //Logo elements.
		logo.logoElements(contentPane);
		
		/**
		 * JTextField components
		 */
		
		/**
		 * JButton components
		 */
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(95, 98, 358, 215);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel checkInLabel = new JLabel("CHECK IN");
		checkInLabel.setBounds(122, 16, 154, 39);
		panel.add(checkInLabel);
		checkInLabel.setForeground(Color.BLACK);
		checkInLabel.setFont(new Font("Apple SD Gothic Neo", Font.BOLD | Font.ITALIC, 24));
		checkInLabel.setBackground(Color.BLACK);
		
		JLabel lblWelcome = new JLabel("Welcome to eHotels, enjoy your stay!");
		lblWelcome.setBounds(46, 54, 334, 16);
		panel.add(lblWelcome);
		lblWelcome.setForeground(new Color(102, 102, 102));
		lblWelcome.setFont(new Font("Apple SD Gothic Neo", Font.ITALIC, 17));
		
		JTextField txtUsername = new JTextField();
		txtUsername.setBounds(141, 88, 140, 26);
		panel.add(txtUsername);
		txtUsername.setFont(new Font("Apple SD Gothic Neo", Font.PLAIN, 13));
		txtUsername.setColumns(10);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(68, 93, 61, 16);
		panel.add(lblUsername);
		lblUsername.setFont(new Font("Apple SD Gothic Neo", Font.PLAIN, 13));
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(68, 121, 61, 16);
		panel.add(lblPassword);
		lblPassword.setFont(new Font("Apple SD Gothic Neo", Font.PLAIN, 13));
		
		JPasswordField passwordField = new JPasswordField();
		passwordField.setBounds(141, 115, 140, 26);
		panel.add(passwordField);
		
		JLabel lblRoomNo = new JLabel("Room No");
		lblRoomNo.setBounds(68, 149, 61, 16);
		panel.add(lblRoomNo);
		lblRoomNo.setFont(new Font("Apple SD Gothic Neo", Font.PLAIN, 13));
		
		JTextField txtPassword = new JTextField();
		txtPassword.setBounds(141, 141, 140, 26);
		panel.add(txtPassword);
		txtPassword.setFont(new Font("Apple SD Gothic Neo", Font.PLAIN, 11));
		txtPassword.setColumns(10);
		
		JButton btnRelax = new JButton("Relax");
		btnRelax.setBounds(215, 169, 67, 29);
		panel.add(btnRelax);
		btnRelax.setFont(new Font("Apple SD Gothic Neo", Font.PLAIN, 11));
		btnRelax.setBackground(Color.black);
		btnRelax.setForeground(new Color(0, 0, 0));
		btnRelax.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				HomePage.frame.setVisible(true);
				frame.dispose();
			}
		});	
	}
}
