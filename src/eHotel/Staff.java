package eHotel;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;

public class Staff extends JFrame {

	public static Staff frame = new Staff();
	protected driver sqlDriver = new driver();

	/**
	 * @param frame: The frame for the FoodRequest class that makes it accessible to other objects
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

	public Staff() 
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

		JButton btnLobbyMessenger = new JButton("Lobby messenger");
		btnLobbyMessenger.setBounds(89, 315, 117, 29);
		contentPane.add(btnLobbyMessenger);
		btnLobbyMessenger.setFont(new Font("Apple SD Gothic Neo", Font.PLAIN, 10));
		btnLobbyMessenger.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Messenger.frame.setVisible(true);
				frame.dispose();
			}
		});
		
		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setFont(new Font("Apple SD Gothic Neo", Font.PLAIN, 11));
		textArea.setBounds(302, 22, 248, 356);
		updatetextArea(textArea);
		contentPane.add(textArea);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(302, -1, 248, 23);
		contentPane.add(panel);
		
		JLabel lblLiveUpdates = new JLabel("Live Updates");
		panel.add(lblLiveUpdates);
		lblLiveUpdates.setFont(new Font("Apple SD Gothic Neo", Font.BOLD, 15));
		
	}
	
	protected void updatetextArea(JTextArea txtArea) //Updates the live updates by going through the arraylist made from the sqldriver method.
	{
		int finalelement = sqlDriver.getUpdates().size();
		for(int i = 0; i < finalelement; i++)
		{
			txtArea.append(sqlDriver.getUpdates().get(i) + "\n");	
		}
	}	
}
	

