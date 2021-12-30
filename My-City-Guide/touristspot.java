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
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;

public class touristspot extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					touristspot frame = new touristspot();
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
	public touristspot() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 911, 609);
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
		contentPane.setLayout(null);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("F:\\chrome downloads\\maxresdefault (1).jpg"));
		lblNewLabel.setBounds(24, 21, 243, 173);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("F:\\chrome downloads\\37278930_1885837448147655_1820813228649742336_n.jpg"));
		lblNewLabel_1.setBounds(451, 21, 320, 173);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("F:\\chrome downloads\\download.jpg"));
		lblNewLabel_2.setBounds(12, 281, 256, 173);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("F:\\chrome downloads\\cache20190625_055236_big73368773-2e01-40ed-a510-787b1aee68cd_big.jpg"));
		lblNewLabel_3.setBounds(624, 281, 199, 151);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("F:\\chrome downloads\\img-20190810-170436-largejpg.jpg"));
		lblNewLabel_4.setBounds(361, 284, 214, 145);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Rupanthara church");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(24, 189, 164, 43);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("P.P Road");
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		lblNewLabel_6.setBounds(24, 230, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Undi Road");
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setBounds(488, 231, 69, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_5_1 = new JLabel("Geetha Multiplex");
		lblNewLabel_5_1.setForeground(Color.WHITE);
		lblNewLabel_5_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblNewLabel_5_1.setBounds(488, 189, 164, 43);
		contentPane.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_8 = new JLabel("Gunupudi");
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setBounds(12, 523, 46, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("P.P Road");
		lblNewLabel_9.setForeground(Color.WHITE);
		lblNewLabel_9.setBounds(361, 523, 46, 14);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_5_2 = new JLabel("Someswara Temple\r\n");
		lblNewLabel_5_2.setForeground(Color.WHITE);
		lblNewLabel_5_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblNewLabel_5_2.setBounds(10, 469, 164, 43);
		contentPane.add(lblNewLabel_5_2);
		
		JLabel lblNewLabel_5_3 = new JLabel("Mavullama Temple");
		lblNewLabel_5_3.setForeground(Color.WHITE);
		lblNewLabel_5_3.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblNewLabel_5_3.setBounds(361, 469, 164, 43);
		contentPane.add(lblNewLabel_5_3);
		
		JLabel lblNewLabel_5_4 = new JLabel("Veeramma Park");
		lblNewLabel_5_4.setForeground(Color.WHITE);
		lblNewLabel_5_4.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblNewLabel_5_4.setBounds(607, 469, 164, 43);
		contentPane.add(lblNewLabel_5_4);
		
		JLabel lblNewLabel_10 = new JLabel("Near Busstand");
		lblNewLabel_10.setForeground(Color.WHITE);
		lblNewLabel_10.setBounds(607, 523, 87, 14);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("New label");
		lblNewLabel_11.setIcon(new ImageIcon("F:\\chrome downloads\\dream.jpg"));
		lblNewLabel_11.setBounds(0, 0, 895, 548);
		contentPane.add(lblNewLabel_11);
	}
}
