package eHotel;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;

public class FoodRequest extends JFrame 
{
	static FoodRequest frame = new FoodRequest();
	/**
	 * @param frame: The frame for the FoodRequest class that makes it accessible to other objects
	 * @param sqlDriver: driver class containing SQL back end logic
	 * @param Starters, Main, Desserts, Snacks, Drinks: String arrays containing the items for food ordering.
	 */
	
	protected String[] Starters = new String[]
	{"", "Beans and Toasted Bread: £3.00", "Canarian Potatoes with Mojo: £4.50", "Beef Tapsilog and fried egg: £5.00", "Wedges seasoned with Salt, Pepper and Cumin: £3.50",
	"Garlic Bread: £2.00", "Chili Nachos with Pulled Pork: £4.00", "Bulalo Beef Soup: £5.00", "Assorted Chicken Wings: £5.00"};
	
	protected String[] Main = new String[]
	{"", "Pan Roasted Porkchop w/Potatoes, Vegetables : £10.00", "Duck and Waffle: £11.00", "Indian Curry w/Pata Bread, Basmati Rice: £10.00", "Chinese Style Vegetable Stir Fry: £8.00",
	"Crispy Pork Belly w/Fried Rice, Spinach: £10.00", "Filipino Chicken Adobo w/Fried Rice: £10.00", "British Sunday Roast w/Potatoes, Vegetables: £10.00", "Beef Spaghetti w/Meatballs, Garlic Bread : £9.50"};
	
	protected String[] Desserts = new String[]
	{"", "Chocolate Ice Cream Waffle: £4.00", "Vanilla Ice Cream Waffle: £4.00", "Strawberry Ice Cream Waffle: £4.00", "Chocolate Brownie Ice Cream: £4.00", "Heavenly Slice of Chocolate Cake: £3.00", "Soft Filipino Mamon Cake: £4.00"};
	
	protected String[] Snacks = new String[]
	{"", "Walkers Ready Salted Crisps: £1.00", "Walkers Salt and Vinegar Crisps: £1.00", "Walkers Prawn Cocktail Crisps: £1.00", "Kit Kat Bar: £1.00", "Kinder Buneo Bar: £1.00", "Haribos Tangtastics: £2.00", "Skittles minipack: £1.00"};
	
	protected String[] Drinks = new String[]
	{"", "Bottled Mineral Water: £2.00", "Coca Cola Can: £1.00", "Sprite Can: £1.00", "Fanta Fruit Twist Can: £1.00", "Fresh Orange Juice: £2.00", "Fresh Apple Juice: £2.00"};
	
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
	
	public FoodRequest() 
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
		panel.setBounds(192, 80, 358, 298);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblStarters = new JLabel("STARTERS");
		lblStarters.setFont(new Font("Apple SD Gothic Neo", Font.BOLD, 14));
		lblStarters.setBounds(139, 22, 103, 16);
		panel.add(lblStarters);
		
		JLabel lblMainDishes = new JLabel("MAIN DISHES");
		lblMainDishes.setFont(new Font("Apple SD Gothic Neo", Font.BOLD, 14));
		lblMainDishes.setBounds(130, 72, 103, 16);
		panel.add(lblMainDishes);
		
		JLabel lblDesserts = new JLabel("DESSERTS");
		lblDesserts.setFont(new Font("Apple SD Gothic Neo", Font.BOLD, 14));
		lblDesserts.setBounds(141, 123, 103, 16);
		panel.add(lblDesserts);
		
		JLabel lblDrinks = new JLabel("DRINKS");
		lblDrinks.setFont(new Font("Apple SD Gothic Neo", Font.BOLD, 14));
		lblDrinks.setBounds(147, 220, 103, 16);
		panel.add(lblDrinks);
		
		JLabel lblSnacks = new JLabel("SNACKS");
		lblSnacks.setFont(new Font("Apple SD Gothic Neo", Font.BOLD, 14));
		lblSnacks.setBounds(147, 172, 103, 16);
		panel.add(lblSnacks);
		
		JComboBox StarterscomboBox = new JComboBox<String>(Starters);
		StarterscomboBox.setFont(new Font("Apple SD Gothic Neo", Font.PLAIN, 12));
		StarterscomboBox.setBounds(90, 39, 175, 27);
		panel.add(StarterscomboBox);
		
		JComboBox MenucomboBox = new JComboBox<String>(Main);
		MenucomboBox.setFont(new Font("Apple SD Gothic Neo", Font.PLAIN, 12));
		MenucomboBox.setBounds(90, 88, 175, 27);
		panel.add(MenucomboBox);
		
		JComboBox DessertcomboBox = new JComboBox<String>(Desserts);
		DessertcomboBox.setFont(new Font("Apple SD Gothic Neo", Font.PLAIN, 12));
		DessertcomboBox.setBounds(90, 139, 175, 27);
		panel.add(DessertcomboBox);
		
		JComboBox SnackscomboBox = new JComboBox<String>(Snacks);
		SnackscomboBox.setFont(new Font("Apple SD Gothic Neo", Font.PLAIN, 12));
		SnackscomboBox.setBounds(90, 188, 175, 27);
		panel.add(SnackscomboBox);
		
		JComboBox DrinkscomboBox = new JComboBox<String>(Drinks);
		DrinkscomboBox.setFont(new Font("Apple SD Gothic Neo", Font.PLAIN, 12));
		DrinkscomboBox.setBounds(90, 236, 175, 27);
		panel.add(DrinkscomboBox);
		
		/*
		 * JButton componenets
		 */
		
		JButton btnHome = new JButton("Home");
		btnHome.setBounds(6, 263, 62, 29);
		panel.add(btnHome);
		btnHome.setFont(new Font("Apple SD Gothic Neo", Font.PLAIN, 7));
		
		JButton btnOrder = new JButton("Order");
		btnOrder.setFont(new Font("Apple SD Gothic Neo", Font.PLAIN, 7));
		btnOrder.setBounds(290, 260, 62, 29);
		panel.add(btnOrder);
		
		
		btnHome.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				HomePage.frame.setVisible(true);
				frame.dispose();
			}
		});
		
		ImageIcon imageIcon = new ImageIcon(new ImageIcon("/Users/christianvillegas/Documents/Summer Project/eHotel/menu .jpeg").getImage().getScaledInstance(1000, 1000, Image.SCALE_DEFAULT));
		
		JLabel foodLabel = new JLabel("ORDER FROM OUR MENU");
		foodLabel.setBounds(234, 20, 282, 39);
		contentPane.add(foodLabel);
		foodLabel.setForeground(new Color(255, 255, 255));
		foodLabel.setFont(new Font("Apple SD Gothic Neo", Font.BOLD | Font.ITALIC, 24));
		foodLabel.setBackground(Color.BLACK);
		
		JLabel lblfood = new JLabel("From refreshments to meals, just sit back and click!");
		lblfood.setBounds(210, 50, 333, 16);
		contentPane.add(lblfood);
		lblfood.setForeground(new Color(102, 102, 102));
		lblfood.setFont(new Font("Apple SD Gothic Neo", Font.ITALIC, 15));
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(-605, 0, 797, 378);
		contentPane.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("/Users/christianvillegas/Documents/Summer Project/eHotel/menu .jpeg"));
	}
}
