import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RoomTest {

    @Test
    public void checkIn_should_make_room_occupied_and_dirty() {
        Room room = new Room(2, 139.00, false, false);
        room.checkIn();
        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());
    }

    @Test
    public void checkout_should_make_room_not_occupied() {
        Room room = new Room(2, 139.00, true, true);
        room.checkout();
        assertFalse(room.isOccupied());
    }

    @Test
    public void checkout_should_leave_room_dirty() {
        Room room = new Room(2, 139.00, true, true);
        room.checkout();
        assertTrue(room.isDirty());
    }

    @Test
    public void cleanRoom_should_make_room_not_dirty() {
        Room room = new Room(2, 139.00, false, true);
        room.cleanRoom();
        assertFalse(room.isDirty());
    }

    @Test
    public void room_should_be_available_after_full_cycle() {
        Room room = new Room(2, 139.00, false, false);
        room.checkIn();
        room.checkout();
        room.cleanRoom();
        assertTrue(room.isAvailable());
    }

    @Test
    public void room_should_not_be_available_after_checkout_before_cleaning() {
        Room room = new Room(2, 139.00, false, false);
        room.checkIn();
        room.checkout();
        assertFalse(room.isAvailable());
    }
}
