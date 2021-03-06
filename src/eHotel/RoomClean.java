package eHotel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class RoomClean extends JFrame 
{
	private JPanel contentPane;
	public static RoomClean frame = new RoomClean();
	protected driver sqlDriver = new driver();
	
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

	public RoomClean() 
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
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(95, 111, 358, 215);
		contentPane.add(panel);
		panel.setLayout(null);
		
		logoElements(contentPane);
		
		JLabel roomcleanLabel = new JLabel("ROOM CLEAN");
		roomcleanLabel.setBounds(100, 22, 154, 39);
		panel.add(roomcleanLabel);
		roomcleanLabel.setForeground(Color.BLACK);
		roomcleanLabel.setFont(new Font("Apple SD Gothic Neo", Font.BOLD | Font.ITALIC, 24));
		roomcleanLabel.setBackground(Color.BLACK);
		
		JLabel lblUponPressingConfirm = new JLabel("Upon pressing confirm, cleaning staff will come to your room in approximately 30 minutes ");
		lblUponPressingConfirm.setFont(new Font("Apple SD Gothic Neo", Font.PLAIN, 8));
		lblUponPressingConfirm.setBounds(30, 165, 328, 16);
		panel.add(lblUponPressingConfirm);
		
		JLabel lblCleanlinessIsA = new JLabel("Cleanliness is a click away!");
		lblCleanlinessIsA.setForeground(new Color(102, 102, 102));
		lblCleanlinessIsA.setFont(new Font("Apple SD Gothic Neo", Font.ITALIC, 20));
		lblCleanlinessIsA.setBounds(66, 58, 274, 16);
		panel.add(lblCleanlinessIsA);
		
		/*
		 * JButton componenets
		 */
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.setFont(new Font("Apple SD Gothic Neo", Font.PLAIN, 10));
		btnConfirm.setBounds(125, 110, 96, 29);
		panel.add(btnConfirm);
		btnConfirm.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				sqlDriver.updateClean(sqlDriver.currentTime(), LogIn.userDetails); //Updates the database staff table.
				HomePage.frame.setVisible(true);
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

	public void logoElements(JPanel contentPane) //Collection of elements for the logo of the software. 
	{
		JLabel lblWelcomeToEhotel = new JLabel("eHOTELS");
		lblWelcomeToEhotel.setForeground(new Color(255, 255, 255));
		lblWelcomeToEhotel.setFont(new Font("Apple SD Gothic Neo", Font.BOLD | Font.ITALIC, 50));
		lblWelcomeToEhotel.setBackground(Color.BLACK);
		lblWelcomeToEhotel.setBounds(168, 24, 214, 62);
		contentPane.add(lblWelcomeToEhotel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(0, 78, 559, 5);
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(0, 17, 559, 5);
		contentPane.add(panel_2);
	}
}
