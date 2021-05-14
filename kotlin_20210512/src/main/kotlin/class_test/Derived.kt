package class_test
class Derived(b: Base) : Base by b  { // delegating the public method on the object b
}