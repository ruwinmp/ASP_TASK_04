package ProgramDemo;
import java.lang.reflect.Method;

public class ReflectionClassE {
	//Main Method
	public static void main(String args[]) throws Exception{
		SimpleMainProcess simpMain = new SimpleMainProcess();
		//Get Methods Declaration into array
		Method[] methodArray = simpMain.getClass().getMethods();
		System.out.printf("There are %d methods\n",methodArray.length);
		//Show Method Details through the Loop
		int x = 0;
		for(Method m: methodArray) {
			System.out.printf((x+=1)+". Method Name is =%s, Type is =%s, Parameters=\n", m.getName(), m.getReturnType());
			Class[] classTypes = m.getParameterTypes();
			for(Class cls : classTypes) {
				System.out.print(cls.getName() + "");
			}
			System.out.println();
		}
	}
	
}
