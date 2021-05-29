//Program is created to read an unknown number of integers
//Created by Natasha 
//COP2513 USF
//04/16/2019

import java.util.*;
public class numOc {
	//declaring my scanner
	private static Scanner userinput;

	public static void main(String[] args) {
		//creating scanner
		userinput = new Scanner(System.in);
		
		//statement made to create lists
		Map<Integer, Integer> numMap = new HashMap<>();
		
		//Creating print statement to prompt user to enter numbers
		System.out.println("Enter any number of integers:" + " \nInput Enter 0 when done entering numbers:");
		
		//declaring my variables
		int kingdomHearts;
		
		//Statement to keep integers moving and c
		while ((kingdomHearts = userinput.nextInt()) != 0) {
				if (!numMap.containsKey(kingdomHearts)) {
						numMap.put(kingdomHearts, 1);
						
				}
				else {
					   int waves = numMap.get(kingdomHearts);
					   waves++;
					   numMap.put(kingdomHearts, waves);
				}
		
		}
		//creating statement to show limited occurances
		int limit = Collections.max(numMap.values());
		
		//Statement to show number of repeated occurances
		System.out.println("The most recurred numbers are: ");
		for (Map.Entry<Integer, Integer> input : numMap.entrySet()) {
			if(input.getValue() == limit) {
				System.out.println(input.getKey() + " ");
			}
		}
		//Creating statement to display all values
		System.out.println();
	
	}
}
