//Program is created to generate 50 random numbers
//Created by Natasha Ramos-Gomez
//COP2513 University of South Florida
//Tampa,FL
//January 22, 2019

import java.util.Random;

public class NumberGen {
	
	public static void main(String[] args) {
		
		Random randomnum = new Random(1000);
		System.out.print("First Round of Random Numbers"  + " ");
		
		for (int i = 0; i < 50; i++)
			System.out.print(randomnum.nextInt(100) + "  ");
		
	}

}
