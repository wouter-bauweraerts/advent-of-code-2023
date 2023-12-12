package be.thebeehive.wouterbauweraerts.common

import java.io.File
import kotlin.text.Charsets.UTF_8

fun readFromFile(path: String): String {
    return File(ClassLoader.getSystemResource(path).file).readText(UTF_8).trimEnd()
}