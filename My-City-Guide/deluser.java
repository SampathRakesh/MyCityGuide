package swingreg;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Color;

public class deluser extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					deluser frame = new deluser();
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
	public deluser() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 912, 610);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setBounds(56, 87, 143, 359);
		contentPane.add(table);
		
		JLabel lblNewLabel = new JLabel("Enter name of user you want to delete\r\n");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel.setBounds(329, 87, 283, 39);
		contentPane.add(lblNewLabel);
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cont=DriverManager.getConnection("jdbc:mysql://localhost:3306/samdb","root","samj");
			String url="select name from logins";
			Statement sta=cont.createStatement();
			ResultSet rst=sta.executeQuery(url);
	    table.setModel(DbUtils.resultSetToTableModel(rst));
		}
		catch(Exception e)
		{
			
		}
		JButton btnNewButton = new JButton("Delete");
btnNewButton.setBounds(468, 178, 89, 23);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data =textField.getText();
				try {
		 			Class.forName("com.mysql.cj.jdbc.Driver");
		 			Connection cont=DriverManager.getConnection("jdbc:mysql://localhost:3306/samdb","root","samj");
		 			PreparedStatement ps=cont.prepareStatement("delete from logins where name=?");
		 			ps.setString(1, data);
				   int x=ps.executeUpdate();
				   if(x>0){
				    	JOptionPane.showMessageDialog(null, "Deleted successfully");
				    }
				   else
				   {
					   JOptionPane.showMessageDialog(null, "Unable to delete");
				}
				}
				catch(Exception ee)
				{
					ee.printStackTrace();
				}
			}
		});
		textField = new JTextField();
		textField.setBounds(425, 137, 129, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("F:\\chrome downloads\\1_BWd3FTQgq-awK349FpVKcA.jpeg"));
		lblNewLabel_1.setBounds(411, 248, 311, 300);
		contentPane.add(lblNewLabel_1);
	}
}
