package `111362_Helen_week6`

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
    }
    fun activateSecurityMode() { // [cite: 169]
        for (device in devices) { // [cite: 169]
            if (device is Recordable) { // [cite: 170]
                device.startRecord() // [cite: 170]
            }
            if (device is SmartSpeaker) { // [cite: 170, 171]
                device.playMusic("Sirine Peringatan") // [cite: 171]
            }
        }
    }
    fun turnOffAllSwitches() {
        for (device in devices) {
            if (device is Switchable) {
                device.turnoff()
            }
        }
    }
}
