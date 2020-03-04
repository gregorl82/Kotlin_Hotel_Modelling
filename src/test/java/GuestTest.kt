import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class GuestTest {

    val guest = Guest("John Brown")

    @Test
    fun getName() {
        assertEquals("John Brown", guest.name)
    }
}