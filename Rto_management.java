import java.util.Scanner;

class Rto
{
	private String regno,newRegno;
	private String vehno,newVehno;
	private String cartype,newCartype;
	private String makers,newMakers;
	private String yearofman,newYearofman;
	private String regdate,newRegdate;
	private String expdate,newExpdate;
	private String renewal,newRenewal;
	private String owner,newOwner;
	private String name,newName;
	private String address,newAddress;
	private String age,newAge;
	private String pin,newPin;
	private String gender,newGender;

	Scanner KB=new Scanner(System.in);
	
	//method to open an account
	void registration()
	{ 
		System.out.println("---------------------------------------------");
		System.out.print("Enter Registration No: ");
		regno=KB.next();
		System.out.print("Enter Vehicle No: ");
		vehno=KB.next();
		System.out.print("Select your car type(Two Wheler/Three Wheeler/Light motor Vehicle/Heavy motor vehicle/Others) :");
		cartype=KB.next();

		System.out.print("Makers Name (Like Datsun,Ford,Tata Motors,Maruti..) : ");
		makers=KB.next();
		System.out.print("Owner's Name: ");
		owner=KB.next();
		System.out.print("Year of Manufacture: ");
		yearofman=KB.next();
		System.out.print("Registration Date: ");
		regdate=KB.next();
		System.out.print("Expiery Licence Date: ");
		expdate=KB.next();

	}

	void edit()
	{
		System.out.print("Enter Registration No: ");
		newRegno=KB.next();
		regno = newRegno;
		System.out.print("Enter Vehicle No: ");
		newVehno=KB.next();
		vehno = newVehno;
		System.out.print("Select your car type(Two Wheler/Three Wheeler/Light motor Vehicle/Heavy motor vehicle/Others) :");
		newCartype=KB.next();
		cartype = newCartype;
		System.out.print("Makers Name (Like Datsun,Ford,Tata Motors,Maruti..) : ");
		newMakers=KB.next();
		makers = newMakers;
		System.out.print("Owner's Name: ");
		newOwner=KB.next();
		owner = newOwner;
		System.out.print("Year of Manufacture: ");
		newYearofman=KB.next();
		yearofman = newYearofman;
		System.out.print("Registration Date: ");
		newRegdate=KB.next();
		regdate = newRegdate;
		System.out.print("Expiery Licence Date: ");
		newExpdate=KB.next();
		expdate = newExpdate;
		System.out.print("Your name :");
		newName=KB.next();
		name = newName;
		System.out.print("Your Address :");
		newAddress=KB.next();
		address = newAddress;
		System.out.print("Your PIN no :");
		newPin=KB.next();
		pin = newPin;
		System.out.print("Your age :");
		newAge=KB.next();
		age = newAge;
		System.out.print("Your Gender :");
		newGender=KB.next();
		gender = newGender;

	}
	void licence()
	{

		System.out.print("Your name :");
		name=KB.next();
		System.out.print("Your Address :");
		address=KB.next();
		System.out.print("Your PIN no :");
		pin=KB.next();
		System.out.print("Your age :");
		age=KB.next();
		System.out.print("Your Gender :");
		gender=KB.next();
	}
	void showLicence()
	{
		System.out.println("------------------------------------");
		System.out.println("Name :"+" "+name);
		System.out.println("Address :"+" "+address);
		System.out.println("Pin No. :"+" "+pin);
		System.out.println("Age :"+" "+age);
		System.out.println("Gender :"+" "+gender);
		}
	void renewal(){
		System.out.print("Enter the expiery date:");
		renewal=KB.next();
		expdate = renewal;
	}
	//method to withdraw money
	void transfer()
	{
		System.out.print("Enter The New Owner Name :");
		newOwner=KB.next();
		owner = newOwner;
	}
	//method to display account details
	void showAccount()
	{ 
		System.out.println("------------------------------------");
		System.out.println("Registration No :"+" "+regno);
		System.out.println("Vehicle No :"+" "+vehno);
		System.out.println("Car Type :"+" "+cartype);
		System.out.println("Makers Name :"+" "+makers);
		System.out.println("Year of Manufacture :"+" "+yearofman);
		System.out.println("Owner's Name :"+" "+owner);
		System.out.println("Registration Date :"+" "+regdate);
		System.out.println("Expiery Date :"+" "+expdate);
	}
	void alldetails()
	{
		System.out.println("------------------------------------");
		System.out.println("Registration No :"+" "+regno);
		System.out.println("Vehicle No :"+" "+vehno);
		System.out.println("Car Type :"+" "+cartype);
		System.out.println("Makers Name :"+" "+makers);
		System.out.println("Year of Manufacture :"+" "+yearofman);
		System.out.println("Owner's Name :"+" "+owner);
		System.out.println("Registration Date :"+" "+regdate);
		System.out.println("Expiery Date :"+" "+expdate);
		System.out.println("Name :"+" "+name);
		System.out.println("Age :"+" "+age);
		System.out.println("Gender :"+" "+gender);
		System.out.println("Address :"+" "+address);
		System.out.println("Pin No. :"+" "+pin);
		
	}


