package swingreg;

import java.awt.BorderLayout;


import java.awt.Color;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class hotelframe extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hotelframe frame = new hotelframe();
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
	public hotelframe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 911, 610);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
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
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\rakesh\\Pictures\\Screenshots\\Screenshot (45).png"));
		lblNewLabel_1.setBounds(10, 40, 479, 123);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Book Here");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				    java.awt.Desktop.getDesktop().browse(java.net.URI.create("https://www.makemytrip.com/hotels/bhimavaram-hotels.html"));
				     }
					catch(Exception ekk)
					{
						ekk.printStackTrace();
					}
			}
		});
		btnNewButton.setBounds(702, 140, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1_1 = new JLabel("New label");
		lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\rakesh\\Pictures\\Screenshots\\Screenshot (47).png"));
		lblNewLabel_1_1.setBounds(10, 174, 479, 123);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("New label");
		lblNewLabel_1_1_1.setIcon(new ImageIcon("C:\\Users\\rakesh\\Pictures\\Screenshots\\Screenshot (49).png"));
		lblNewLabel_1_1_1.setBounds(10, 308, 479, 123);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("New label");
		lblNewLabel_1_1_2.setIcon(new ImageIcon("C:\\Users\\rakesh\\Pictures\\Screenshots\\Screenshot (48).png"));
		lblNewLabel_1_1_2.setBounds(10, 442, 487, 123);
		contentPane.add(lblNewLabel_1_1_2);
		
		JButton btnNewButton_1 = new JButton("Book Here");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				    java.awt.Desktop.getDesktop().browse(java.net.URI.create("https://www.yatra.com/hotels/hotels-in-bhimavaram/hotel-sri-greeen-view-international"));
				     }
					catch(Exception ekk)
					{
						ekk.printStackTrace();
					}
			}
		});
		btnNewButton_1.setBounds(702, 269, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Book Here");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				    java.awt.Desktop.getDesktop().browse(java.net.URI.create("https://www.yatra.com/hotels/hotels-in-bhimavaram/hotel-grand-leela-krishna"));
				     }
					catch(Exception ekk)
					{
						ekk.printStackTrace();
					}
			}
		});
		btnNewButton_2.setBounds(702, 408, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Book Here");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				    java.awt.Desktop.getDesktop().browse(java.net.URI.create("https://www.cleartrip.com/hotels/details/falcons-nest-bhimavaram-710644"));
				     }
					catch(Exception ekk)
					{
						ekk.printStackTrace();
					}
			}
		});
		btnNewButton_3.setBounds(702, 515, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("Hotel Susheels Nest");
		lblNewLabel.setFont(new Font("Urdu Typesetting", Font.BOLD, 15));
		lblNewLabel.setBounds(635, 93, 156, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_5 = new JLabel("Hotel Greenview");
		lblNewLabel_5.setFont(new Font("Urdu Typesetting", Font.BOLD, 15));
		lblNewLabel_5.setBounds(635, 212, 164, 43);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblHotelLeelakrishna = new JLabel("Hotel  leelakrishna");
		lblHotelLeelakrishna.setFont(new Font("Urdu Typesetting", Font.BOLD, 15));
		lblHotelLeelakrishna.setBounds(635, 362, 156, 31);
		contentPane.add(lblHotelLeelakrishna);
		
		JLabel lblFalconsNest = new JLabel("Falcons Nest");
		lblFalconsNest.setFont(new Font("Urdu Typesetting", Font.BOLD, 15));
		lblFalconsNest.setBounds(635, 469, 156, 31);
		contentPane.add(lblFalconsNest);
	}
}
