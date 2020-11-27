package Demo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Parameterpassing {
	@Parameters("keyword")
	@Test
	public void test1(String keyword) {
		System.out.println(keyword);
	}
	@Test
	public void test2() {
		
	}

}
