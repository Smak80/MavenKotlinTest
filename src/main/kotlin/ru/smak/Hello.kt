package ru.smak

import ru.smak.graphics.Converter
import ru.smak.graphics.Plane

fun main(args: Array<String>) {
    val plane = Plane(
        -5.0, 5.0,
        -5.0, 5.0,
        1000, 1000)
    println(Converter.xScrToCrt(99, plane))
    println("WORKS!")
}

