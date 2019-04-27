package bll;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class UserManager<User> {

	
	private User user; 
	
	public static <TUser> void showUser(TUser user){
		
		System.out.println(user);
	}
	
}
