package ProgramDemo;

import static Testing.K_Unit_Test.*;

import java.io.IOException;
import java.lang.reflect.*;
import java.sql.SQLException;


class SimpleMainTest {
	
	
	public static void main(String args[]) throws IOException, SQLException{
		SimpleMainProcess s = new SimpleMainProcess(3.5, 2.5);
		
		checkEquals(s.getC(), 3.5);
		checkNotEquals(s.getD(), 2.5);
		checkEquals(s.getD(), 2.5);
		
		SimpleMainProcess str = new SimpleMainProcess("apple", "orange");
		checkEquals(str.getClassA(), "apple");
		
		Field field = null;
		try {
			field = s.getClass().getDeclaredField("c");
		} catch (NoSuchFieldException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    field.setAccessible(true);
	    try {
			checkEquals(field.getDouble(s), 2.225);
		} catch (IllegalArgumentException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
		report();	
	}
}
