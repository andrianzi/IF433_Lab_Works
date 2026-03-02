package oop_135944_FauziAndrian.week02.oop_135944_FauziAndrian.week04

class Developer(
    name: String,
    baseSalary: Int,
    val programmingLanguage: String
) : Employee(name, baseSalary) {

    override fun work() {
        println("$name sedang ngoding menggunakan $programmingLanguage")
    }
}