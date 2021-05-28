import java.time.LocalDate
import java.time.LocalDateTime

fun main(args: Array<String>) {
    val dateAndtime: LocalDateTime = LocalDateTime.now()
    val onlyDate: LocalDate = LocalDate.now()

    println("Current date and time: $dateAndtime")
    println("Current date: $onlyDate")
}