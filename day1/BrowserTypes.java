package week1.day1;

public class BrowserTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String browser = "test";
switch(browser) {
case "Chrome":
	System.out.println("Google");
	break;
case "Firefox":
	System.out.println("Mozilla");
	break;
case "Edge":
	System.out.println("Microsoft");
	break;
case "Safari":
	System.out.println("Apple");
	break;
	default:
		System.out.println("Not a valid browser");
		break;
	}

}
}