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
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;

public class Staff extends JFrame {

	public static Staff frame = new Staff();
	protected driver sqlDriver = new driver();
	public static JTextArea textArea = new JTextArea();
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
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(Color.WHITE);
		tabbedPane.setBounds(30, 54, 484, 301);
		contentPane.add(tabbedPane);
		
		JPanel LiveUpdates = new JPanel();
		LiveUpdates.setBackground(Color.WHITE);
		tabbedPane.addTab("Live Updates", null, LiveUpdates, null);
		LiveUpdates.setLayout(new BorderLayout(0, 0));
		
		JLabel lblLiveUpdates = new JLabel("Towel and Room Clean Live Updates");
		lblLiveUpdates.setHorizontalAlignment(SwingConstants.CENTER);
		LiveUpdates.add(lblLiveUpdates, BorderLayout.NORTH);
		lblLiveUpdates.setFont(new Font("Apple SD Gothic Neo", Font.BOLD, 15));
		
		JScrollPane scrollPane = new JScrollPane();
		LiveUpdates.add(scrollPane, BorderLayout.CENTER);
		
		textArea = new JTextArea();
		textArea.setFont(new Font("Apple SD Gothic Neo", Font.PLAIN, 13));
		scrollPane.setViewportView(textArea);
		updatetextArea(textArea);
		
		JPanel FoodOrders = new JPanel();
		FoodOrders.setBackground(Color.WHITE);
		tabbedPane.addTab("Food Orders", null, FoodOrders, null);
		
		JPanel CleanUp = new JPanel();
		CleanUp.setBackground(Color.WHITE);
		tabbedPane.addTab("Room Clean", null, CleanUp, null);
		
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
	

