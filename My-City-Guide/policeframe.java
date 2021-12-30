package swingreg;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;

public class policeframe extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					policeframe frame = new policeframe();
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
	public policeframe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 912, 610);
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

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\rakesh\\Pictures\\Screenshots\\Screenshot (60).png"));
		lblNewLabel.setBounds(10, 29, 876, 177);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\rakesh\\Pictures\\Screenshots\\Screenshot (59).png"));
		lblNewLabel_1.setBounds(10, 213, 886, 28);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\rakesh\\Pictures\\Screenshots\\Screenshot (58).png"));
		lblNewLabel_2.setBounds(10, 252, 886, 197);
		contentPane.add(lblNewLabel_2);
	}
}
