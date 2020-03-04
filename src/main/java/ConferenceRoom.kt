class ConferenceRoom (name: String, capacity: Int) {

    val name: String = name
    val capacity: Int = capacity
    val guests: ArrayList<Guest> = ArrayList()

    fun countGuests(): Int {
        return guests.size
    }
}