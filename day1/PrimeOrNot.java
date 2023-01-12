package week1.day1;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num =67;
boolean bPrime=true;
for (int i = 2; i < num; i++) {
	if(num % i == 0)
	{
	System.out.println("Its a not prime number");
	bPrime = false;
	break;
	}
	{
	if(bPrime=true)
		System.out.println("Prime number");
	break;
	}
}
	}

}

