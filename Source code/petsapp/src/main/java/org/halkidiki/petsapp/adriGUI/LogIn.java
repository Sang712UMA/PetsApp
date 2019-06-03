package org.halkidiki.petsapp.adriGUI;

/**
 * 
 * @Author: Adrian
 * 
 */

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LogIn extends JFrame {

	private JPanel contentPane;
	JTextField textUser;
	JTextField textPassword;
	JButton btnLogIn;
	JButton btnSignUp;
	JLabel lblPassword;
	JLabel lblUser;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogIn frame = new LogIn();
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
	public LogIn() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setBounds(100, 100, 219, 227);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPetsappBackend = new JLabel("PetsAPP -- BackEnd Deployment");
		lblPetsappBackend.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPetsappBackend.setBounds(10, 11, 291, 14);
		contentPane.add(lblPetsappBackend);
		
		textUser = new JTextField();
		textUser.setBounds(78, 47, 86, 20);
		contentPane.add(textUser);
		textUser.setColumns(10);
		
		textPassword = new JTextField();
		textPassword.setBounds(78, 78, 86, 20);
		contentPane.add(textPassword);
		
		lblUser = new JLabel("User:");
		lblUser.setBounds(30, 47, 37, 14);
		contentPane.add(lblUser);
		
		lblPassword = new JLabel("Password: ");
		lblPassword.setBounds(10, 81, 68, 14);
		contentPane.add(lblPassword);
		
		btnLogIn = new JButton("Log In");
		btnLogIn.setBounds(78, 109, 89, 23);
		contentPane.add(btnLogIn);
		
		btnSignUp = new JButton("Sign Up");
		btnSignUp.setBounds(78, 143, 89, 23);
		contentPane.add(btnSignUp);
	}

}
