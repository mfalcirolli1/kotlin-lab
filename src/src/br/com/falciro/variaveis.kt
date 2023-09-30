package br.com.falciro

import java.math.BigDecimal

fun main() {

    val imutable: Int = 0
    var mutable: String? = null

    var byte: Byte = 127 // 1 bytes
    var short: Short = 32767 // 2 bytes
    var int: Int = 2147483647 // 4 bytes
    var long: Long = 9223372036854775807 // 8 bytes

    var float: Float = 1.34F // 6-7 decimal digits
    var double: Double = 1.34 // 15-16 decimal digits
    var bigDecimal: BigDecimal = BigDecimal("1.38")

    var boolean: Boolean = true

    var char: Char = 'M'

    var string: String = "M"

    var array: Array<Int> = arrayOf(1, 2, 3, 4, 5)

    var test = BigDecimal("1.38")
}