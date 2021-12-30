package swingreg;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class mayorframe extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mayorframe frame = new mayorframe();
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
	public mayorframe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 903, 610);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(72, 209, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Add a new rented house");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				addrent ar=new addrent();
				ar.setVisible(true);
			}
		});
		lblNewLabel.setBounds(123, 74, 256, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblAddANew = new JLabel("Add a new job opening");
		lblAddANew.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				addjob aj=new addjob();
				aj.setVisible(true);
			}
		});
		lblAddANew.setBounds(123, 116, 256, 31);
		contentPane.add(lblAddANew);
		
		JLabel lblAddANew_1 = new JLabel("Add a new train service");
		lblAddANew_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				addtrain at=new addtrain();
				at.setVisible(true);
			}
		});
		lblAddANew_1.setBounds(123, 158, 256, 31);
		contentPane.add(lblAddANew_1);
		
		JLabel lblAddANew_2 = new JLabel("Add a new bus service\r\n");
		lblAddANew_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				addbus ab=new addbus();
				ab.setVisible(true);
			}
		});
		lblAddANew_2.setBounds(123, 200, 256, 31);
		contentPane.add(lblAddANew_2);
		
		JLabel lblNewLabel_1 = new JLabel("View Users");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				usersview uv=new usersview();
				uv.setVisible(true);
			}
		});
		lblNewLabel_1.setBounds(702, 82, 72, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Delete an User");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				deluser du=new deluser();
				du.setVisible(true);
			}
		});
		lblNewLabel_2.setBounds(702, 124, 133, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Add an User");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Regform rf=new Regform();
				rf.setVisible(true);			}
		});
		lblNewLabel_3.setBounds(702, 166, 102, 14);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Home");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myframe mf=new myframe();
				mf.setVisible(true);
			}
		});
		btnNewButton.setBounds(10, 11, 89, 23);
		contentPane.add(btnNewButton);
	}
}
