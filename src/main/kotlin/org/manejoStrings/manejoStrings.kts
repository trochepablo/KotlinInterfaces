package org.manejoStrings

fun revert(cadena : String) = cadena.reversed()
fun isPalidrome(cadena: String) = cadena.toLowerCase() == cadena.toLowerCase().reversed()
fun countVowels(cadena: String) = cadena.filter { c -> c == 'a' || c == 'e' || c == 'a' || c == 'a' || c == 'a' }.length
fun countWords(cadena: String) = cadena.split(" ").size
fun countParagraph(cadena: String) = cadena.lines().size
