package interfaces;

import java.sql.Date;

public interface IAnimal {

	
	
	void setName(String name);
	void setRace(String race);
	void setAge(int age);
	void setDate(Date beginDate,Date finalDate);
	
	
}
