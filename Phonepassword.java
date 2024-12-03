 import java.util.Scanner;
class Phonepassword
{
	public static void main(String [] args) throws InterruptedException
	{
		Scanner sc = new Scanner(System.in);
		int pin1 = 1234;
		int duration = 2000;
		outerloop:
		for(; ;)
		{
			int attempt = 3;

		do{
			System.out.println();
			System.out.println("Ener your Password");
			int pin2 = sc.nextInt();
			if(pin1==pin2)
			{
				System.out.println("Your Phone is unlocked");
				System.out.println();
				break outerloop;

			}
			System.out.println("Wrong pin entered");
			System.out.println("you have"+(attempt-1)+"attempy left");
			attempt--;
		}
			while(attempt>0);
			System.out.println("Your phone has benn locked for "+(duration/1000)+"sec");
			Thread.sleep(duration);
			duration*=2;

		}

	}
}

