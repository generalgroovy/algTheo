package bahnverbindungen;

import java.util.ArrayList;

/**
 * UBahn Fahrplan U
 * @author Mishko
 *
 */
public class MetroPlan {
	
	public static final int STATIONS = 4;
	
	public static final int MIN_TIME = 1;
	public static final int MAX_TIME = 7;
	
	public ArrayList<MetroStation> xMetroStations;
	public ArrayList<MetroConnection> xMetroConnections;
	
	public MetroStation xStart;
	public MetroStation xGoal1;
	public MetroStation xGoal2;
	
	public MetroPlan() {
		
		//# Init Variables
		xMetroStations = new ArrayList<>();
		xMetroConnections = new ArrayList<>();
		
		//# Create Rides
		for(int i = 0; i<STATIONS; i++) {
			xMetroStations.add(createStation(i));
		}
		for(int i = 0; i<STATIONS; i++) {
			for(int j = 0; j<STATIONS; j++) {
				if(xMetroStations.get(i).equals(xMetroStations.get(j))) continue; //|| j < i) continue;
				if(1 + (int)(Math.random() * 100) <= 20) continue;
				xMetroConnections.add(new MetroConnection(xMetroStations.get(i), 
						xMetroStations.get(j), 
						new MetroArrivalTime(MIN_TIME + (int)(Math.random() * MAX_TIME))));
			}
		}
		
		//# TODO Define Start and Goals
		xStart = xMetroStations.get(0 + (int)(Math.random() * xMetroStations.size()));
		xGoal1 = xMetroStations.get(0 + (int)(Math.random() * xMetroStations.size()));
		xGoal2 = xMetroStations.get(0 + (int)(Math.random() * xMetroStations.size()));
		
		//# TODO 
		/*
		 * Create route tree 
		 * decide whether path possible
		 */
	}

	private MetroStation createStation(int i) {
		MetroStation xStation = new MetroStation(i);
		return xStation;
	}
	
	//# Stations
	
	public ArrayList<MetroStation> getxStations() {
		return xMetroStations;
	}

	public void setxStations(ArrayList<MetroStation> xStations) {
		this.xMetroStations = xStations;
	}

	//# MetroConnections
	
	public ArrayList<MetroConnection> getxMetroConnections() {
		return xMetroConnections;
	}

	public void setxMetroConnections(ArrayList<MetroConnection> xMetroConnections) {
		this.xMetroConnections = xMetroConnections;
	}
	
}
