package eHotel;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class HomePage extends JFrame 
{
	static HomePage frame = new HomePage();
	/**
	 * @param frame: The frame for the HomePage class that makes it accessible to other objects
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

	public HomePage() 
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
	
		JLabel usernameLabel = new JLabel("");
		usernameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		usernameLabel.setText(LogIn.username);
		usernameLabel.setForeground(Color.BLACK);
		usernameLabel.setFont(new Font("Apple SD Gothic Neo", Font.PLAIN, 22));
		usernameLabel.setBackground(Color.BLACK);
		usernameLabel.setBounds(288, 67, 244, 39);
		contentPane.add(usernameLabel);
		
		JPanel logoPanel2 = new JPanel();
		logoPanel2.setBackground(new Color(255, 255, 255));
		logoPanel2.setBounds(0, 25, 276, 5);
		contentPane.add(logoPanel2);
		
		JPanel logoPanel1 = new JPanel();
		logoPanel1.setBackground(Color.WHITE);
		logoPanel1.setBounds(0, 96, 276, 5);
		contentPane.add(logoPanel1);
		
		JLabel label = new JLabel("★★★★");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Apple SD Gothic Neo", Font.BOLD, 25));
		label.setBounds(85, 300, 267, 48);
		contentPane.add(label);
		
		JLabel lblStarHotel = new JLabel("4 STAR HOTELS");
		lblStarHotel.setForeground(Color.WHITE);
		lblStarHotel.setFont(new Font("Apple SD Gothic Neo", Font.PLAIN, 20));
		lblStarHotel.setBounds(63, 330, 141, 48);
		contentPane.add(lblStarHotel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(266, 0, 284, 378);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(-636, 277, 920, 78);
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("/Users/christianvillegas/Documents/Summer Project/eHotel/homeImage.jpg"));
		
		/*
		 * JButton componenets
		 */

		JButton btnOrderFood = new JButton("Order Food");
		btnOrderFood.setBounds(87, 212, 117, 29);
		panel.add(btnOrderFood);
		btnOrderFood.setFont(new Font("Apple SD Gothic Neo", Font.PLAIN, 10));
		
		JButton btnRequestTowels = new JButton("Request Towels");
		btnRequestTowels.setBounds(87, 182, 117, 29);
		panel.add(btnRequestTowels);
		btnRequestTowels.setFont(new Font("Apple SD Gothic Neo", Font.PLAIN, 10));
		
		JButton btnRoomClean = new JButton("Room Clean");
		btnRoomClean.setBounds(87, 152, 117, 29);
		panel.add(btnRoomClean);
		btnRoomClean.setFont(new Font("Apple SD Gothic Neo", Font.PLAIN, 10));
		
		JButton btnLobbyMessenger = new JButton("Lobby messenger");
		btnLobbyMessenger.setBounds(87, 122, 117, 29);
		panel.add(btnLobbyMessenger);
		btnLobbyMessenger.setFont(new Font("Apple SD Gothic Neo", Font.PLAIN, 10));
		btnLobbyMessenger.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Messenger.frame.setVisible(true);
				frame.dispose();
			}
		});	
		btnRoomClean.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				RoomClean.frame.setVisible(true);
				frame.dispose();
			}
		});	
		btnRequestTowels.addActionListener(new ActionListener() 
		{ 
			public void actionPerformed(ActionEvent e) 
			{
				TowelsRequest.frame.setVisible(true);
				frame.dispose();
			}
		});	
		btnOrderFood.addActionListener(new ActionListener() 
		{ 
			public void actionPerformed(ActionEvent e) 
			{
				FoodRequest.frame.setVisible(true);
				frame.dispose();
			}
		});	
	}

}
