public class Hotel {
        private String name;
        private int numberOfSuites;
        private int numberOfRooms;
        private int bookedSuites;
        private int bookedBasicRooms;

        // Constructor #1 — booked counts default to 0
        public Hotel(String name, int numberOfSuites, int numberOfRooms) {
            this.name = name;
            this.numberOfSuites = numberOfSuites;
            this.numberOfRooms = numberOfRooms;
            this.bookedSuites = 0;
            this.bookedBasicRooms = 0;
        }

        // Constructor #2 — specify booked counts
        public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
            this.name = name;
            this.numberOfSuites = numberOfSuites;
            this.numberOfRooms = numberOfRooms;
            this.bookedSuites = bookedSuites;
            this.bookedBasicRooms = bookedBasicRooms;
        }

        // Getters only — NO setters allowed
        public String getName() {
            return this.name;
        }

        public int getNumberOfSuites() {
            return this.numberOfSuites;
        }

        public int getNumberOfRooms() {
            return this.numberOfRooms;
        }

        public int getBookedSuites() {
            return this.bookedSuites;
        }

        public int getBookedBasicRooms() {
            return this.bookedBasicRooms;
        }

        // Derived getters — calculated, no backing variable
        public int getAvailableSuites() {
            return this.numberOfSuites - this.bookedSuites;
        }

        public int getAvailableRooms() {
            return this.numberOfRooms - this.bookedBasicRooms;
        }

        // Action method — try to book rooms
        public boolean bookRoom(int numberOfRooms, boolean isSuite) {
            if (isSuite) {
                if (getAvailableSuites() >= numberOfRooms) {
                    this.bookedSuites = this.bookedSuites + numberOfRooms;
                    return true;
                } else {
                    return false;
                }
            } else {
                if (getAvailableRooms() >= numberOfRooms) {
                    this.bookedBasicRooms = this.bookedBasicRooms + numberOfRooms;
                    return true;
                } else {
                    return false;
                }
            }
        }

}
