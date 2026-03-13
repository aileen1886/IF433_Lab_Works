package `111362_Helen_week6`

class SmartLamp(override val id: String, override val name: String) : SmartDevice, Switchable {
    override fun turnon() {
        println("Lampu $name menyala terang.")
    }
    override fun turnoff() {
        println("Lampu $name dimatikan.")
    }
}