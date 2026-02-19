package oop_111362_Helen.week2

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- APLIKASI PMB UMN ---")
    print("Masukkan Nama: ")
    val name = scanner.nextLine()
    print("Masukkan NIM (Wajib 5 Karakter): ")
    val nim = scanner.next()
    scanner.nextLine() //

    if (nim.length != 5) {
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")
    } else {
        print("Pilih Jalur (1. Reguler, 2. Umum): ")
        val type = scanner.nextInt()
        scanner.nextLine()

        if (type == 1) {
            print("Masukkan Jurusan: ")
            val major = scanner.nextLine()
            val s1 = Student(name, nim, major)
            println("Terdaftar di: ${s1.major} dengan GPA awal ${s1.gpa}") //
        } else if (type == 2) {
            val s2 = Student(name, nim) //
            println("Terdaftar di: ${s2.major} dengan GPA awal ${s2.gpa}")
        } else {
            println("Pilihan ngawur, pendaftaran batal!")
        }
        println("Status: Pendaftaran Selesai.")
    }


    println("\n--- SISTEM DENDA PERPUSTAKAAN ---")

    if (scanner.hasNextLine()) scanner.nextLine()

    print("Judul Buku: ")
    val book = scanner.nextLine()
    print("Nama Peminjam: ")
    val borrowerName = scanner.nextLine()
    print("Lama Pinjam (Hari): ")
    var duration = scanner.nextInt()

    if (duration < 0) duration = 1

    val loanObj = Loan(book, borrowerName, duration)
    println("Detail Pinjaman: ${loanObj.bookTitle} oleh ${loanObj.borrower}")
    println("Total Denda: Rp ${loanObj.calculateFine()}") //


    println("\n--- MINI RPG BATTLE ---")
    print("Nama Hero: ")
    val heroName = scanner.next()
    print("Damage Hero: ")
    val heroDamage = scanner.nextInt()

    val myHero = Hero(heroName, heroDamage)
    var enemyHp = 100 //


    while (myHero.isAlive() && enemyHp > 0) {
        println("\nHP ${myHero.name}: ${myHero.hp} | HP Musuh: $enemyHp")
        print("Menu: 1. Serang, 2. Kabur: ")
        val action = scanner.nextInt()

        if (action == 1) {
            myHero.attack("Enemy") //
            enemyHp -= myHero.baseDamage

            if (enemyHp > 0) {
                val dmgDealt = (10..20).random() //
                myHero.takeDamage(dmgDealt) //
                println("Musuh membalas! ${myHero.name} menerima $dmgDealt damage.")
            }
        } else {
            println("Kamu kabur!")
            break //
        }
    }


    if (enemyHp <= 0) {
        println("Selamat! Musuh mati. ${myHero.name} menang!")
    } else if (!myHero.isAlive()) {
        println("Game Over... ${myHero.name} telah gugur.")
    }
}

