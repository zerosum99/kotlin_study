package class_test

class Class_Inner {
    private val welcomeMessage: String = "Welcome to the TutorialsPoint.com"
    inner class Nested {
        fun foo() = welcomeMessage
    }
}