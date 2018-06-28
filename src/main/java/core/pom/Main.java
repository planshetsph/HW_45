package core.pom;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

	public static void main(String[] args) {
		Logger.getLogger("").setLevel(Level.OFF);
		System.out.println("POM Framework");
		System.out.println("Browser: HtmlUnit");
		Common.start = System.currentTimeMillis();
		SignupPage.test();
		ConfirmationPage.test();
		Common.finish = System.currentTimeMillis();
		System.out.println("Response time: " + (Common.finish - Common.start) + " ms");

	}

}
