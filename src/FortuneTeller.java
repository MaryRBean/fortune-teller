import java.util.Scanner;
public class FortuneTeller {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String firstName;
	String lastName;
	int age;
	int birthMonth;
	String favColor;
	int numSibs;
	int retirement;
	String location;
	String transPort;
	int bankBalance;
	
	
	
	//name
	System.out.println("What is your first name?");
	firstName = input.nextLine();
	
	System.out.println("What is your last name?");
	lastName = input.nextLine();
	
	//age 
	System.out.println("How old are you?");
	age = input.nextInt();
	if(age%2==0) { retirement=5;
	}else { retirement=40;	
	}
	
	System.out.println("What month were you born in(In numerics- Ex: Sept=9, Dec=12)?");
	birthMonth = input.nextInt();
	switch(birthMonth) {
	case 1:
	case 2:
	case 3:
	case 4:
		bankBalance = 2;
		break;
	case 5:
	case 6:
	case 7:
	case 8:
		bankBalance = 1000000;
		break;
	case 9:
	case 10:
	case 11:
	case 12:
		bankBalance = 5000;
		break;
	default:
		bankBalance = 0;
	}
	
	//color
	System.out.println("What is your favorite color within ROYGBIV?");
	System.out.println("Enter \"Help\" for a list of the ROYGBIV colors.");
	favColor = input.next().toLowerCase();
	
	while(favColor.contains("help")) {
		System.out.println("ROYGBIV= red, orange, yellow, green, blue, indigo and violet.");
		System.out.println("What is your favorite color?");
		favColor=input.next().toLowerCase();
	}
	
	if(favColor.contains("red")){transPort= "Lightning McQueen from the movie \"Cars\"";
	} else if(favColor.contains("orange")){transPort= "a soggy orange";
	} else if(favColor.contains("yellow")){transPort= "a yellow submarine";
	} else if(favColor.contains("green")){transPort= "a Prius";
	} else if(favColor.contains("blue")){transPort= "a whale";
	} else if(favColor.contains("indigo")){transPort= "a mom van";
	} else if(favColor.contains("violet")){transPort= "a convertable";
	} else {transPort="a flying carpet";
	}
	
	//siblings
	System.out.println("How many siblings do you have?");
	numSibs = input.nextInt();
	if(numSibs >3){location= "Fiji";
	} else if(numSibs==2){location= "a dumpster";
	} else if(numSibs==1){location= "Italy";
	} else if(numSibs==0){location= "the State Up North";
	} else {location= "Hounddogs";}
	

	//fortune location+transPort
	System.out.println( firstName+" "+ lastName +" will retire in "+ retirement+" years with $"+bankBalance+" in the bank, a vacation home in "+location+", and travel by "+transPort+".");
	input.close();}
	}

