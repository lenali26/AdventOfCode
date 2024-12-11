package defaultPackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> left  = new ArrayList<Integer>();
		ArrayList<Integer> right = new ArrayList<Integer>();
		
		File file = new File("input.txt");
		try {
			Scanner scanner = new Scanner(file);
			
			while(scanner.hasNext()) {
				
				// read in 2 ints per iteration
				int first  = scanner.nextInt();
				int second = scanner.nextInt();
				
				//add the two numbers to their respective lists
				left.add(first);   // add first column num to left list
				right.add(second);
				
			}
			
			//for testing only - let's print the list
			//	 1) perform a sequential search in the left list to look for 
			//		the smallest element
			
			int sum = 0;
			
			while(left.size() > 0) {
				int smallestL = left.get(0); //assume first el is smallest

				int smallestIndexL = 0;
				
				//now look for something smaller than current smallest 
				for (int i = 0; i < left.size(); i++) {
					
					if(left.get(i) < smallestL) {
						//found a smaller number! 
						smallestL		= left.get(i);
						smallestIndexL	= i;
					}
					
				}
				
				//remove the smallest value you found!
				left.remove(smallestIndexL); //next time, it's not in the list
			
				
//				smallest element on the right list
				
					int smallestR= right.get(0); //assume first el is smallest

					int smallestIndexR = 0;
					
					
					//now look for something smaller than current smallest 
					for (int i = 0; i < right.size(); i++) {
						
						if(right.get(i) < smallestR) {
							//found a smaller number! 
							smallestR		= right.get(i);
							smallestIndexR	= i;
						}
						
					}
					
					//remove the smallest value you found!
					right.remove(smallestIndexR); //next time, it's not in the list
					System.out.println(smallestR);
					
					System.out.println("difference is " + Math.abs(smallestL - smallestR));
					
					sum += Math.abs(smallestR - smallestL);
					
			}
			
			System.out.println("sum is " + sum);
			
			
			//part 2
			int similarity = 0; 
			
			for(int i = 0; i < left.size(); i++) {
				
				
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
