package org.halkidiki.petsapp.adriGUI;

/**
 * 
 * @Author: Adrian
 * 
 */

import java.awt.EventQueue;

import javax.swing.JOptionPane;

import org.halkidiki.petsapp.Pet;
import org.halkidiki.petsapp.accounts.Account;
import org.halkidiki.petsapp.accounts.AccountManager;
import org.halkidiki.petsapp.accounts.User;
import org.halkidiki.petsapp.notifications.NotificationManager;
import org.halkidiki.petsapp.notifications.PetNotification;
import org.halkidiki.petsapp.post.FoundPets;
import org.halkidiki.petsapp.post.PostManager;

import java.awt.event.ActionListener;
import java.util.Date;
import java.awt.event.ActionEvent;

public class mainWindow {

	private AccountManager accountManager = AccountManager.getActiveAccountManager();
	private NotificationManager notificationManager = NotificationManager.getActiveNotificationManager();
	private PostManager postManager = PostManager.getActivePostManager();
	private LogIn logIn;
	private LogIn logIn2;
	private SignUp signUp;
	private SignUp signUp2;
	private User user;
	private User user2;
	private SuccessLog succesLog;
	private SuccessLog succesLog2;

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
		logIn2 = new LogIn();
		signUp = new SignUp();
		signUp2 = new SignUp();
		succesLog = new SuccessLog();
		succesLog2 = new SuccessLog();
		logIn.setVisible(true);
		logIn2.setVisible(true);

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
		logIn2.btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Account account2 = accountManager.login(logIn2.textUser.getText(), logIn2.textPassword.getText());
					user2 = (User) account2;
					logIn2.setVisible(false);
					succesLog2.setVisible(true);
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(logIn2, "User not valid");
				}
			}
		});
		logIn.btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				logIn.setVisible(false);
				signUp.setVisible(true);
			}
		});
		logIn2.btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				logIn2.setVisible(false);
				signUp2.setVisible(true);
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
		signUp2.btnCreateAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				User user2 = new User();
				user2.setNickName(signUp2.textUser.getText());
				user2.setPassword(signUp2.textPassword.getText());
				
				accountManager.addAccount(user2);
				
				signUp2.setVisible(false);
				logIn2.setVisible(true);
			}
		});
		succesLog.btnCreatePost.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int petType = 0;
				String sex = "Male";
				boolean neutralization = true;
				String chip = "MLG32040";
				int age = 30;
				String name = "Unknown";
				String details = "Japanese Akita dog. Golden light brown.";
				FoundPets foundPet = new FoundPets(new Date(),"Malaga, Plaza Mayor");
				foundPet.setPet(new Pet(petType,0, sex,neutralization,chip,age,name,details));
				postManager.addPost(foundPet);
				JOptionPane.showMessageDialog(succesLog2, "This may be your dog: Japanese Akita Dog. Golden light brown.");
			}
		});
		succesLog2.btnCreatePost.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int petType = 0;
				String sex = "Female";
				boolean neutralization = true;
				String chip = "MLG32040";
				int age = 24;
				String name = "Unknown";
				String details = "Border collie. Black hair with white paws and belly";
				FoundPets foundPet2 = new FoundPets(new Date(),"Malaga, Plaza Mayor");
				foundPet2.setPet(new Pet(petType,0, sex,neutralization,chip,age,name,details));
				postManager.addPost(foundPet2);
				JOptionPane.showMessageDialog(succesLog, "This may be your dog: Border collie. Black hair with white paws and belly");				
			}
		});
		succesLog.btnCreateNotification.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PetNotification hachikoHasBeenLost = new PetNotification(user, 0, 0, 2, 12, 24);
				notificationManager.addNotification(hachikoHasBeenLost);
			}
		});
		succesLog2.btnCreateNotification.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PetNotification hachikoHasBeenLost2 = new PetNotification(user2, 0, 0, 2, 25, 60);
				notificationManager.addNotification(hachikoHasBeenLost2);
			}
		});

	}
}
