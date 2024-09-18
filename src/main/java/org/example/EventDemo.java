package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

    public class EventDemo {
        public static void Main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Event[] events = new Event[8];

            // Get data for Event objects
            for (int i = 0; i < events.length; i++) {
                System.out.println("Enter details for Event " + (i + 1) + ":");
                System.out.print("Event Number: ");
                int eventNumber = scanner.nextInt();
                System.out.print("Number of Guests: ");
                int numberOfGuests = scanner.nextInt();
                System.out.print("Price per Guest: ");
                double pricePerGuest = scanner.nextDouble();
                System.out.print("Phone Number: ");
                String phoneNumber = scanner.next();
                System.out.print("Event Type (0 - Wedding, 1 - Baptism, 2 - Birthday, 3 - Corporate, 4 - Other): ");
                int eventType = scanner.nextInt();

                events[i] = new Event(eventNumber, numberOfGuests, pricePerGuest, phoneNumber, eventType);
            }

            while (true) {
                System.out.println("\nChoose a sorting option: ");
                System.out.println("1. Sort by Event Number");
                System.out.println("2. Sort by Number of Guests");
                System.out.println("3. Sort by Event Type");
                System.out.println("Enter 0 to exit.");
                int choice = scanner.nextInt();

                if (choice == 0) {
                    break;
                }

                switch (choice) {
                    case 1:
                        ArrayList<> Arrays = null;
                        Arrays.sort(events,Main(Event::getEventNumber));
                        break;
                    case 2:
                        Arrays.sort(events,Main(Event::getNumberOfGuests));
                        break;
                    case 3:
                        Arrays.sort(events, Comparator.comparing(Event::getEventTypeString));
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        continue;
                }

                System.out.println("Sorted Events:");
                for (Event event : events) {
                    System.out.println(event);
                }
            }
            scanner.close();
        }
    }

