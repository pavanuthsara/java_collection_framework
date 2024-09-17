package pkg2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> nums = new ArrayList<>();
		
		System.out.print("Enter 10 integers : ");
		for(int i=0; i<10; i++) {
			nums.add(sc.nextInt());
		}
		
		Collections.sort(nums);
		System.out.println(nums);
		
		for(int j=1; j<nums.size(); j++) {
			if(nums.get(j-1) == nums.get(j)) {
				nums.remove(j-1);
				j--;
			}		
		}
		
		System.out.println("Your unique sorted Elements " + nums);
	}
}
