package ProgramDemo;

public class ReflectionClassB {
	public static void main(String args[]) {
		//Show Class Name from SimpleMainProcess Class
		SimpleMainProcess simpMain = new SimpleMainProcess();
		System.out.println("This Class Name is : " + simpMain.getClass().getName());
	}
}
