package `111362_Helen_week6`

class SmartSpeaker(override val id: String, override val name: String) : SmartDevice, Switchable {
    override fun turnon() {
        println("Speaker $name aktif dan siap menerima perintah suara.")
    }
    override fun turnoff() {
        println("Speaker $name memasuki mode tidur.")
    }
    fun playMusic(song: String) {
        println("Memutar lagu $song dari Spotify.")
    }
}