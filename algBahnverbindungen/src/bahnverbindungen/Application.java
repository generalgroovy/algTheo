package bahnverbindungen;

public class Application {
	
	private static MetroPlan xMetroPlan;
	
	public static void main(String args[]) {
		xMetroPlan = createMetroPlan();
		printMetroPlan();
	}

	private static MetroPlan createMetroPlan() {
		MetroPlan xMetroPlan = new MetroPlan();
		return xMetroPlan;
	}
	
	private static void printMetroPlan() {
		for(MetroConnection xConn : xMetroPlan.getxMetroConnections()) {
			System.out.println(xConn.getxOrigin().getiNumber() + " : " 
			+ xConn.getxDestination().getiNumber() + " : "
			+ xConn.getxArrivalTime().getiArrivalTime());
		}
	}
			
}
