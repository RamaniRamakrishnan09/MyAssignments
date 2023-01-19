package myassignments;

public class FindLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "Hello World";

String strr ="";

String[] split = str.split(" ");

for (int i = split.length-1; i >0; i--) {
	
	System.out.println(split[i]);
	
	strr=split[i];
	
	int length = split[i].length();
	
	System.out.println(length);
	
	
}
	}

}
