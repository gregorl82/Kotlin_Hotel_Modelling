import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ConferenceRoomTest {

    val conferenceRoom = ConferenceRoom("Lomond Suite", 5)

    @Test
    fun getName() {
        assertEquals("Lomond Suite", conferenceRoom.name)
    }

    @Test
    fun getCapacity() {
        assertEquals(5, conferenceRoom.capacity)
    }

    @Test
    fun conferenceRoomStartsEmpty() {
        assertEquals(0, conferenceRoom.countGuests())
    }
}