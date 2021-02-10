package Testing;

import java.util.*;

import org.apache.logging.log4j.*;

public class K_Unit_Test {
  private static List<String> checks;
  private static int checksMade = 0;
  private static int passedChecks = 0;
  private static int failedChecks = 0;


  private static void addToReport(String txt) {
    if (checks == null) {
      checks = new LinkedList<String>();
    }
    checks.add(String.format("%04d: %s", checksMade++, txt));
  }

  public static void checkEquals(double value1, double value2) {
    if (value1 == value2) {
      addToReport(String.format("  %f == %f", value1, value2));
      passedChecks++;
    } else {
      addToReport(String.format("* %f == %f", value1, value2));
      failedChecks++;
    }
  }

  public static void checkNotEquals(double value1, double value2) {
    if (value1 != value2) {
      addToReport(String.format("  %f != %f", value1, value2));
      passedChecks++;
    } else {
      addToReport(String.format("* %f != %f", value1, value2));
      failedChecks++;
    }
  }

  public static void checkEquals(String str1, String str2) {
	  if (str1 == str2) {
	      addToReport(String.format("  %s == %s", str1, str2));
	      passedChecks++;
	    } else {
	      addToReport(String.format("* %s == %s", str1, str2));
	      failedChecks++;
	    }
  }
  
  public static void checkNotEquals(String str1, String str2) {
	    if (str1 != str2) {
	      addToReport(String.format("  %s != %s", str1, str2));
	      passedChecks++;
	    } else {
	      addToReport(String.format("* %s != %s", str1, str2));
	      failedChecks++;
	    }
	  }
  
  public void stringComparison(String str1, String str2) {
	  try {
		  if(str1 == str2) {
			  System.out.printf("%s and %s are equal.", str1, str2);
			  passedChecks++;
		  }else {
			  System.out.printf("%s and %s are not equal.", str1, str2);
			  failedChecks++;
		  }
	  }catch(Exception e) {
		  System.out.println("Exceptioin occurred.");
	  }
  }
  
  public static void report() {
	  
    Logger log = LogManager.getLogger(K_Unit_Test.class);
	log.debug(passedChecks + " checks passed");
	log.info(failedChecks + " checks falied");
	
	
	
    System.out.printf("%d checks passed\n", passedChecks);
    System.out.printf("%d checks failed\n", failedChecks);
    System.out.println();
    

    for (String check : checks) {
      System.out.println(check);
    }
  }
}
