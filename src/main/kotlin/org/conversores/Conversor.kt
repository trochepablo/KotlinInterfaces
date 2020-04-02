package org.conversores

abstract class Conversor(val longitude: Double) : Convertible {
    abstract override fun doConvert() : Double
}