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
		
		JLabel lblWelcomeToEhotel = new JLabel("eHOTELS");
		lblWelcomeToEhotel.setForeground(new Color(255, 255, 255));
		lblWelcomeToEhotel.setFont(new Font("Apple SD Gothic Neo", Font.BOLD | Font.ITALIC, 50));
		lblWelcomeToEhotel.setBackground(Color.BLACK);
		lblWelcomeToEhotel.setBounds(170, 25, 215, 62);
		contentPane.add(lblWelcomeToEhotel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(138, 78, 280, 5);
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(138, 22, 280, 5);
		contentPane.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(138, 24, 10, 58);
		contentPane.add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(408, 24, 10, 58);
		contentPane.add(panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(-19, 48, 162, 10);
		contentPane.add(panel_5);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		panel_6.setBounds(416, 48, 162, 10);
		contentPane.add(panel_6);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(106, 95, 339, 181);
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
		
		JButton btnNewButton = new JButton("SEND");
		btnNewButton.setFont(new Font("Apple SD Gothic Neo", Font.PLAIN, 12));
		btnNewButton.setBounds(337, 288, 108, 44);
		contentPane.add(btnNewButton);
		
		JTextField textField = new JTextField();
		textField.setFont(new Font("Apple SD Gothic Neo", Font.PLAIN, 12));
		textField.setToolTipText("Type your message here");
		textField.setBounds(102, 288, 233, 44);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
