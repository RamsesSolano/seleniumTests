package threeC.seleniumTests.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class MainWindow extends JFrame{
	
	
	JButton addUrl; 
	JTextField urlToAdd; 
	JTable listsUrl; 
	JLabel labelUrlToAdd;
	JLabel description;

	
	public MainWindow ( ) {
		super("Tests");
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		String title = "Tests"; 
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.description = new JLabel("Welcome, in this program you can review the errors in the console that appear in any web page, please add the url's that you want to evaluate and then press send, the program will show you a report with the errors in the console that are shown in each url."); 
		this.urlToAdd = new JTextField(); 
		this.labelUrlToAdd = new JLabel("Please enter a url to evaluate");
				
		this.add(this.description);
		this.add(this.labelUrlToAdd);
		this.add(this.urlToAdd);
		
		this.description.setBounds(25, 25, screenSize.width, 50);
		this.labelUrlToAdd.setBounds(100, 100, 200, 150);
		this.urlToAdd.setBounds(350, 100, 200, 150);
	}	
	
}
