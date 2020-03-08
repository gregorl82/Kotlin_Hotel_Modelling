class Bedroom (roomNumber: Int, capacity: Int, type: String) {

    val roomNumber: Int = roomNumber
    val capacity: Int = capacity
    val guests: ArrayList<Guest> = ArrayList()
    val type: String = type

    fun countGuests(): Int {
        return guests.size
    }

    fun addGuestToRoom(guest: Guest) {
        guests.add(guest)
    }
}