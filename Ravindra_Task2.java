package pack1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ravindra_Task2 {

    // 1. Static inner class to hold reservation data
    static class Reservation {
        int id;
        String customerName;
        String date;

        public Reservation(int id, String customerName, String date) {
            this.id = id;
            this.customerName = customerName;
            this.date = date;
        }

        @Override
        public String toString() {
            return "ID: " + id + " | Customer: " + customerName + " | Date: " + date;
        }
    }

    // List to store reservations
    private static ArrayList<Reservation> reservations = new ArrayList<>();
    private static int idCounter = 1;

    // 2. Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("=== Single Class Reservation System ===");

        while (running) {
            System.out.println("\n1. Make Reservation\n2. View All\n3. Cancel\n4. Exit");
            System.out.print("Choose: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Date: ");
                    String date = scanner.nextLine();
                    reservations.add(new Reservation(idCounter++, name, date));
                    System.out.println("Reserved! ID is " + (idCounter - 1));
                    break;
                case 2:
                    if (reservations.isEmpty()) System.out.println("No records.");
                    else reservations.forEach(System.out::println);
                    break;
                case 3:
                    System.out.print("Enter ID to cancel: ");
                    int id = scanner.nextInt();
                    boolean removed = reservations.removeIf(r -> r.id == id);
                    System.out.println(removed ? "Cancelled." : "Not found.");
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid.");
            }
        }
        scanner.close();
    }
}