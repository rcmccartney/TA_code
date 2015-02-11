import java.util.ArrayList;
import java.util.Scanner;

public class Person {

	private String firstName;
	private String lastName;
	private int age;
	
	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public String getFirstName() { 
		return firstName;  
	}

	public void setName(String name) {
		String[] tempName;
		tempName = name.split(" ");
		this.firstName = tempName[0];
		this.lastName = tempName[1];
	}

	public String toString() {
		return  "Name: " + this.firstName + " " + 
			this.lastName + ", Age: " + this.age;
	}

	public boolean equals(Object person) {
		if (!(person instanceof Person)) {
			return false;
		}		
		else {
			Person p = (Person) person;
			return this.firstName.equals(p.firstName);
		}
	}

	public static void main(String[] args) {
	
		ArrayList<Person> people = new ArrayList<Person>();
		Scanner in = new Scanner(System.in);
		int choice, tempAge;
		String tempFirst, tempLast;

		while(true) {
			System.out.println("List of options");
			System.out.println("1:\tNew Person");
			System.out.println("2:\tFind");
			System.out.println("3:\tQuit");
			choice = in.nextInt(); 

			switch(choice) {
				case 1:
				System.out.println("Enter fn:");
				String fn = in.next();
				System.out.println("Enter ln:");
				String ln = in.next();
				System.out.println("Enter age:");
				int a = in.nextInt();
			
				Person p = new Person(fn, ln, a);
				people.add(p);
				break;
				case 2:
				for ( Person aP : people) {
				//	if (aP.getAge() > 20) {
				//		System.out.println(aP);
				//	}
				}
				break;
				case 3:
				return;
			}
		}
	}
}

