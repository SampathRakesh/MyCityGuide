package swingreg;

import java.awt.BorderLayout;
import java.sql.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class addrent extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addrent frame = new addrent();
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
	public addrent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Owner Name");
		lblNewLabel.setBounds(34, 24, 62, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Type\r\n");
		lblNewLabel_1.setBounds(34, 61, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Area");
		lblNewLabel_2.setBounds(34, 99, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Rent");
		lblNewLabel_3.setBounds(34, 140, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Conatctno");
		lblNewLabel_4.setBounds(34, 184, 77, 14);
		contentPane.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(148, 21, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(148, 58, 86, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(148, 96, 86, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(148, 137, 86, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(148, 181, 86, 20);
		contentPane.add(textField_4);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String on,t,a,cn;
				on=	textField.getText();
				t=	textField_1.getText();
				a=	textField_2.getText();
				cn=	textField_4.getText();
				String ar=textField_3.getText();
				int i=Integer.parseInt(ar);
				try {
		 			Class.forName("com.mysql.cj.jdbc.Driver");
		 			Connection cont=DriverManager.getConnection("jdbc:mysql://localhost:3306/samdb","root","samj");
		 			PreparedStatement ps=cont.prepareStatement("insert into forrent (OWNERNAME,TYPE,AREA,RENT,CONTACTNO)values(?,?,?,?,?);");
		 			ps.setString(1, on);
		 			ps.setString(2, t);
		 			ps.setString(3, a);
		 			ps.setInt(4, i);
		 			ps.setString(5, cn);
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
				catch(Exception ef)
				{
					ef.printStackTrace();
				}
				
			}
		});
		btnNewButton.setBounds(148, 227, 89, 23);
		contentPane.add(btnNewButton);
	}
}
