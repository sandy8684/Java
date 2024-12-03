import java.util.*;
class LaxmiChitFund{
	static String username;
	static long mobile;
	static String pan;
	static long adhar;
	static String address;
	static int pin;
	static double bal;
	final static long accountnumber=123412341234l;
	final static String ifscCode="LCF1234";
	static ArrayList<String> statement=new ArrayList<>();
	public static void main(String[] args) {
		welcome();
	}
	public static void welcome(){
		for (; ; ) {
			Scanner sc= new Scanner(System.in);
			System.out.println();
			System.out.println("  ** Welcome ***  ");
			System.out.println("    LAXMI CHIT FUND    ");
			System.out.println();
			System.out.println("1. Exsisting User ");
			System.out.println("2. Create Bank Accoutn ");
			System.out.println();
			System.out.print("Enter  an option : ");
			int opt=sc.nextInt();
			switch(opt){
				case 1: login(sc); break;
				case 2: createAccoutn(sc);break;
				default: System.out.println(" Wrong option entered ");
			}
		}
	}
	public static void login(Scanner sc)
	{
		if(username!=null){
			for (int i=1;i<=3 ; i++) {
				System.out.println();
				System.out.println("** Login Module ***");
				System.out.println();
				System.out.print("mobile : ");
				long mobile1=sc.nextLong();
				System.out.print("Pin : ");
				int pin1=sc.nextInt();
				if((mobile==mobile1)&&(pin==pin1)){
					homePage(sc);
				}
				else{
					System.out.println();
					System.out.println(" Wrong credential Entered");
					System.out.println();
				}
			}
			System.exit(0);
		}else{
			System.out.println();
			System.out.println("Create your Accoutn First ");
			System.out.println();
		}
	}
	public static void createAccoutn(Scanner sc){
		System.out.println();
		System.out.println(" ** Account Creation Module **");
		System.out.println();
		System.out.print("Username : ");
		sc.nextLine();
		username=sc.nextLine();
		System.out.print("MObile : ");
		mobile=sc.nextLong();
		System.out.print("Adhar : ");
		adhar=sc.nextLong();
		System.out.print("Pancard : ");
		pan=sc.next();
		System.out.print("Address : ");
		sc.next();
		address=sc.nextLine();
		System.out.print("Pin : ");
		pin=sc.nextInt();
		System.out.print("Enter the amount to deposit : ");
		bal=sc.nextDouble();
		statement.add("Deposit : "+ bal);
		System.out.println();
		System.out.println(" Accoutn created Successfully ");
		System.out.println();
	}
	public static void homePage(Scanner sc){
		for (; ; ) {
			System.out.println();
			System.out.println("  * HOME PAGE MODULE * ");
			System.out.println();
			System.out.println("1.Deposit Amount");
			System.out.println("2.Withraw Amount ");
			System.out.println("3.Check Balance");
			System.out.println("4.Statement");
			System.out.println("5. Edit Profile");
			System.out.println("6.Logout");
			System.out.println();
			System.out.print("Enter an option : ");
			int option=sc.nextInt();
			System.out.println();
			switch (option) {
				case 1: deposit(sc);break;
				case 2:widthdraw(sc);break;
				case 3:checkBalance(sc);break;
				case 4: statment();break;
				case 5:editProfile(sc);break;
				case 6 : System.exit(0);
				default:System.out.println("Wrong option entered");
			}
		}
	}
	public static void deposit(Scanner sc){
		System.out.println("** Deposit Amount **");
		System.out.println();
		System.out.print("Enter the amount : ");
		double depositAmount=sc.nextDouble();
		bal+=depositAmount;
		statement.add("Deposit : "+depositAmount);
		System.out.println();
		System.out.println("Amount Deposited Successfully ");
	}
	public static void widthdraw(Scanner sc){
		for(int i=1;i<=3;i++){
			System.out.println("** Withdraw Amount **");
			System.out.println();
			System.out.print("Enter the amount : ");
			double withdrawAmount=sc.nextDouble();
			System.out.print("Enter your pin : ");
			int pin1=sc.nextInt();
			if(pin==pin1){
				if(withdrawAmount<=bal){
					bal-=withdrawAmount;
					statement.add("withdraw : "+ withdrawAmount);
					System.out.println("Amount debited Successfully");

				}
				else{
					System.out.println("Insufficients Funds.......");
				}
				return;
			}
			else{
				System.out.println();
				System.out.println("Wrong pin Entered..");
			}
		}
		System.out.println();
		System.out.println("Your account has been deactivate for 24 hours...");
		System.exit(0);

	}
	public static void checkBalance(Scanner sc){
		for (int i=1;i<=3 ;i++ ) {
			System.out.println("** CHECK BALANCE ***");
			System.out.print("Enter your pin : ");
			int pin1=sc.nextInt();
			if(pin==pin1){
				System.out.println();
				System.out.println("Account Balance is : "+ bal+"rs");
				return ;
			}
			else{
				System.out.println();
				System.out.println("Wrong pin Entered");
			}
		}
		System.out.println();
		System.out.println("Your account has been deactivated for 24 hours..");
		System.exit(0);
	}
	public static void statment(){
		System.out.println("** Statement**");
		System.out.println();
		for( String tran : statement){
			System.out.println(tran);
		}
	}
	public static void editProfile(Scanner sc){
		System.out.println("*** EDIT PROFILE ***");
		System.out.println();
		System.out.println("1.Update Name ");
		System.out.println("2.Update Mobile Number ");
		System.out.println("3. Update Address ");
		System.out.println("4. Update Pin ");
		System.out.println("5.Exit");
		System.out.print("Select Option : ");
		int option=sc.nextInt();
		switch(option)
		{
			case 1: 
				for(int i=1;i<=3;i++){
					System.out.print("Enter Pin : ");
					int pin2=sc.nextInt();
					if(pin==pin2){
					System.out.println("Enter Your name :");
					sc.nextLine();
					String name=sc.nextLine();
					username=name; 
					System.out.println("Name update Successfully");
					
					}
					else{
					System.out.println("Wrong credential entered ");
			
					}
				}
				break;

			case 2: 
				for (int i=1;i<=3 ;i++ ) {
					System.out.print("Enter Pin : ");
					int pin3=sc.nextInt();
					if(pin==pin3){
					System.out.println("Enter Your Mobile No :");
					long mobile1=sc.nextLong();
					mobile=mobile1; 
					System.out.println("Mobile No update Successfully");
					return;
					
					}
					else{
					System.out.println("Wrong credential entered ");
			
					}
				}
				break;
			case 3: 
				for (int i=1;i<=3 ;i++ ) {
					System.out.print("Enter Pin : ");
					int pin4=sc.nextInt();
					if(pin==pin4){
					System.out.println("Enter Your Address :");
					String address1=sc.nextLine();
					address=address1; 
					System.out.println("Address  update Successfully");
					return;
					
					}
					else{
						System.out.println("Wrong credential entered ");
				
					}
				}
				break;
			case 4: 
				for (int i=1;i<=3 ;i++ ) {
					System.out.print("Enter Mobile No : ");
					long mobile1=sc.nextLong();
					if(mobile==mobile1){
					System.out.println("Enter Your Pin :");
					int pin5=sc.nextInt();
					pin=pin5; 
					System.out.println("Pin update Successfully");
					return;
					
					}
					else{
						System.out.println("Wrong credential entered ");
				
					}
				}
				break;
			case 5: System.exit(0);
		}
		return;

	}
}
