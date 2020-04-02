package org.conversores

class KmToMi(longitude: Double) : Conversor(longitude) {
    override fun doConvert() = this.longitude / 1.609
}