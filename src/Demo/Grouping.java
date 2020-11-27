package Demo;

import org.testng.annotations.Test;

public class Grouping {
@Test(groups= {"people"})
public void Age() {
	System.out.println("Need grouping");
}
	@Test
	public void profile() {
		System.out.println("DontName grouping");
		
		

}
}
