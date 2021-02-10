package ProgramDemo;
import java.lang.reflect.Field;

public class ReflectionClassD {
	//Main Method
	public static void main(String args[]) throws Exception{
		SimpleMainProcess simpMain = new SimpleMainProcess();
		//Get Field Declaration into array
		Field[] fieldArray = simpMain.getClass().getDeclaredFields();
		//Show Field Details through the Loop
		System.out.printf("This class have %d Fields\n", fieldArray.length);
		for(Field f : fieldArray) {
			f.setAccessible(true);
			System.out.printf("This Field Name is =%s, Type is =%s, Value is =%f\n",f.getName(), f.getType(), f.getDouble(simpMain));
		}
	}
	
}
