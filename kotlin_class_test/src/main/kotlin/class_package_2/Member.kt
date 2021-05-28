package class_package_2

import java.time.LocalDateTime

class Member(name : String, val registered : LocalDateTime = Instant().now()) : Person5(name) {
}