class Hotel (name: String, bedrooms: ArrayList<Bedroom>, conferenceRooms: ArrayList<ConferenceRoom>) {

    val name: String = name
    val bedrooms: ArrayList<Bedroom> = bedrooms
    val conferenceRooms: ArrayList<ConferenceRoom> = conferenceRooms

    fun countBedrooms(): Int {
        return bedrooms.size
    }

    fun countConferenceRooms(): Int {
        return conferenceRooms.size
    }
}