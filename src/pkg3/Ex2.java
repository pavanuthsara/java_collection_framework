package pkg3;
import java.util.Scanner;
import java.util.ArrayList;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int choice;
		int removeNumber;
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		while(true) {
			System.out.println("1.Add Element");
			System.out.println("2.Remove Element");
			System.out.println("3.Display Elements");
			System.out.println("4.Exit");
			System.out.println();
			
			System.out.print("Your choice : ");
			choice = sc.nextInt();
			
			if(choice == 1) {
				
				System.out.print("Enter an integer : ");
				numbers.add(sc.nextInt());
				
				System.out.println("Added");
				System.out.println();
				
			} else if(choice == 2) {
				
				System.out.print("Enter value need to remove : ");
				removeNumber = sc.nextInt();
				
				if(numbers.contains(removeNumber)) {
					
					numbers.remove(Integer.valueOf(removeNumber));
					System.out.println("Number removed");
					
				}else
					System.out.println("Number doesn't exists in list");
				
				System.out.println();
				
			} else if(choice == 3) {
				
				System.out.println("Your list : " + numbers);
				System.out.println();
				
			} else if(choice == 4) {
				
				System.out.println("Bye!");
				break;
				
			} else {
				
				System.out.println("Wrong choice");
				System.out.println();
			
			}
			
		}

	}

}
