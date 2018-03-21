import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class UserInterface {
    private Scanner reader;
    private ArrayList<Plane> planes = new ArrayList<Plane>();
    private HashMap<Plane, Flight> flightPlan =new HashMap<Plane, Flight>();


    public void start(Scanner reader) {
        this.reader = reader;
        System.out.println("Airport panel");
        System.out.println("--------------------");
        System.out.println();
        String input = "";
        while (!input.equals("x")) {
            airportMenu();
            input = reader.nextLine();
            if (input.equals("1")) {
                addAirplane();
            } else if (input.equals("2")) {
                addFlight();
            }
        }
        System.out.println();
        System.out.println("Flight service");
        System.out.println("--------------------");
        System.out.println();
        input = "";
        while (!input.equals("x")) {
            flightMenu();
            input = reader.nextLine();
            if (input.equals("1")) {
                printPlanes();
            } else if (input.equals("2")) {
                printFlights();
            } else if (input.equals("3")) {
                printPlaneInfo();
            }
        }
    }
    public void printFlights(){
        for (Plane plane : planes) {
            Flight flight = flightPlan.get(plane);
            if(flightPlan.containsKey(plane)) {
                ArrayList<String> flights = flight.getFlights();
                for (String flightString : flights) {
                    System.out.println(plane + " (" + flightString + ")");
                }
            }
        }
    }
    public void printPlanes() {
        for (Plane plane : planes) {
            System.out.println(plane);
        }

    }
    public void printPlaneInfo(){
        System.out.print("Give plane ID: ");
        String planeId = reader.nextLine();
        if (searchById(planeId) != null) {
            System.out.println(searchById(planeId));

        }
    }
    public void flightMenu() {
        System.out.println("Choose operation: ");
        System.out.println("[1] Print planes");
        System.out.println("[2] Print flights");
        System.out.println("[3] Print plane info");
        System.out.println("[x] Quit");
    }
    public void airportMenu() {
        System.out.println("Choose operation: ");
        System.out.println("[1] Add airplane");
        System.out.println("[2] Add flight");
        System.out.println("[x] Exit");
    }

    public void addAirplane() {
        System.out.print("Give plane ID: ");
        String planeId = reader.nextLine();
        System.out.print("Give plane capacity: ");
        int capacity = Integer.parseInt(reader.nextLine());
        planes.add(new Plane(planeId, capacity));

    }

    public void addFlight() {
        System.out.print("Give plane ID: ");
        String planeId = reader.nextLine();
        System.out.print("Give departure airport code: ");
        String departure = reader.nextLine();
        System.out.print("Give destination airport code: ");
        String destination = reader.nextLine();

        if (searchById(planeId) != null) {
            if (!flightPlan.containsKey(searchById(planeId))) {
                Flight flight = new Flight(departure, destination);
                flightPlan.put(searchById(planeId), flight);
            } else {
                Flight flight = flightPlan.get(searchById(planeId));
                flight.addFlight(departure, destination);
//                flightPlan.get(planeId).addFlight(departure, destination);
            }
        }

        }

    public Plane searchById(String planeID) {
        for (Plane plane : planes) {
            if (plane.getPlaneId().equals(planeID)) {
                return plane;
            }
        }
        return null;
    }


}
