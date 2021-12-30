package swingreg;

import java.awt.BorderLayout;


import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.sql.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class myframe extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					myframe frame = new myframe();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public myframe() {
		setForeground(Color.WHITE);
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 910, 601);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBackground(SystemColor.textHighlightText);
		textField.setFont(new Font("Segoe Print", Font.PLAIN, 13));
		textField.setBounds(342, 243, 186, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("SIGNIN");
		btnNewButton.setFont(new Font("Sitka Text", Font.PLAIN, 11));
		btnNewButton.setBackground(new Color(51, 153, 255));
		btnNewButton.setForeground(SystemColor.inactiveCaptionText);
		btnNewButton.setBounds(342, 375, 89, 23);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ef)
			{
				try
				{
					String n=textField.getText();
					String p=passwordField.getText();
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/samdb","root","samj");
					String ur="select name,password from logins where name='"+n+"' and password='"+p+"'";
				    Statement st=con.createStatement();
				    ResultSet rs=st.executeQuery(ur);
				    if(rs.next())
				    {
				    	homepage sll=new homepage();
				    	sll.setVisible(true);
				    }
				    else
				    {
				    	JOptionPane.showMessageDialog(null, "Please check your password");
				    }
				}
				catch(Exception abc)
				{
					abc.printStackTrace();
				}
		}});
		
		JLabel lblNewLabel = new JLabel("username");
		lblNewLabel.setForeground(SystemColor.text);
		lblNewLabel.setBackground(SystemColor.text);
		lblNewLabel.setFont(new Font("Aharoni", Font.BOLD, 15));
		lblNewLabel.setBounds(342, 218, 85, 14);
		contentPane.add(lblNewLabel);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Segoe Print", Font.PLAIN, 15));
		passwordField.setEchoChar('*');
		passwordField.setBounds(342, 304, 186, 23);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_3 = new JLabel("Password");
		lblNewLabel_3.setForeground(SystemColor.text);
		lblNewLabel_3.setFont(new Font("AR CENA", Font.BOLD, 15));
		lblNewLabel_3.setBounds(342, 279, 157, 14);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton_1 = new JButton("REGISTER");
		btnNewButton_1.setBounds(441, 373, 89, 25);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Mayor Login");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mayorlogin ml=new mayorlogin();
				ml.setVisible(true);
			}
		});
		lblNewLabel_1.setFont(new Font("AR CENA", Font.PLAIN, 15));
		lblNewLabel_1.setForeground(new Color(128, 0, 0));
		lblNewLabel_1.setBounds(816, 11, 77, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("CITY GUIDE");
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setFont(new Font("AR JULIAN", Font.PLAIN, 34));
		lblNewLabel_2.setBounds(342, 11, 221, 48);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_7 = new JLabel("show");
		lblNewLabel_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				passwordField.setEchoChar((char)0);
			}
			
		});
		lblNewLabel_7.setIcon(new ImageIcon("F:\\chrome downloads\\eye-icon-vector-design-web-260nw-1714712071.jpg"));
		lblNewLabel_7.setBounds(546, 310, 17, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("F:\\chrome downloads\\city.png"));
		lblNewLabel_5.setBounds(0, 0, 893, 562);
		contentPane.add(lblNewLabel_5);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				Regform r=new Regform();
				r.setVisible(true);
			}
		});
	}
}
