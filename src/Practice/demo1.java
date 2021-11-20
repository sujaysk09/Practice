package Practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class demo1 {

	@Test
	public void start()
	{
		Reporter.log("passed", true);
		System.out.println("new method");
	}

}
