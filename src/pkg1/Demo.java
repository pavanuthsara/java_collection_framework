package pkg1;
import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(5);
		nums.add(8);
		nums.add(7);
		nums.add(3);
		
		//output the values in ArrayList
		System.out.println(nums);
		System.out.println(nums.get(0));
		
		nums.add(-4);
		System.out.println(nums);
		
		//find the index related to value
		System.out.println(nums.indexOf(7));
		
		System.out.println();
		for(int n : nums) {
			System.out.println(n);
		}
	}

}
