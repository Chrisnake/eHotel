package eHotel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class HomePage extends JFrame 
{
	private JPanel contentPane;
	static HomePage frame = new HomePage();
	
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

	public HomePage() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(255, 204, 51));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		/*
		 * JPanel and JLabel componenets
		 */
		
		JLabel lblWelcomeToEhotel = new JLabel("eHOTELS");
		lblWelcomeToEhotel.setForeground(new Color(255, 255, 255));
		lblWelcomeToEhotel.setFont(new Font("Apple SD Gothic Neo", Font.BOLD | Font.ITALIC, 50));
		lblWelcomeToEhotel.setBackground(Color.BLACK);
		lblWelcomeToEhotel.setBounds(25, 36, 215, 62);
		contentPane.add(lblWelcomeToEhotel);
		
		JLabel welcomeLabel = new JLabel("WELCOME");
		welcomeLabel.setForeground(Color.BLACK);
		welcomeLabel.setFont(new Font("Apple SD Gothic Neo", Font.BOLD, 28));
		welcomeLabel.setBackground(Color.BLACK);
		welcomeLabel.setBounds(342, 36, 150, 39);
		contentPane.add(welcomeLabel);
	
		JLabel usernameLabel = new JLabel("Christian!");
		usernameLabel.setForeground(Color.BLACK);
		usernameLabel.setFont(new Font("Apple SD Gothic Neo", Font.PLAIN, 22));
		usernameLabel.setBackground(Color.BLACK);
		usernameLabel.setBounds(363, 67, 88, 39);
		contentPane.add(usernameLabel);
		
		JPanel logoPanel2 = new JPanel();
		logoPanel2.setBackground(new Color(255, 255, 255));
		logoPanel2.setBounds(0, 23, 276, 10);
		contentPane.add(logoPanel2);
		
		JPanel logoPanel1 = new JPanel();
		logoPanel1.setBackground(Color.WHITE);
		logoPanel1.setBounds(0, 96, 276, 10);
		contentPane.add(logoPanel1);
		
		/*
		 * JButton componenets
		 */
		
		JButton btnLobbyMessenger = new JButton("Lobby messenger");
		btnLobbyMessenger.setFont(new Font("Apple SD Gothic Neo", Font.PLAIN, 10));
		btnLobbyMessenger.setBounds(352, 148, 117, 29);
		contentPane.add(btnLobbyMessenger);
		btnLobbyMessenger.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Messenger.frame.setVisible(true);
				frame.dispose();
			}
		});	
		
		JButton btnRoomClean = new JButton("Room Clean");
		btnRoomClean.setFont(new Font("Apple SD Gothic Neo", Font.PLAIN, 10));
		btnRoomClean.setBounds(352, 178, 117, 29);
		contentPane.add(btnRoomClean);
		btnRoomClean.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				RoomClean.frame.setVisible(true);
				frame.dispose();
			}
		});	
		
		
		JButton btnRequestTowels = new JButton("Request Towels");
		btnRequestTowels.setFont(new Font("Apple SD Gothic Neo", Font.PLAIN, 10));
		btnRequestTowels.setBounds(352, 208, 117, 29);
		contentPane.add(btnRequestTowels);
		btnRequestTowels.addActionListener(new ActionListener() 
		{ 
			public void actionPerformed(ActionEvent e) 
			{
				TowelsRequest.frame.setVisible(true);
				frame.dispose();
			}
		});	
		
		JButton btnOrderFood = new JButton("Order Food");
		btnOrderFood.setFont(new Font("Apple SD Gothic Neo", Font.PLAIN, 10));
		btnOrderFood.setBounds(352, 238, 117, 29);
		contentPane.add(btnOrderFood);
		btnOrderFood.addActionListener(new ActionListener() 
		{ 
			public void actionPerformed(ActionEvent e) 
			{
				FoodRequest.frame.setVisible(true);
				frame.dispose();
			}
		});	
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(266, 0, 284, 378);
		contentPane.add(panel);
		panel.setLayout(null);
	}

}
