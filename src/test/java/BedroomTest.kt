import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class BedroomTest {

    val bedroom1 = Bedroom(101, 2, "Double")
    val guest = Guest("John Brown")

    @Test
    fun getRoomNumber() {
        assertEquals(101, bedroom1.roomNumber)
    }

    @Test
    fun getCapacity() {
        assertEquals(2, bedroom1.capacity)
    }

    @Test
    fun getType() {
        assertEquals("Double", bedroom1.type)
    }

    @Test
    fun bedroomStartsEmpty() {
        assertEquals(0, bedroom1.countGuests())
    }

    @Test
    fun canAddGuestToRoom() {
        bedroom1.addGuestToRoom(guest)
        assertEquals(1, bedroom1.countGuests())
    }
}