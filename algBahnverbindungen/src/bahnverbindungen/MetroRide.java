package bahnverbindungen;

import java.util.ArrayList;

/**
 * Bahnfahrt P
 * @author Mishko
 *
 */
public class MetroRide {
	
	//# Fields
	
	ArrayList<MetroConnection> xMetroConnections;
	ArrayList<MetroVisit> xMetroVisits;
	
	/**
	 * Constructor
	 * @param xMetroConnection
	 * @param xArrivalTime
	 */
	public MetroRide(ArrayList<MetroConnection> xMetroConnections) {
		this.xMetroConnections = xMetroConnections;
		//# TODO calculate visits

		/*
		 * sort by time
		 * add one visit for each time unit spent at station
		 */
	}

}
