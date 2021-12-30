package swingreg;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class homepage extends JFrame {
	/**
	 * @wbp.nonvisual location=292,-31
	 */
	private final JTextArea textArea = new JTextArea();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					homepage frame = new homepage();
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
	public homepage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 910, 601);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Home");
		mnNewMenu.setForeground(new Color(0, 0, 0));
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("Student");
		mnNewMenu_1.setForeground(new Color(25, 25, 112));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Schools");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scuframe ss=new scuframe();
				ss.setVisible(true);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Universities/Colleges");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scuframe ss=new scuframe();
				ss.setVisible(true);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Coaching Centres");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cc csiu=new cc();
				csiu.setVisible(true);
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
		
		mnNewMenu_1_1.add(mntmNewMenuItem_4);
		
		JMenu mnNewMenu_1_2 = new JMenu("Tourist");
		mnNewMenu_1_2.setForeground(new Color(0, 128, 0));
		menuBar.add(mnNewMenu_1_2);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("View Tourist Spots");
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				touristspot tf=new touristspot();
				tf.setVisible(true);
			}
		});
		mnNewMenu_1_2.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("View Hotels");
		mntmNewMenuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hotelframe hf=new hotelframe();
				hf.setVisible(true);
			}
			
		});
		mnNewMenu_1_2.add(mntmNewMenuItem_6);
		
		JMenu mnNewMenu_2 = new JMenu("Logout");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Logout");
		mntmNewMenuItem_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myframe mf=new myframe();
				mf.setVisible(true);
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_7);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CITY AT A GLANCE");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(670, 77, 146, 37);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("25.64 km2");
		lblNewLabel_1.setBounds(797, 126, 61, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Area \r\n");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(710, 125, 46, 14);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Population");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2_1.setBounds(692, 150, 75, 14);
		getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3 = new JLabel("142,185");
		lblNewLabel_3.setBounds(797, 152, 46, 14);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Area Rank");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4.setForeground(new Color(0, 0, 0));
		lblNewLabel_4.setBounds(692, 176, 75, 14);
		getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("20");
		lblNewLabel_5.setBounds(797, 177, 46, 14);
		getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Languages");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_6.setBounds(692, 201, 75, 14);
		getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Telugu");
		lblNewLabel_7.setBounds(797, 202, 46, 14);
		getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Literacy Rate");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_8.setBounds(692, 226, 91, 14);
		getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("83.41");
		lblNewLabel_9.setBounds(797, 227, 46, 14);
		getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("ABOUT THE CITY");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_10.setBounds(10, 11, 190, 37);
		getContentPane().add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Bhimavaram is a City in West Godavari district of the Andhra Pradesh state of India.");
		lblNewLabel_11.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_11.setBounds(10, 57, 514, 14);
		getContentPane().add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("It is the administrative headquarters of Bhimavaram mandal in Narasapuram revenue division.");
		lblNewLabel_12.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_12.setBounds(10, 89, 540, 14);
		getContentPane().add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("It is a part of Eluru Urban Development Authority. As of 2011 census, it is the second most");
		lblNewLabel_13.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_13.setBounds(10, 113, 606, 14);
		getContentPane().add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("populous urban area in the district with a population of 142,184");
		lblNewLabel_14.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_14.setBounds(10, 137, 451, 14);
		getContentPane().add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Bhimavaram is in the epicentre of the Godavari delta region.");
		lblNewLabel_15.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_15.setBounds(10, 162, 472, 14);
		getContentPane().add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("It is one of the principal trade centres of paddy in the state of Andhra Pradesh. ");
		lblNewLabel_16.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_16.setBounds(10, 187, 540, 14);
		getContentPane().add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("Agriculture-based businesses like food processing, aqua culture, rice mills etc.,");
		lblNewLabel_17.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_17.setBounds(10, 212, 472, 14);
		getContentPane().add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("Bhimavaram assembly constituency is a legislative assembly constituency (The MLA was Grandhi Srinivas)");
		lblNewLabel_18.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_18.setBounds(10, 237, 642, 14);
		getContentPane().add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("PUBLIC UTILITIES");
		lblNewLabel_19.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_19.setBounds(10, 280, 249, 14);
		getContentPane().add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel("ATM's");
		lblNewLabel_20.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				atmframe af=new atmframe();
				af.setVisible(true);
			}
		});
		lblNewLabel_20.setForeground(new Color(25, 25, 112));
		lblNewLabel_20.setFont(new Font("Urdu Typesetting", Font.BOLD, 15));
		lblNewLabel_20.setBounds(10, 317, 46, 14);
		getContentPane().add(lblNewLabel_20);
		
		JLabel lblNewLabel_21 = new JLabel("Banks");
		lblNewLabel_21.setForeground(new Color(0, 128, 0));
		lblNewLabel_21.setFont(new Font("Urdu Typesetting", Font.BOLD, 15));
		lblNewLabel_21.setBounds(10, 346, 46, 22);
		getContentPane().add(lblNewLabel_21);
		
		JLabel lblNewLabel_22 = new JLabel("Restaurants");
		lblNewLabel_22.setFont(new Font("Urdu Typesetting", Font.PLAIN, 15));
		lblNewLabel_22.setForeground(new Color(128, 0, 0));
		lblNewLabel_22.setBounds(10, 388, 81, 22);
		getContentPane().add(lblNewLabel_22);
		
		JLabel lblNewLabel_23 = new JLabel("Hospitals");
		lblNewLabel_23.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				hospitalframe hf=new hospitalframe();
				hf.setVisible(true);
			}
		});
		lblNewLabel_23.setFont(new Font("Urdu Typesetting", Font.PLAIN, 15));
		lblNewLabel_23.setForeground(new Color(255, 140, 0));
		lblNewLabel_23.setBounds(10, 433, 81, 22);
		getContentPane().add(lblNewLabel_23);
		
		JLabel lblNewLabel_24 = new JLabel("Police Stations");
		lblNewLabel_24.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				policeframe pf=new policeframe();
				pf.setVisible(true);
			}
		});
		lblNewLabel_24.setFont(new Font("Urdu Typesetting", Font.PLAIN, 15));
		lblNewLabel_24.setForeground(new Color(139, 0, 0));
		lblNewLabel_24.setBounds(10, 472, 103, 22);
		getContentPane().add(lblNewLabel_24);
		
		JLabel lblNewLabel_28 = new JLabel("* Railway Services");
		lblNewLabel_28.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				railframe rf=new railframe();
				rf.setVisible(true);
			}
		});
		lblNewLabel_28.setFont(new Font("Urdu Typesetting", Font.PLAIN, 15));
		lblNewLabel_28.setBounds(181, 313, 129, 22);
		getContentPane().add(lblNewLabel_28);
		
		JLabel lblNewLabel_29 = new JLabel("*Bus Services");
		lblNewLabel_29.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				busframe bf=new busframe();
				bf.setVisible(true);
			}
		});
		lblNewLabel_29.setFont(new Font("Urdu Typesetting", Font.PLAIN, 15));
		lblNewLabel_29.setBounds(181, 346, 113, 22);
		getContentPane().add(lblNewLabel_29);
		
		JLabel lblNewLabel_30 = new JLabel("New label");
		lblNewLabel_30.setIcon(new ImageIcon("F:\\chrome downloads\\bvr,m.png"));
		lblNewLabel_30.setBounds(432, 262, 452, 260);
		getContentPane().add(lblNewLabel_30);
		
		JLabel lblNewLabel_31 = new JLabel("New label");
		lblNewLabel_31.setIcon(new ImageIcon("F:\\chrome downloads\\Screenshot_20210713-104541_Chrome.jpg"));
		lblNewLabel_31.setBounds(640, 126, 20, 20);
		getContentPane().add(lblNewLabel_31);
		
		JLabel lblNewLabel_31_1 = new JLabel("New label");
		lblNewLabel_31_1.setIcon(new ImageIcon("F:\\chrome downloads\\aaa.jpg"));
		lblNewLabel_31_1.setBounds(640, 151, 20, 20);
		getContentPane().add(lblNewLabel_31_1);
		
		JLabel lblNewLabel_31_2 = new JLabel("New label");
		lblNewLabel_31_2.setIcon(new ImageIcon("F:\\chrome downloads\\20210713_104834.jpg"));
		lblNewLabel_31_2.setBounds(640, 177, 20, 20);
		getContentPane().add(lblNewLabel_31_2);
		
		JLabel lblNewLabel_31_3 = new JLabel("New label");
		lblNewLabel_31_3.setIcon(new ImageIcon("F:\\chrome downloads\\20210713_104700.jpg"));
		lblNewLabel_31_3.setBounds(640, 202, 20, 20);
		getContentPane().add(lblNewLabel_31_3);
		
		JLabel lblNewLabel_31_4 = new JLabel("New label");
		lblNewLabel_31_4.setIcon(new ImageIcon("F:\\chrome downloads\\Screenshot_20210713-104547_Chrome.jpg"));
		lblNewLabel_31_4.setBounds(640, 227, 20, 20);
		getContentPane().add(lblNewLabel_31_4);
	}
}
