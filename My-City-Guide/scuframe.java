package swingreg;

import java.awt.BorderLayout;
import java.awt.Color;
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
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class scuframe extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					scuframe frame = new scuframe();
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
	public scuframe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 912, 610);
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
			hp.setVisible(true);}
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
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\rakesh\\Pictures\\Screenshots\\bvbschool.png"));
		lblNewLabel.setBounds(164, 11, 234, 74);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\rakesh\\Pictures\\Screenshots\\bsms.png"));
		lblNewLabel_2.setBounds(408, 11, 234, 74);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\rakesh\\Pictures\\Screenshots\\bwb.png"));
		lblNewLabel_1.setBounds(652, 11, 234, 74);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\rakesh\\Pictures\\Screenshots\\Screenshot (54).png"));
		lblNewLabel_3.setBounds(164, 96, 234, 74);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\rakesh\\Pictures\\Screenshots\\bst.png"));
		lblNewLabel_4.setBounds(408, 96, 234, 74);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\rakesh\\Pictures\\Screenshots\\Screenshot (55).png"));
		lblNewLabel_5.setBounds(652, 96, 234, 74);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\rakesh\\Pictures\\Screenshots\\ctir.png"));
		lblNewLabel_6.setBounds(164, 203, 234, 74);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\rakesh\\Pictures\\Screenshots\\Screenshot (56).png"));
		lblNewLabel_7.setBounds(408, 203, 234, 74);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\rakesh\\Pictures\\Screenshots\\Screenshot (57).png"));
		lblNewLabel_8.setBounds(652, 203, 234, 74);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
				    java.awt.Desktop.getDesktop().browse(java.net.URI.create("https://www.google.co.in"));
				     }
					catch(Exception ekk)
					{
						ekk.printStackTrace();
					}
			}
		});
		lblNewLabel_9.setIcon(new ImageIcon("C:\\Users\\rakesh\\Pictures\\Screenshots\\ecv.png"));
		lblNewLabel_9.setBounds(10, 355, 226, 183);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_9_1 = new JLabel("New label");
		lblNewLabel_9_1.setIcon(new ImageIcon("C:\\Users\\rakesh\\Pictures\\Screenshots\\estt.png"));
		lblNewLabel_9_1.setBounds(246, 355, 226, 183);
		contentPane.add(lblNewLabel_9_1);
		
		JLabel lblNewLabel_9_2 = new JLabel("New label");
		lblNewLabel_9_2.setIcon(new ImageIcon("C:\\Users\\rakesh\\Pictures\\Screenshots\\Screenshot (51).png"));
		lblNewLabel_9_2.setBounds(482, 355, 226, 183);
		contentPane.add(lblNewLabel_9_2);
		
		JLabel lblNewLabel_9_3 = new JLabel("New label");
		lblNewLabel_9_3.setIcon(new ImageIcon("C:\\Users\\rakesh\\Pictures\\Screenshots\\Screenshot (50).png"));
		lblNewLabel_9_3.setBounds(718, 355, 168, 183);
		contentPane.add(lblNewLabel_9_3);
		
		JLabel lblNewLabel_10 = new JLabel("ENGINEERING COLLEGES");
		lblNewLabel_10.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		lblNewLabel_10.setBounds(346, 305, 244, 24);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Inter Colleges");
		lblNewLabel_11.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		lblNewLabel_11.setBounds(25, 233, 111, 24);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Schools");
		lblNewLabel_12.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		lblNewLabel_12.setBounds(46, 80, 75, 14);
		contentPane.add(lblNewLabel_12);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 192, 203));
		panel.setBounds(10, 11, 876, 181);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(240, 255, 255));
		panel_1.setBounds(10, 192, 876, 102);
		contentPane.add(panel_1);
	}
}
