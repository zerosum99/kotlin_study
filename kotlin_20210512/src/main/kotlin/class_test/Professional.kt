package class_test

class Professional (override val musicalInstrument: String,):PlayMusic {
    override fun play(mi: String) {
        println(" 프로가 연주 $mi 로 연주함 ")
    }
}