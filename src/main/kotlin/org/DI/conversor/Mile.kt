package org.DI.conversor

class Mile : LongitudeUnit() {

    override val valueUnit = 1.609

    override fun converter(longitude: Double)= longitude / this.valueUnit

    override fun converterTo(longitude: Double)=  this.destinationConvert.converter(longitude)
}