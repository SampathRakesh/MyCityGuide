package swingreg;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.ComboBoxEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

public class rentframe extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					rentframe frame = new rentframe();
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
	public rentframe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 902, 611);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Home");
		mnNewMenu.setForeground(new Color(0, 0, 0));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("HomePage");
		mntmNewMenuItem_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				homepage hp=new homepage();
			    hp.setVisible(true);	
			}
		});
		mnNewMenu.add(mntmNewMenuItem_7);
		
		JMenu mnNewMenu_1 = new JMenu("Student");
		mnNewMenu_1.setForeground(new Color(25, 25, 112));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Schools");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scuframe scf=new scuframe();
				scf.setVisible(true);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Universities/Colleges");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scuframe scf=new scuframe();
				scf.setVisible(true);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Coaching Centres");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cc sihc=new cc();
				sihc.setVisible(true);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem);
		
		JMenu mnNewMenu_1_1 = new JMenu("JobSeeker");
		mnNewMenu_1_1.setForeground(new Color(139, 0, 0));
		menuBar.add(mnNewMenu_1_1);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Find a job");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Jobframe jf=new Jobframe();
				jf.setVisible(true);
			}
		});
		
		mnNewMenu_1_1.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Find a room");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rentframe rf=new rentframe();
				rf.setVisible(true);
			}
		});
		
		mnNewMenu_1_1.add(mntmNewMenuItem_4);
		
		JMenu mnNewMenu_1_2 = new JMenu("Tourist");
		mnNewMenu_1_2.setForeground(new Color(0, 128, 0));
		menuBar.add(mnNewMenu_1_2);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("View Tourist Spots");
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				touristspot ts=new touristspot();
				ts.setVisible(true);
			}
		});
		mnNewMenu_1_2.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("View Hotels");
		mntmNewMenuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hotelframe scf=new hotelframe();
				scf.setVisible(true);
			}
			
			
		});
		mnNewMenu_1_2.add(mntmNewMenuItem_6);
		getContentPane().setLayout(null);
		JLabel lblNewLabel = new JLabel("Enter your preferred RENT");
		lblNewLabel.setFont(new Font("Andalus", Font.PLAIN, 17));
		lblNewLabel.setBounds(54, 25, 433, 44);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(330, 35, 107, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		table = new JTable();
		table.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		table.setForeground(new Color(0, 0, 0));
		table.setBackground(new Color(127, 255, 212));
		table.setBounds(170, 207, 486, 223);
		contentPane.add(table);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "GreenWoods", "HitechCity", "HopeVillage", "UnionCetre"}));
		comboBox.setBounds(330, 80, 107, 22);
		contentPane.add(comboBox);
		
		JButton btnNewButton_1 = new JButton("Submit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ar=textField.getText();
				int i=Integer.parseInt(ar);
				String data=comboBox.getSelectedItem().toString();
				try {
		 			Class.forName("com.mysql.cj.jdbc.Driver");
		 			Connection cont=DriverManager.getConnection("jdbc:mysql://localhost:3306/samdb","root","samj");
		 			String ur="select * from forrent where AREA='"+data+"' and RENT<'"+i+"'";
				    Statement st=cont.createStatement();
				    ResultSet rs=st.executeQuery(ur);
				    table.setModel(DbUtils.resultSetToTableModel(rs));
				}
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
			}
		});
		btnNewButton_1.setBounds(348, 126, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblChooseYourPreferred = new JLabel("Choose your Preferred area");
		lblChooseYourPreferred.setFont(new Font("Andalus", Font.PLAIN, 18));
		lblChooseYourPreferred.setBounds(54, 71, 433, 44);
		contentPane.add(lblChooseYourPreferred);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("F:\\chrome downloads\\53315141-blur-house-background.jpg"));
		lblNewLabel_1.setBounds(0, 0, 886, 550);
		contentPane.add(lblNewLabel_1);
	
	}
}
