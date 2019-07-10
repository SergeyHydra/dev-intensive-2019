package ru.skillbranch.devintensive.utils

object Utils {
    fun parseFullName(fullName:String?):Pair<String?, String?> {

        val parts: List<String>
        var firstName: String? = null
        var lastName: String? = null

        if (fullName != null) {
                if (fullName.contains(" ")) {
                    parts = fullName.split(" ")
                    if ((parts[0]!="")&&(parts[0]!=" ")) firstName = parts[0] else firstName = null
                    if ((parts[1]!="")&&(parts[1]!=" ")) lastName = parts[1] else lastName = null
                } else {
                    if (fullName!="") firstName = fullName else firstName = null
                    lastName = null
                }
        }
        return Pair(firstName, lastName)
    }



    fun transliteration(payload: String, divider:String=" "): String {
        TODO()
    }

    fun toInitials(firstName: String?, lastName: String?): String? {
        TODO()
    }
}