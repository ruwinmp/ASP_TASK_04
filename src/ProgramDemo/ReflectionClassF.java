package ProgramDemo;

public class ReflectionClassF {
	//Main Method
	public static void main(String args[]) {
		SimpleMainProcess simpMain = new SimpleMainProcess();
		//Show Private and Public Both Fields of SimpleMainProcess Through Public Method
		simpMain.squareC();
		System.out.println("Square Values : " + simpMain);
	}
	
}
