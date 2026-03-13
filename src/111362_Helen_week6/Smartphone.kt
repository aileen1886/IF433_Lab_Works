package `111362_Helen_week6`

class Smartphone: Camera, Phone {
    override fun turnon() {
        super<Camera>.turnon()
        super<Phone>.turnon()
        println("Sistem operasi Smartphone berhasil booting.")
    }
}