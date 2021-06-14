package class_pure

class WhoAmI_{
    private val name:String
    constructor(name:String){
        this.name = name
    }
    fun myNameIs() = "나의 이름은 ${name}입니다."
}