	//method to search an account number
	boolean search(String acn)
	{ 
		if(regno.equals(acn))
		{ 
			showAccount();
			return(true);
		}
		return(false);
	}
}








class ExRto
{  
	public static void main(String arg[])
	{
		Scanner KB=new Scanner(System.in);
		int op;
		do{
		System.out.println("1.Log In");
		System.out.println("2.Exit");
		op=KB.nextInt();

		switch(op){
			
			case 1:
					
			String user,pass;

			System.out.print("Enter your username :");
			user = KB.next();

			System.out.print("Enter your password :");
			pass = KB.next();
			if (user.equals("admin") && pass.equals("1234")){
			
		//create initial accounts
		System.out.print("How Many Vehicle Registration You Want to do : ");
		int n=KB.nextInt();
		Rto C[]=new Rto[n];
		for(int i=0;i<C.length;i++)
		{   
			C[i]=new Rto();
			C[i].registration();
		}
		
		//run loop until menu 5 is not pressed
		int ch;
		do
		{
			System.out.println("-------------------------------------");
			System.out.println("Main Menu");
			System.out.println("1.Registration Details");
			System.out.println("2.Search By Registration No.");
			System.out.println("3.Licence");
			System.out.println("4.Transfer");
			System.out.println("5.Renewal");
			System.out.println("6.Licence details");
			System.out.println("7.Edit Details");
			System.out.println("8.Display All Details");
			System.out.println("9.Exit");	
			System.out.print("Ur Choice :");
			ch=KB.nextInt();
			switch(ch)
			{ 
				case 1:
					for(int i=0;i<C.length;i++)
					{
						C[i].showAccount();
					}
					break;

				case 2:
					System.out.print("Enter Registration No U Want to Search : ");
					String acn=KB.next();
					boolean found=false;
					for(int i=0;i<C.length;i++)
					{  
						found=C[i].search(acn);
						if(found)
						{
							break;
						}
					}
					if(!found)
					{
						System.out.println("Search Failed..Account Not Exist..");
					}
					break;

				case 3:
					System.out.print("Enter your Registration No : ");
					acn=KB.next();
					found=false;
					for(int i=0;i<C.length;i++)
					{  
						found=C[i].search(acn);
						if(found)
						{
							C[i].licence();
							break;
						}
					}
					if(!found)
					{
						System.out.println("Search Failed..Account Not Exist..");
					}
					break;

				case 4:
					System.out.print("Enter your Registration No : ");
					acn=KB.next();
					found=false;
					for(int i=0;i<C.length;i++)
					{  
						found=C[i].search(acn);
						if(found)
						{
							C[i].transfer();
							break;
						}
					}
					if(!found)
					{
						System.out.println("Search Failed..Account Not Exist..");
					}
					break;
				

				case 5:
					System.out.print("Enter your Registration No : ");
					acn=KB.next();
					found=false;
					for(int i=0;i<C.length;i++)
					{  
						found=C[i].search(acn);
						if(found)
						{
							C[i].renewal();
							break;
						}
					}
					if(!found)
					{
						System.out.println("Search Failed..Account Not Exist..");
					}
					break;
					

				case 6 :
				    System.out.print("Enter your Registration No : ");
					acn=KB.next();
					found=false;
					for(int i=0;i<C.length;i++)
					{  
						found=C[i].search(acn);
						if(found)
						{
							C[i].showLicence();
							break;
						}
					}
					if(!found)
					{
						System.out.println("Search Failed..Account Not Exist..");
					}
					break;
				case 7 :
					System.out.print("Enter your Registration No : ");
					acn=KB.next();
					found=false;
					for(int i=0;i<C.length;i++)
					{  
						found=C[i].search(acn);
						if(found)
						{
							C[i].edit();
							break;
						}
					}
					if(!found)
					{
						System.out.println("Search Failed..Account Not Exist..");
					}
					break;

				case 8 :
						System.out.print("Enter your Registration No : ");
					acn=KB.next();
					found=false;
					for(int i=0;i<C.length;i++)
					{  
						found=C[i].search(acn);
						if(found)
						{
							C[i].alldetails();
							break;
						}
					}
					if(!found)
					{
						System.out.println("Search Failed..Account Not Exist..");
					}
					break;
				case 9:
					System.out.println("Good Bye..");
					break;
			}
		}
		while(ch!=9);
	}else{
		System.out.println("You Have Enter Wrong Username or Password");
	}
	break;
	case 2 :
		System.out.println("Good Bye..");
					break;
		}
		}
		while(op!=2);
}
}