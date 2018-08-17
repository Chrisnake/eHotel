package eHotel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.DropMode;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class Messenger extends JFrame 
{
	private JPanel contentPane;
	static Messenger frame = new Messenger();
	/**
	 * @param frame: The frame for the Messenger class that makes it accessible to other objects
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

	public Messenger() 
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
		
		RoomClean logo = new RoomClean();
		logo.logoElements(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(106, 115, 339, 181);
		contentPane.add(scrollPane);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollPane.setRowHeaderView(scrollBar);
		
		JLabel lblNewLabel = new JLabel("Lobby: To go back to the home page, type and send goodbye!");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setFont(new Font("Apple SD Gothic Neo", Font.PLAIN, 12));
		scrollPane.setViewportView(lblNewLabel);
		
		JLabel lblLobbyWelomeTo = new JLabel("Lobby: Welome to eHotels, how can I help you?");
		lblLobbyWelomeTo.setVerticalAlignment(SwingConstants.TOP);
		lblLobbyWelomeTo.setFont(new Font("Apple SD Gothic Neo", Font.PLAIN, 12));
		scrollPane.setColumnHeaderView(lblLobbyWelomeTo);
		
		/*
		 * JButton and JTextField componenets
		 */
		
		JButton btnNewButton = new JButton("SEND");
		btnNewButton.setFont(new Font("Apple SD Gothic Neo", Font.PLAIN, 12));
		btnNewButton.setBounds(337, 308, 108, 44);
		contentPane.add(btnNewButton);
		
		JTextField textField = new JTextField();
		textField.setFont(new Font("Apple SD Gothic Neo", Font.PLAIN, 12));
		textField.setToolTipText("Type your message here");
		textField.setBounds(102, 308, 233, 44);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
