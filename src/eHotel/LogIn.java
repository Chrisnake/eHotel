package eHotel;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JSplitPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class LogIn extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JTextField txtPassword;
	private JPasswordField passwordField;

	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					LogIn frame = new LogIn();
					frame.setVisible(true);
				} catch (Exception e) { e.printStackTrace();}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LogIn() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(255, 204, 51));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel checkInLabel = new JLabel("CHECK IN");
		checkInLabel.setForeground(Color.BLACK);
		checkInLabel.setFont(new Font("Apple SD Gothic Neo", Font.BOLD | Font.ITALIC, 24));
		checkInLabel.setBackground(Color.BLACK);
		checkInLabel.setBounds(209, 121, 154, 39);
		contentPane.add(checkInLabel);
		
		txtUsername = new JTextField();
		txtUsername.setFont(new Font("Apple SD Gothic Neo", Font.PLAIN, 13));
		txtUsername.setBounds(235, 172, 140, 26);
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setFont(new Font("Apple SD Gothic Neo", Font.PLAIN, 11));
		txtPassword.setColumns(10);
		txtPassword.setBounds(235, 225, 140, 26);
		contentPane.add(txtPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(235, 199, 140, 26);
		contentPane.add(passwordField);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Apple SD Gothic Neo", Font.PLAIN, 13));
		lblUsername.setBounds(162, 177, 61, 16);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Apple SD Gothic Neo", Font.PLAIN, 13));
		lblPassword.setBounds(162, 205, 61, 16);
		contentPane.add(lblPassword);
		
		JLabel lblRoomNo = new JLabel("Room No");
		lblRoomNo.setFont(new Font("Apple SD Gothic Neo", Font.PLAIN, 13));
		lblRoomNo.setBounds(162, 233, 61, 16);
		contentPane.add(lblRoomNo);
		
		JButton btnRelax = new JButton("Relax");
		btnRelax.setFont(new Font("Apple SD Gothic Neo", Font.PLAIN, 11));
		btnRelax.setBounds(309, 253, 67, 29);
		btnRelax.setBackground(Color.black);
	    btnRelax.setForeground(new Color(0, 0, 0));
		contentPane.add(btnRelax);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(95, 98, 358, 215);
		contentPane.add(panel);
		
		JLabel lblWelcomeToEhotel = new JLabel("eHOTEL");
		lblWelcomeToEhotel.setForeground(new Color(255, 255, 255));
		lblWelcomeToEhotel.setFont(new Font("Apple SD Gothic Neo", Font.BOLD | Font.ITALIC, 50));
		lblWelcomeToEhotel.setBackground(Color.BLACK);
		lblWelcomeToEhotel.setBounds(182, 24, 193, 62);
		contentPane.add(lblWelcomeToEhotel);
	}
}
