package ProgramDemo;

import java.lang.reflect.Field;

public class ReflectionClassG {
	//Main Method
	public static void main(String args[]) throws Exception{
		SimpleMainProcess simpMain = new SimpleMainProcess();
		//Get Field Declaration into array
		Field[] fieldArray = simpMain.getClass().getFields();
		//Show Field Details through the Loop
		int x = 0;
		System.out.printf("This class have %d fields :  ", fieldArray.length);
		for(Field f: fieldArray) {
			System.out.printf((x+=1)+". Field Name=%s, Field Type is =%s, Field Value=%f\n", f.getName(), f.getType(), f.getDouble(simpMain));
		}
	}
	
}
