import java.util.ArrayList;

public class Flight {
    private ArrayList<String> flights = new ArrayList<String>();

    private String departure;
    private String destination;

    public void addFlight(String departure, String destination) {
        flights.add(departure + "-" + destination);
    }

    public Flight(String departure, String destination) {
        flights.add(departure + "-" + destination);
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDeparture(String deparure) {
        this.departure = deparure;
    }

    public ArrayList<String> getFlights() {
        return flights;
    }
}
