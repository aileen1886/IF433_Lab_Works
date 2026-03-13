package `111362_Helen_week6`

class SmartCCTV(override val id: String, override val name: String) : SmartDevice, Switchable, Recordable {
    override fun turnon() {
        println("Kamera $name dihidupkan.")
        startRecord()
    }

    override fun turnoff() {
        println("Kamera $name dimatikan.")
        stopRecord()
    }

    override fun startRecord() {
        println("Mulai merekam video dari $name...")
    }
}