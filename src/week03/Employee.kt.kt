package oop_135944_FauziAndrian.week02.week03

class `Employee.kt` (val name: String) {
    var salary: Int = 0
        set(value) {
            println("Mencoba set gaji ke: $value")
            this.salary = value
        }
}


