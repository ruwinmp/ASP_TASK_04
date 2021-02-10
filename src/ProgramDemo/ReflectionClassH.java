package ProgramDemo;

import java.lang.reflect.Field;

public class ReflectionClassH {
	//Main Method
	public static void main(String args[]) throws Exception{
		SimpleMainProcess simpMain = new SimpleMainProcess();
		//Get Field Declaration into array
		Field[] fieldArray = simpMain.getClass().getDeclaredFields();
		//Show Field Details through the Loop
		int x = 0;
		System.out.printf("This class have %d fields\n", fieldArray.length);
		for(Field f : fieldArray) {
			System.out.printf((x+=1)+". Field Name is =%s, Field Type=%s, Field Accessible=%s\n", f.getName(), f.getType(), f.isAccessible());
		}
	}
	
}
