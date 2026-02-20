package oop_135944_FauziAndrian.week02.meet03

open class Karyawan {
    private var nama:String = "ucok"
    private var gaji:Int = 0
    protected var namaPacar: String = "jomblo"

    public var umur: Int = 0
    set(value) {
        if(value<0) {
            println("Masa umur minus");
        } else {
            field = value;
        }
    }

    fun set_gaji(gajimu: Int) {
        if (gajimu <= 0){
            println("Gajinya belum ada")
        } else {
            this.gaji = gajimu
        }
    }

    fun get_gaji(): Int{
        return this.gaji
    }

    fun set_nama(namakamu:String){
        if(namakamu.isEmpty()) {
            println("Namamu gak boleh kosong")
        } else {
            this.nama = namakamu
        }
    }

    fun get_nama():String {
        return this.nama
    }
}

class DataPribadi : Karyawan() {
    fun ambil_data_pacar():String {
        return this.namaPacar
    }
}

fun main() {
    val dp = DataPribadi()
    println("Nama pacar: " + dp.ambil_data_pacar())
    println("Nama karyawan: " + dp.get_nama())
    dp.umur = 10;
    println("Nama karyawan: " + dp.get_nama() + ", umur: " + dp.umur);
}

    /*var kry = Karyawan();
    kry.set_nama("Ucok Siregar");
    kry.set_gaji(500000);
    println("Hai" + kry.get_nama());
    println("gaji " + kry.get_gaji());
*/