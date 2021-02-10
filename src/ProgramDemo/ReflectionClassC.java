package ProgramDemo;
import java.lang.reflect.Field;

public class ReflectionClassC {
	//Main Method
	public static void main(String args[]) throws Exception{
		SimpleMainProcess simpMain = new SimpleMainProcess();
		//Get Field Declaration into array
		Field[] fieldArray = simpMain.getClass().getDeclaredFields();
		//Show Field Details through the Loop
		System.out.printf("This Class Has %d Fields :  ", fieldArray.length);
		for(Field f: fieldArray) {
			System.out.printf("Name of the Field=%s type=%s Value of the Field=%f : ", f.getName(), f.getType(), f.getDouble(simpMain));
		}
	}
	
}
