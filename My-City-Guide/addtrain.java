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
import java.awt.Color;

public class addtrain extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addtrain frame = new addtrain();
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
	public addtrain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 230, 140));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("desttination");
		lblNewLabel.setBounds(10, 32, 64, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("time\r\n");
		lblNewLabel_1.setBounds(10, 82, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("trainName");
		lblNewLabel_2.setBounds(10, 148, 64, 14);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(109, 29, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(109, 79, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(109, 145, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String dest,time,name;
				dest=	textField.getText();
				time=textField_1.getText();
		        name=textField_2.getText();
				try {
		 			Class.forName("com.mysql.cj.jdbc.Driver");
		 			Connection cont=DriverManager.getConnection("jdbc:mysql://localhost:3306/samdb","root","samj");
		 			PreparedStatement ps=cont.prepareStatement("insert into railways(dest,time,name)values(?,?,?);");
		 			ps.setString(1, dest);
		 			ps.setString(2, time);
		 			ps.setString(3, name);
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
		btnNewButton.setBounds(109, 194, 89, 23);
		contentPane.add(btnNewButton);
	}

}
