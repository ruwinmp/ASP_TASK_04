package ProgramDemo;

import java.lang.reflect.Field;

public class ReflectionClassI {
	//Main Method
	public static void main(String args[]) throws Exception{
		SimpleMainProcess simpMain = new SimpleMainProcess();
		//Get Field Declaration into array
		Field[] fieldArray = simpMain.getClass().getDeclaredFields();
		System.out.printf("This class have %d fields\n", fieldArray.length);
		//Show Field Details through the Loop
		int y = 0;
		for(Field f : fieldArray) {
			f.setAccessible(true);
			double val = f.getDouble(simpMain);
			val++;
			f.setDouble(simpMain, val);
			System.out.printf((y+=1)+". This field Name is=%s, Field Type is =%s, Field Value is=%f\n", f.getName(), f.getType(), f.getDouble(simpMain));
		}
	}
	
}
