//Creating a program that generates 20 integers and creates an empty arraylist
//Natasha Ramos-Gomez	
//COP2513 USF

//importing my packages
import java.util.ArrayList;

public class sortArray<E> {

	public static void main(String[] args) {
		
		//creating the arraylist
		ArrayList<Integer> arrayList = new ArrayList<>();
		
		//setting up for loop to generate integers
		for(int n = 0; n < 10; n++) {
			arrayList.add(n);
		}
		//setting up print statements to display arrays with 10 random numbers
		System.out.println(arrayList);
	    NumberInt.shuffle(arrayList);
		System.out.println(arrayList);
		sort(arrayList);
		System.out.println(arrayList);
	}
	

	public static <E extends Comparable<E>> void sort(ArrayList<E> arrayList) {
	 
		//statement used to sort out the different arraylists
		for (int a = 0; a <arrayList.size() - 1; a++) {
		 E presentMinInt = arrayList.get(a);
		 int low = a;
		 //statement used to get arraysize
		 for (int p = a + 1; p < arrayList.size(); p++) {
			 //statement used to compare different array lists
			 if (arrayList.get(p).compareTo(presentMinInt) < 0) {
				 presentMinInt = arrayList.get(p);
				 low = p;
			 }
		 }
		 //displaying the lowest integers
		 if(low != a) {
			 arrayList.set(low, arrayList.get(a));
			 arrayList.set(a, presentMinInt);
		 }
	 }
 }

}
