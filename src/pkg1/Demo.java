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
		
		//ArrayList example 2
		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("Mango");
		fruits.add("Orange");
		fruits.add("PineApple");
		
		System.out.println(fruits);
		
		//Add item to array list
		fruits.add(0, "This is 0 th index"); // This will be the first element 
		System.out.println(fruits);
		
		//Get method
		System.out.println(fruits.get(2)); //This should output the 2nd index element
		System.out.println(fruits.getFirst());
		System.out.println(fruits.getLast());
		System.out.println(fruits.indexOf("Mango")); //This outputs the index of element "Mango"

		//Remove item by index
		fruits.remove(0);
		System.out.println(fruits);
		
		//Remove item by value'
		fruits.remove("Orange");
		System.out.println(fruits);
		
		//Get the size of array list
		System.out.println(fruits.size());
		
		//Change the item value in array list 
		fruits.set(0, "Apple"); // 0th index elements replaces with "Apple"
		System.out.println(fruits);
		
		//Remove all the elements from array list
		fruits.clear();
		System.out.println(fruits);
		System.out.println(fruits.size());
	}

}
