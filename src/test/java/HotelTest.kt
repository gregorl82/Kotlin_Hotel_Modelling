import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll

internal class HotelTest {

    val bedroom1 = Bedroom(101, 2, "Single")
    val bedroom2 = Bedroom(102, 4, "Double")
    val bedrooms = arrayListOf<Bedroom>(bedroom1, bedroom2)

    val conferenceRoom1 = ConferenceRoom("Lomond Suite", 5)
    val conferenceRoom2 = ConferenceRoom("Highland Room", 3)
    val conferenceRooms = arrayListOf<ConferenceRoom>(conferenceRoom1, conferenceRoom2)

    val hotel = Hotel("Fawlty Towers", bedrooms, conferenceRooms)

    val guest = Guest("Gregor")

    @Test
    fun getName() {
        assertEquals("Fawlty Towers", hotel.name)
    }

    @Test
    fun countBedrooms() {
        assertEquals(2, hotel.countBedrooms())
    }

    @Test
    fun countConferenceRooms() {
        assertEquals(2, hotel.countConferenceRooms())
    }

    @Test
    fun canCheckInGuest() {
        hotel.checkInGuest(guest, bedroom1)
        assertEquals(1, bedroom1.countGuests())
    }
}