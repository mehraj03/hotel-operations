public class Room {
    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;

    // constructor - set the starting values when a room is created
    public Room(int numberOfBeds, double price, boolean occupied, boolean dirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
    }

    // getter

    public boolean isDirty() {
        return dirty;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public double getPrice() {
        return price;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }
    public boolean isAvailable() {
        return !this.occupied && !this.dirty;
    }
    public void checkIn() {
        this.occupied = true;
        this.dirty = true;
    }
    public void checkout() {
        this.occupied = false;
    }
    public void cleanRoom() {
        this.dirty = false;
    }
}
