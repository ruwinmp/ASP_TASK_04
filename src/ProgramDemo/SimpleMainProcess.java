package ProgramDemo;

public class SimpleMainProcess {
	  public double value_1 = 10.5;
	  private double value_2 = 5;
	  
	  public String firstName = "Jhon";
	  private String lastName = "Felix";
	  
	  
	  public SimpleMainProcess(){}
	  
	  public SimpleMainProcess(double c, double d) {
		  this.value_1 = c;
		  this.value_2 = d;
	  }
	  
	  public void squareC() {
		  this.value_1 *= this.value_2;
	  }
	  
	  public double get_val1() {
		  return value_1;
	  }
	  
	  public double get_val2() {
		  return value_2;
	  }
	   
	  public String toString() {
		  return String.format("(c:%f, d:%f)", value_1, value_2);
	  }
	  
	  public SimpleMainProcess(String str1, String str2) {
		  this.firstName = str1;
		  this.lastName = str2;
	  }
	  
	  public void StringClassA() {
		  this.firstName += this.firstName;
	  }
	  
	  public String getClassA() {
		  return firstName;
	  }
	  
	  public void StringClassB() {
		  this.lastName += this.lastName;
	  }
	  
	  public String getClassB() {
		  return lastName;
	  }
	  
	  public double getC() {
		  return value_1;
	  }
	  
	  private void setC(double c) {
		  this.value_1 = c;
	  }
	  
	  public double getD() {
		  return value_2;
	  }
	  
	  private void setD(double d) {
		  this.value_2 = d;
	  }
}
