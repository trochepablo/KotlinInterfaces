package org.conversores

class BiConvertKmToMi(private val conversor: Conversor) : Convertible {
    override fun doConvert() = conversor.doConvert()
}