import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class BookingTest {

    val bedroom = Bedroom(123, 2, "Single")

    val booking = Booking(bedroom, 2)

    @Test
    fun getBedroom() {
        assertEquals(bedroom, booking.bedroom)
    }

    @Test
    fun getNumberOfNights() {
        assertEquals(2, booking.numberOfNights)
    }
}