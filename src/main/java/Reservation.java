public class Reservation {
    private String roomType;
    private int numberOfNights;
    private boolean isWeekend;

    // constructor

    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }
    // getters and setters


    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }
    // derived getter - figures out the per nihgt price
    public double getPrice() {
        double price;

        if (this.roomType.equalsIgnoreCase("king")) {
            price = 139.00;
        } else {
            price = 124.00;
        }

        if (this.isWeekend) {
            price = price * 1.10; // for 10 percetn  for weekend
        }
        return price;
    }
    // derived getters - total cost pf the whole stay
    public double getReservationTotal() {
        return getPrice() * this.numberOfNights;
    }

}