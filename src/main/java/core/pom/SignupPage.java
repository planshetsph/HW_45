package core.pom;

public class SignupPage implements Constant {

	public static void test() {
		Common.url = "http://alex.academy/exe/signup/v1/index.php";
		Common.open(Common.url);
		System.out.println("01. Element [Quotes (dynamic)]: " + (Common.isPresent(el_01) ? "Exists" : "Not exist")); // signup
		System.out.println("02. Element [Current Location]: " + (Common.isPresent(el_02) ? "Exists" : "Not exist")); // signup
		System.out.println("03. Element [Weather Icon]: " + (Common.isPresent(el_03) ? "Exists" : "Not exist")); // signup
		System.out.println("04. Element [Temperature]: " + (Common.isPresent(el_04) ? "Exists" : "Not exist")); // signup

		Common.printElementExistence();

		System.out.println("15. Element [Male (label)]: " + (Common.isPresent(el_15) ? "Exists" : "Not exist")); // signup
		System.out.println("16. Element [Male (radio button)]: " + (Common.isPresent(el_16) ? "Exists" : "Not exist")); // signup
		System.out.println("17. Element [Female (label)]: " + (Common.isPresent(el_17) ? "Exists" : "Not exist")); // signup
		System.out
				.println("18. Element [Female (radio button)]: " + (Common.isPresent(el_18) ? "Exists" : "Not exist")); // signup
		System.out.println("19. Element [State (label)]: " + (Common.isPresent(el_19) ? "Exists" : "Not exist")); // signup
		System.out.println("20. Element [State (drop-down)]: " + (Common.isPresent(el_20) ? "Exists" : "Not exist")); // signup
		System.out.println(
				"21. Element [State California (item)]: " + (Common.isPresent(el_21) ? "Exists" : " Not exist ")); // signup
		System.out.println("22. Element [Terms (label)]: " + (Common.isPresent(el_22) ? "Exists" : " Not exist ")); // signup
		System.out.println("23. Element [Terms (checkbox)]: " + (Common.isPresent(el_23) ? "Exists" : " Not exist ")); // signup
		System.out.println("24. Element [Image (facebook)]: " + (Common.isPresent(el_24) ? "Exists" : " Not exist ")); // signup
		System.out.println("25. Element [Image (twitter)]: " + (Common.isPresent(el_25) ? "Exists" : " Not exist ")); // signup
		System.out.println("26. Element [Image (flickr)]: " + (Common.isPresent(el_26) ? "Exists" : "Not exist")); // signup
		System.out.println("27. Element [Image (youtube)]: " + (Common.isPresent(el_27) ? "Exists" : "Not exist")); // signup
		System.out.println("28. Element [Reset (button)]: " + (Common.isPresent(el_28) ? "Exists" : "Not exist")); // signup
		System.out.println("29. Element [Submit (button)]: " + (Common.isPresent(el_29) ? "Exists" : "Not exist")); // signup
		System.out.println("30. Element [Timestamp (dynamic)]: " + (Common.isPresent(el_30) ? "Exists" : "Not exist")); // signup
		System.out.println("31. Element [Copyright (dynamic)]: " + (Common.isPresent(el_31) ? "Exists" : "Not exist")); // signup
		System.out
				.println("32. Element [OS & Browser (dynamic)]: " + (Common.isPresent(el_32) ? "Exists" : "Not exist")); // signup
		System.out.println("33. Element [Error Line]: " + (Common.isPresent(el_33) ? "Exists" : "Not exist")); // signup
		System.out.println("34. Element [First Name Error]: " + (Common.isPresent(el_34) ? "Exists" : "Not exist")); // signup
		System.out.println("35. Element [Last Name Error]: " + (Common.isPresent(el_35) ? "Exists" : "Not exist")); // signup
		System.out.println("36. Element [Email Error]: " + (Common.isPresent(el_36) ? "Exists" : "Not exist")); // signup
		System.out.println("37. Element [Phone Error]: " + (Common.isPresent(el_37) ? "Exists" : "Not exist")); // signup
		System.out
				.println("38. Element [First Name Error (img)]: " + (Common.isPresent(el_38) ? "Exists" : "Not exist")); // signup
		System.out
				.println("39. Element [Last Name Error (img)]: " + (Common.isPresent(el_39) ? "Exists" : "Not exist")); // signup
		System.out.println("40. Element [Email Error (img)]: " + (Common.isPresent(el_40) ? "Exists" : " Not exist")); // signup
		System.out.println("41. Element [Phone Error (img)]: " + (Common.isPresent(el_41) ? "Exists" : " Not exist")); // signup
		System.out.println("42. Element [Gender (field)): " + (Common.isPresent(el_42) ? "Exists" : " Not exist")); // confirmation
		System.out.println("43. Element [Back (button)]: " + (Common.isPresent(el_43) ? "Exists" : " Not exist")); // confirmation
		System.out.println("------------- VISABILITY----------------");
		System.out.println("33. Element [Error Line]: " + (Common.isVisible(el_33) ? "Visible" : " Not visible")); // signup
		System.out.println("34. Element [First Name Error]: " + (Common.isVisible(el_34) ? "Visible" : " Not visible")); // signup
		System.out.println("35. Element [Last Name Error]: " + (Common.isVisible(el_35) ? "Visible" : " Not visible")); // signup
		System.out.println("36. Element [Email Error]: " + (Common.isVisible(el_36) ? "Visible" : " Not visible")); // signup
		System.out.println("37. Element [Phone Error]: " + (Common.isVisible(el_37) ? "Visible" : " Not visible")); // signup
		System.out.println(
				"38. Element [First Name Error (img)]: " + (Common.isVisible(el_38) ? "Visible" : " Not visible")); // signup
		System.out.println(
				"39. Element [Last Name Error (img)]: " + (Common.isVisible(el_39) ? "Visible" : " Not visible")); // signup
		System.out
				.println("40. Element [Email Error (img)]: " + (Common.isVisible(el_40) ? "Visible" : " Not visible")); // signup
		System.out
				.println("41. Element [Phone Error (img)]: " + (Common.isVisible(el_41) ? "Visible" : " Not visible")); // signup
		System.out.println("43. Element [Back (button)]: " + (Common.isVisible(el_43) ? "Visible" : " Not visible")); // confirmation
		System.out.println("OS/Browser: " + Common.driver.findElement(el_32).getText());// signup
		Common.driver.quit();
	}

}
