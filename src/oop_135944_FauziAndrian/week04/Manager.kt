package oop_135944_FauziAndrian.week02.oop_135944_FauziAndrian.week04

class Manager(name: String, baseSalary: Int) : Employee(name, baseSalary) {

    override fun work() {
        println("$name sedang memimpin rapat divisi")
    }

    override fun calculateBonus(): Int {
        return super.calculateBonus() + 50000
    }
}