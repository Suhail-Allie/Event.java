package org.example;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;
import java.util.Scanner;

    public class Event {
        private int eventNumber;
        private int numberOfGuests;
        private double pricePerGuest;
        private String phoneNumber;
        private int eventType; // 0 - wedding, 1 - baptism, 2 - birthday, 3 - corporate, 4 - other
        private static final String[] EVENT_TYPES = {"Wedding", "Baptism", "Birthday", "Corporate", "Other"};

        public Event(int eventNumber, int numberOfGuests, double pricePerGuest, String phoneNumber, int eventType) {
            this.eventNumber = eventNumber;
            this.numberOfGuests = numberOfGuests;
            this.pricePerGuest = pricePerGuest;
            this.phoneNumber = phoneNumber;
            setEventType(eventType);
        }

        public int getEventNumber() {
            return eventNumber;
        }

        public void setEventNumber(int eventNumber) {
            this.eventNumber = eventNumber;
        }

        public int getNumberOfGuests() {
            return numberOfGuests;
        }

        public void setNumberOfGuests(int numberOfGuests) {
            this.numberOfGuests = numberOfGuests;
        }

        public double getPricePerGuest() {
            return pricePerGuest;
        }

        public void setPricePerGuest(double pricePerGuest) {
            this.pricePerGuest = pricePerGuest;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public int getEventType() {
            return eventType;
        }

        public void setEventType(int eventType) {
            if (eventType < 0 || eventType >= EVENT_TYPES.length) {
                this.eventType = EVENT_TYPES.length - 1; // set to "Other"
            } else {
                this.eventType = eventType;
            }
        }

        public String getEventTypeString() {
            return EVENT_TYPES[eventType];
        }

        public double getTotalPrice() {
            return numberOfGuests * pricePerGuest;
        }

        @Override
        public String toString() {
            return "Event Number: " + eventNumber + ", Guests: " + numberOfGuests +
                    ", Price per Guest: $" + pricePerGuest + ", Total Price: $" + getTotalPrice() +
                    ", Phone: " + phoneNumber + ", Event Type: " + getEventTypeString();
        }
    }




