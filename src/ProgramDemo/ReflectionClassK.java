package ProgramDemo;

import java.lang.reflect.Method;

public class ReflectionClassK {
	//Main Method
	public static void main(String args[]) throws Exception{
		SimpleMainProcess simpMain = new SimpleMainProcess();
		//Get methods data
		Method methodData = simpMain.getClass().getDeclaredMethod("setC",double.class);
		methodData.setAccessible(true);
		methodData.invoke(simpMain, 50);
		System.out.println(simpMain);
	}
}
