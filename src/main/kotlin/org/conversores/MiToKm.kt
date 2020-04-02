package org.conversores

class MiToKm(longitude: Double) : Conversor(longitude) {
    override fun doConvert(): Double = this.longitude * 1.609
}