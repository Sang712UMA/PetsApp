package org.halkidiki.petsapp.adriGUI;

/**
 * 
 * @Author: Adrian
 * 
 */

import java.awt.EventQueue;

import javax.swing.JOptionPane;

import org.halkidiki.petsapp.accounts.Account;
import org.halkidiki.petsapp.accounts.AccountManager;
import org.halkidiki.petsapp.accounts.User;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class mainWindow {

	private AccountManager accountManager = AccountManager.getActiveAccountManager();
	private LogIn logIn;
	private SignUp signUp;
	private User user;
	private SuccessLog succesLog;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainWindow window = new mainWindow();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public mainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		logIn = new LogIn();
		signUp = new SignUp();
		succesLog = new SuccessLog();
		logIn.setVisible(true);

		logIn.btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Account account = accountManager.login(logIn.textUser.getText(), logIn.textPassword.getText());
					user = (User) account;
					logIn.setVisible(false);
					succesLog.setVisible(true);
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(logIn, "User not valid");
				}
			}
		});
		logIn.btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				logIn.setVisible(false);
				signUp.setVisible(true);
			}
		});

		signUp.btnCreateAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				User user = new User();
				user.setNickName(signUp.textUser.getText());
				user.setPassword(signUp.textPassword.getText());

				accountManager.addAccount(user);

				signUp.setVisible(false);
				logIn.setVisible(true);
			}
		});

	}
}
