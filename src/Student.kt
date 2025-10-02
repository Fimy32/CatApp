class Student {
    class Student (val id: Int, var name: String, var course: String) {

        var mark: Int = 0
            set(mark) {
                if (mark in 0..100) {
                    field = mark
                }
            }

        fun getGrade(): String {
            return when (mark) {
                in 0..39 -> "Fail"
                in 40..49 -> "Third"
                in 50..59 -> "2/2"
                in 60..69 -> "2/1"
                in 70..100 -> "First"
                else -> "Invalid Grade"
            }
        }

        override fun toString(): String {
            return "Name: $name Course: $course Mark: mark"
        }
    }
}