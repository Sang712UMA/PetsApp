package org.halkidiki.petsapp.adriGUI;

/**
 * 
 * @Author: Adrian
 * 
 */

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class SuccessLog extends JFrame {

	private JPanel contentPane;
	JButton btnCreateNotification;
	JButton btnCreatePost;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SuccessLog frame = new SuccessLog();
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
	public SuccessLog() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 200, 150);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnCreateNotification = new JButton("Create Notification");
		btnCreateNotification.setBounds(10, 29, 160, 23);
		contentPane.add(btnCreateNotification);
		
		btnCreatePost = new JButton("Create Post");
		btnCreatePost.setBounds(10, 63, 160, 23);
		contentPane.add(btnCreatePost);
	}

}
