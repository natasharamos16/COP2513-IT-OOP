//Program is created to generate accompany sorting array list
//Created by Natasha Ramos-Gomez
//COP2513 University of South Florida
//Tampa,FL



import java.util.ArrayList;

public class NumberInt {
	
	public static void main(String[] args) {
		
		//statement is used to create array list
		ArrayList<Integer> arrayList = new ArrayList<>();
		
		//for loop to choose 10 integers
		for (int i = 0; i < 10; i++) {
			arrayList.add(i);
		}
		//setting up prints to display the array lists with 10 random numbers
		System.out.println(arrayList);
		shuffle(arrayList);
		System.out.println(arrayList);
		
	}
	public static <E> void shuffle(ArrayList<E> arrayList) {
		
		//setting up formula for random integers
		for(int n = 0;  n < arrayList.size(); n++) {
			int randomNum = (int) (Math.random() * arrayList.size());
			
			//setting up integers as an array
			E presentMinNum = arrayList.get(randomNum);
			arrayList.set(randomNum, arrayList.get(n));
			arrayList.set(n, presentMinNum);
		}
	}


}
