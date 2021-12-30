package swingreg;

import java.awt.BorderLayout;
import net.proteanit.sql.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;

import javax.swing.border.MatteBorder;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;

public class railframe extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					railframe frame = new railframe();
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
	public railframe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 912, 610);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
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
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.WHITE);
		comboBox.setForeground(new Color(0, 0, 0));
		comboBox.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		comboBox.setMaximumRowCount(4);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Vijayawada", "Secundrebad", "Vizag", "Rajhamundry", "Chennai", "Bengaluru", "Kakinada"}));
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(90, 116, 143, 38);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("VIEW");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String data=comboBox.getSelectedItem().toString();
						try {
				 			Class.forName("com.mysql.cj.jdbc.Driver");
				 			Connection cont=DriverManager.getConnection("jdbc:mysql://localhost:3306/samdb","root","samj");
				 			String ur="select * from railways where dest='"+data+"'";
						    Statement st=cont.createStatement();
						    ResultSet rs=st.executeQuery(ur);
						    table.setModel(DbUtils.resultSetToTableModel(rs));
						    
						}
						catch(Exception ex)
						{
							ex.printStackTrace();
						}
					}});
			}
		});
		
		btnNewButton.setBounds(274, 126, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Choose Your Destination");
		lblNewLabel_1.setFont(new Font("Andalus", Font.BOLD, 19));
		lblNewLabel_1.setBounds(90, 50, 217, 31);
		contentPane.add(lblNewLabel_1);
		
		table = new JTable();
		table.setBackground(new Color(169, 169, 169));
		table.setForeground(new Color(0, 0, 255));
		table.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		table.setBounds(90, 272, 344, 216);
		contentPane.add(table);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("F:\\chrome downloads\\old-steel-construction-railway-station-blurred-background-2210x1473.jpg"));
		lblNewLabel.setBounds(0, 0, 896, 549);
		contentPane.add(lblNewLabel);
	}
}
