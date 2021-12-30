package swingreg;

import java.awt.BorderLayout;


import java.awt.EventQueue;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import java.awt.Checkbox;
import java.awt.Color;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class Regform extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Regform frame = new Regform();
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
	public Regform() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 910, 601);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Cambria", Font.PLAIN, 14));
		lblNewLabel.setBounds(179, 98, 77, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Gender");
		lblNewLabel_1.setFont(new Font("Cambria", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(179, 137, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("DOB");
		lblNewLabel_2.setFont(new Font("Cambria", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(179, 179, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Mobile");
		lblNewLabel_3.setFont(new Font("Cambria", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(179, 224, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Password");
		lblNewLabel_4.setFont(new Font("Cambria", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(179, 270, 77, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Confirm\r\n");
		lblNewLabel_5.setFont(new Font("Cambria", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(179, 318, 65, 14);
		contentPane.add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.setBounds(310, 96, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Male");
		chckbxNewCheckBox.setBackground(Color.WHITE);
		chckbxNewCheckBox.setBounds(310, 135, 65, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Female");
		chckbxNewCheckBox_1.setBackground(Color.WHITE);
		chckbxNewCheckBox_1.setBounds(377, 135, 97, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		
		passwordField = new JPasswordField();
		passwordField.setBounds(310, 269, 86, 20);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(310, 317, 86, 20);
		contentPane.add(passwordField_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"jan", "feb", "mar", "apr", "may", "jun", "jul", "aug", "sep", "oct", "nov", "dec"}));
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(377, 177, 58, 22);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBackground(Color.WHITE);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox_1.setBounds(310, 177, 45, 22);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005"}));
		comboBox_2.setBounds(449, 177, 58, 22);
		contentPane.add(comboBox_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(310, 223, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Student");
		rdbtnNewRadioButton.setBackground(Color.WHITE);
		rdbtnNewRadioButton.setMnemonic('*');
		rdbtnNewRadioButton.setBounds(179, 384, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Jobseeker");
		rdbtnNewRadioButton_1.setBackground(Color.WHITE);
		rdbtnNewRadioButton_1.setBounds(287, 384, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Tourist");
		rdbtnNewRadioButton_2.setBackground(Color.WHITE);
		rdbtnNewRadioButton_2.setBounds(421, 384, 109, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		ButtonGroup bg=new ButtonGroup();
		bg.add(rdbtnNewRadioButton); bg.add(rdbtnNewRadioButton_2); bg.add(rdbtnNewRadioButton_1);
		 textField_2 = new JTextField();
		 textField_2.setBounds(310, 357, 86, 20);
		 contentPane.add(textField_2);
		 textField_2.setColumns(10);
	
 JButton btnNewButton = new JButton("SUBMIT");
 btnNewButton.addActionListener(new ActionListener() {
 	public void actionPerformed(ActionEvent e) {
 		String n,gen,p,m,r,email;
 		n=textField.getText();
 		String cp=passwordField_1.getText();
 		if(chckbxNewCheckBox.isSelected())
 		{
 			gen="male";
 		}
 		else
 		{
 			gen="female";
 		}
 		p=passwordField.getText();
 		m=textField_1.getText();
 		email= textField_2.getText();
 		int counter=passwordField.getPassword().length;
 		String pswd=passwordField_1.getPassword().toString();
 		if(rdbtnNewRadioButton.isSelected()) {
 			r="Student";
 		}
 		else if(rdbtnNewRadioButton_1.isSelected()) {
 			r="JobSeeker";
 		}
 		else
 		{
 			r="Tourist";
 		}
 		if(counter<8)
 		{
 			JOptionPane.showMessageDialog(null,"password requirements not matched");
 		}
 		else
 		{
 		if(!p.equalsIgnoreCase(cp))
 		{
 			JOptionPane.showMessageDialog(null, "Confirm password and password not matched");
 		}
 		else
 		{
 		if (m.length()==10)
 		{
 		try {
 			Class.forName("com.mysql.cj.jdbc.Driver");
 			Connection cont=DriverManager.getConnection("jdbc:mysql://localhost:3306/samdb","root","samj");
 			PreparedStatement ps=cont.prepareStatement("insert into logins(name,gender,password,role,mobile,email)values(?,?,?,?,?,?);");
 			ps.setString(1, n);
 			ps.setString(2, gen);
 			ps.setString(3, p);
 			ps.setString(4, r);
 			ps.setString(5, m);
 			ps.setString(6, email);
 			int x=ps.executeUpdate();
 			if(x>0)
 			{
 				JOptionPane.showMessageDialog(null, "Successfully inserted");
 			}
 			else
 			{
 				JOptionPane.showMessageDialog(null, "not inserted");
 			}
 		}
 		catch(Exception ekk)
 		{
 			ekk.printStackTrace();
 		}
 		}
 		else
 		{
 			textField_1.setBackground(Color.red);
 		}
 	}
 	}
 	}
 });
 btnNewButton.setBounds(310, 429, 89, 23);
 contentPane.add(btnNewButton);
 
 JLabel lblNewLabel_6 = new JLabel("Email");
 lblNewLabel_6.setFont(new Font("Cambria", Font.PLAIN, 15));
 lblNewLabel_6.setBounds(179, 355, 46, 14);
 contentPane.add(lblNewLabel_6);
 
 JLabel lblNewLabel_8 = new JLabel("New label");
 lblNewLabel_8.setIcon(new ImageIcon("F:\\chrome downloads\\b.jpg"));
 lblNewLabel_8.setBounds(559, 126, 306, 307);
 contentPane.add(lblNewLabel_8);
 
 JLabel lblNewLabel_9 = new JLabel("Registration Form");
 lblNewLabel_9.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
 lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
 lblNewLabel_9.setBounds(179, 25, 351, 36);
 contentPane.add(lblNewLabel_9);
 
 

	}
}
