/**Program is being created to store flight information
 * Created by Natasha Ramos-Gomez
 * COP2513 Ciampaglia
 * 2/7/19
 * 
*/

//Importing my packages needed
import java.util.GregorianCalendar;

public class Flight {
	//Declaring my variables
	private String flightNo;
	private GregorianCalendar departureTime;
	private GregorianCalendar arrivalTime;
	
	//Below are the setters and getters to needed to return my data
	public String getFlightNo() {
		return flightNo;
	}
	
	public GregorianCalendar getDepartureTime() {
		return departureTime;
	}
	
	public void setDepartureTime(GregorianCalendar dTime) {
		departureTime = dTime;
	}
	
	public GregorianCalendar getArrivalTime() {
		return arrivalTime;
	}
	
	public void setArrivalTime(GregorianCalendar aTime) {
		arrivalTime = aTime;
	}
	//Constructor made to declare members of the methods
	public Flight (String flightNo, GregorianCalendar dTime, GregorianCalendar aTime) {
		this.flightNo = flightNo;
		this.departureTime = dTime;
		this.arrivalTime = aTime;
	}

	public long getFlightTime() {
		return (arrivalTime.getTimeInMillis()-departureTime.getTimeInMillis())/(1000 * 60);//method used to return the flight time in mins
	}
}

