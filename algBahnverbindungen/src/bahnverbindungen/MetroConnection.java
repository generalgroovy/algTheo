package bahnverbindungen;

/**
 * Bahnverbindung E
 * @author Mishko
 *
 */
public class MetroConnection {
	
	//# Fields
	
	MetroStation xOrigin;
	MetroStation xDestination;
	MetroArrivalTime xArrivalTime;

	/**
	 * Constructor
	 * @param xOrigin
	 * @param xDestination
	 */
	public MetroConnection(MetroStation xOrigin, MetroStation xDestination, MetroArrivalTime xArrivalTime) {
		this.xOrigin = xOrigin;
		this.xDestination = xDestination;
		this.xArrivalTime = xArrivalTime;
	}

	//# Origin
	
	public MetroStation getxOrigin() {
		return xOrigin;
	}
	
	public void setxOrigin(MetroStation xOrigin) {
		this.xOrigin = xOrigin;
	}
	
	//# Destination
	
	public MetroStation getxDestination() {
		return xDestination;
	}
	
	public void setxDestination(MetroStation xDestination) {
		this.xDestination = xDestination;
	}
	
	//# ArrivalTime
	
	
	public MetroArrivalTime getxArrivalTime() {
		return xArrivalTime;
	}

	public void setxArrivalTime(MetroArrivalTime xArrivalTime) {
		this.xArrivalTime = xArrivalTime;
	}

}
