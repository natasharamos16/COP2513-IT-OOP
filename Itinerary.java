//Class created to calculate time between arriavls and departure times
//Created by Natasha Ramos  Gomez
//2/7/19
//COP2513 Professor Ciampaglia

//importing my packages
import java.util.List;
import java.util.GregorianCalendar;

public class Itinerary {
	//decalring my variable
	private List<Flight> flights;
	
	//creating the constructor
	public Itinerary (List<Flight> newPlanes) {
	flights	= newPlanes;
	}	
	
	//Method is used to calculate the flight of departure and arrival times
	public long getTotalTravelTime() 
	{
		long totalTravelTime = 0;
		if(flights.size() > 0) 
		{
			//created to claculate first departure time
			GregorianCalendar beginFlightDep = flights.get(0).getDepartureTime();
			
			//created to calculate the ending arrival time
			GregorianCalendar endFlightArri = flights.get(flights.size()-1).getArrivalTime();
			
			//conversion used to change millis inti mins and to substract the difference in time of flight times
			totalTravelTime = endFlightArri.getTimeInMillis()-beginFlightDep.getTimeInMillis()/(1000*60);
		}
		return totalTravelTime;
	}
	
	
	public long getTotalFlightTime() 
	{
		//Method created to sum of the total time of all flight time beginning to end
		long totalFlightTime = 0;
				
		for (Flight p : flights) 
		{
			totalFlightTime += p.getFlightTime();
		}
		return totalFlightTime;
	}

}

	