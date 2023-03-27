package pt.ulusofona.cm.kotlin.challenge.interfaces

import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.util.*

interface DateFormat {
    fun dateFormat(dateText: String, pattern : String = "dd-mm-yyyy"): Date {
        val formatter = SimpleDateFormat(pattern)
        return formatter.parse(dateText)
    }

    fun currentDate() : Date {
        return dateFormat(  LocalDateTime.now().toString()
                            .subSequence(0..9).toString(),
                            "yyyy-mm-dd")
    }

    fun dateToString(date: Date, pattern: String = "dd-mm-yyyy"): String{
        val format = SimpleDateFormat(pattern)
        return format.format(date)
    }

    fun dateDiffYears(from: Date, to : Date): Int{
        //val formatter = SimpleDateFormat("dd-mm-yyyy")

        val fromSt = dateToString(from)
        val fromYear = fromSt.subSequence(6..9).toString().toInt()
        val fromMonth = fromSt.subSequence(3..4).toString().toInt()
        val fromDay = fromSt.subSequence(0..1).toString().toInt()
        val toSt = dateToString(to)
        val toYear = toSt.subSequence(6..9).toString().toInt()
        val toMonth = toSt.subSequence(3..4).toString().toInt()
        val toDay = toSt.subSequence(0..1).toString().toInt()

        return toYear - fromYear - (if (toMonth >= fromMonth && toDay >= fromDay) 0 else 1)
    }

    fun age ( date : Date): Int{
        return dateDiffYears(date, currentDate() )
    }

}