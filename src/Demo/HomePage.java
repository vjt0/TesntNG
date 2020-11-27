package Demo;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


@Listeners(Listen.Listener.class) 
public class HomePage {
	@AfterTest
	public void later() {
		System.out.println("Eexecute last");
	}
	@Parameters("keyword")
	@Test(groups = {"people"})
	public void test(String keyword) {
		System.out.println(keyword);
	}
	@Test
	public void adding() {
		Calculator cal=new Calculator();
		Assert.assertEquals(cal.add(5,10),15);
		System.out.println("Method 2");
	}
	@Test
	public void dividing() {
		Calculator cal=new Calculator();
		Assert.assertEquals(cal.divide(5,0),1);
		
	}
	@Test(dependsOnMethods = {"adding","dividing"}, alwaysRun=true)
	public void method2() {
		System.out.println("Method 2");
	}
@BeforeTest
public void login() {
	System.out.println("Executing it before");
}

}
