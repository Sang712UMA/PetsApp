package org.halkidiki.petsapp.adriGUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

public class SignUp extends JFrame {

	private JPanel contentPane;
	JTextField textUser;
	JTextField textPassword;
	JButton btnCreateAccount;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp frame = new SignUp();
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
	public SignUp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 239, 191);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSetNickname = new JLabel("Set Nickname:");
		lblSetNickname.setBounds(10, 47, 86, 14);
		contentPane.add(lblSetNickname);
		
		textUser = new JTextField();
		textUser.setBounds(117, 44, 86, 20);
		contentPane.add(textUser);
		textUser.setColumns(10);
		
		JLabel lblSetPassword = new JLabel("Set Password:");
		lblSetPassword.setBounds(10, 78, 101, 14);
		contentPane.add(lblSetPassword);
		
		textPassword = new JTextField();
		textPassword.setBounds(117, 75, 86, 20);
		contentPane.add(textPassword);
		textPassword.setColumns(10);
		
		btnCreateAccount = new JButton("Create Account");
		btnCreateAccount.setBounds(77, 112, 126, 23);
		contentPane.add(btnCreateAccount);
		
		JLabel lblSignUpGui = new JLabel("Sign Up -- GUI");
		lblSignUpGui.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSignUpGui.setBounds(10, 11, 101, 14);
		contentPane.add(lblSignUpGui);
	}

}
