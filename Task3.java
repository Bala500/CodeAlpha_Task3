package intership;
import java.util.*;
class task3{
    // Class to store details about each destination
    static class Destination {
        String name;
        String date;
        double budget;
        String preferences;

        Destination(String name, String date, double budget, String preferences) {
            this.name = name;
            this.date = date;
            this.budget = budget;
            this.preferences = preferences;
        }
    }

    // Method to input travel details
    public static List<Destination> inputTravelDetails(Scanner sc) {
        List<Destination> destinations = new ArrayList<>();
        System.out.println("Enter number of destinations:");
        int count = sc.nextInt();
        sc.nextLine(); // Consume newline

        for (int i = 0; i < count; i++) {
            System.out.println("Enter Destination Name:");
            String name = sc.nextLine();
            System.out.println("Enter Travel Date (DD/MM/YYYY):");
            String date = sc.nextLine();
            System.out.println("Enter Estimated Budget:");
            double budget = sc.nextDouble();
            sc.nextLine(); // Consume newline
            System.out.println("Enter any preferences (e.g., activities, sights):");
            String preferences = sc.nextLine();
            destinations.add(new Destination(name, date, budget, preferences));
        }

        return destinations;
    }

    // Method to calculate total budget
    public static double calculateTotalBudget(List<Destination> destinations) {
        double totalBudget = 0;
        for (Destination dest : destinations) {
            totalBudget += dest.budget;
        }
        return totalBudget;
    }

    // Method to display itinerary
    public static void displayItinerary(List<Destination> destinations) {
        System.out.println("\nYour Travel Itinerary:");
        for (Destination dest : destinations) {
            System.out.println("Destination: " + dest.name + " | Date: " + dest.date + " | Budget: $" + dest.budget + " | Preferences: " + dest.preferences);
        }
        System.out.println("Total Budget: $" + calculateTotalBudget(destinations));
    }

    // Placeholder for future weather information feature
    public static void displayWeatherInfo(String destination) {
        System.out.println("Fetching weather information for " + destination + ".");
    }

    // Placeholder for future map feature
    public static void displayMap(String destination) {
        System.out.println("Showing map for " + destination + " .");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input travel details
        List<Destination> destinations = inputTravelDetails(sc);

        // Display the travel itinerary and total budgetR
        displayItinerary(destinations);

        // Optional: Display map and weather info for each destination
        for (Destination dest : destinations) {
            displayMap(dest.name);
            displayWeatherInfo(dest.name);
        }
    }
}
// (this feature is a placeholder for map API integration)