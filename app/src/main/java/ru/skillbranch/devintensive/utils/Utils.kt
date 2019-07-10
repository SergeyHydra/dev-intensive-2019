package ru.skillbranch.devintensive.utils

const val PROBEL = " "
const val EMPTY_STRING = ""

object Utils {
    fun parseFullName(fullName: String?): Pair<String?, String?> {
        val parts: List<String>
        var firstName: String? = null
        var lastName: String? = null

        if (fullName != null) {
            if (fullName.contains(PROBEL)) {
                parts = fullName.split(PROBEL)
                if ((parts[0] != EMPTY_STRING) && (parts[0] != PROBEL)) firstName = parts[0] else firstName = null
                if ((parts[1] != EMPTY_STRING) && (parts[1] != PROBEL)) lastName = parts[1] else lastName = null
            } else {
                if (fullName != EMPTY_STRING) firstName = fullName else firstName = null
                lastName = null
            }
        }

        return firstName to lastName
    }

    fun transliteration(payload: String, divider:String=" "): String {
        TODO()
    }

    fun toInitials(firstName: String?, lastName: String?): String? {
        TODO()
    }
}