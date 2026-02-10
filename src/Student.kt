package oop_135944_FauziAndrian.week02

class Student(val name: String, val nim: String, var major: String) {
    init {
        // validasi sederhana: cek panjang Nim
        if(nim.length != 5) {
            println("Warning: objek tercipta dengan NIM ($nim) yang tidak valid!")
            println("Data mahasiswa $name mungkin akan bermasalah di sistem.")
        } else {
            println("LOG: Objek Student $name berhasil dialokasikan di memory.")
        }
    }
}
