package swingreg;

import java.awt.BorderLayout;
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
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;

public class addbus extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addbus frame = new addbus();
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
	public addbus() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Destination");
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
		lblNewLabel.setBounds(36, 57, 93, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Time");
		lblNewLabel_1.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(57, 122, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(161, 54, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(161, 120, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String dest,time;
				dest=	textField.getText();
				time=textField_1.getText();
				try {
		 			Class.forName("com.mysql.cj.jdbc.Driver");
		 			Connection cont=DriverManager.getConnection("jdbc:mysql://localhost:3306/samdb","root","samj");
		 			PreparedStatement ps=cont.prepareStatement("insert into buses(Destination,time)values(?,?);");
		 			ps.setString(1, dest);
		 			ps.setString(2, time);
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
		btnNewButton.setBounds(158, 178, 89, 23);
		contentPane.add(btnNewButton);
	}

}
