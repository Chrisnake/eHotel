package eHotel;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class TowelsRequest extends JFrame 
{
	static TowelsRequest frame = new TowelsRequest();
	protected driver sqlDriver = new driver();

	/**
	 * @param frame: The frame for the TowelsRequest class that makes it accessible to other objects
	 * @param sqlDriver: driver class containing SQL back end logic
	 */
	
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try {frame.setVisible(true);} 
				catch (Exception e) {e.printStackTrace();}
			}
		});
	}

	public TowelsRequest() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 400);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(255, 204, 51));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		/*
		 * JPanel and JLabel componenets
		 */
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(95, 106, 358, 215);
		contentPane.add(panel);
		panel.setLayout(null);
		
		RoomClean logo = new RoomClean();
		logo.logoElements(contentPane);
		
		JLabel towelsLabel = new JLabel("TOWEL REFRESH");
		towelsLabel.setBounds(86, 22, 202, 39);
		panel.add(towelsLabel);
		towelsLabel.setForeground(Color.BLACK);
		towelsLabel.setFont(new Font("Apple SD Gothic Neo", Font.BOLD | Font.ITALIC, 24));
		towelsLabel.setBackground(Color.BLACK);
		
		JLabel lblUponPressingConfirm = new JLabel("Upon pressing confirm, cleaning staff will come to your room in approximately 30 minutes ");
		lblUponPressingConfirm.setFont(new Font("Apple SD Gothic Neo", Font.PLAIN, 8));
		lblUponPressingConfirm.setBounds(30, 165, 328, 16);
		panel.add(lblUponPressingConfirm);
		
		JLabel lbltowel = new JLabel("Fresh towels are a click away!");
		lbltowel.setForeground(new Color(102, 102, 102));
		lbltowel.setFont(new Font("Apple SD Gothic Neo", Font.ITALIC, 20));
		lbltowel.setBounds(57, 58, 274, 16);
		panel.add(lbltowel);
		
		/*
		 * JButton componenets
		 */
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.setFont(new Font("Apple SD Gothic Neo", Font.PLAIN, 10));
		btnConfirm.setBounds(129, 110, 96, 29);
		panel.add(btnConfirm);
		btnConfirm.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				HomePage.frame.setVisible(true);
				sqlDriver.updateTowels(sqlDriver.currentTime(), LogIn.userDetails);
				frame.dispose();
			}
		});
		
		JButton btnHome = new JButton("Home");
		btnHome.setFont(new Font("Apple SD Gothic Neo", Font.PLAIN, 7));
		btnHome.setBounds(10, 338, 62, 29);
		contentPane.add(btnHome);
		btnHome.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				HomePage.frame.setVisible(true);
				frame.dispose();
			}
		});
	}
}
