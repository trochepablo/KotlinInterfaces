package org.DI.conversor

abstract class LongitudeUnit() : IConversor {

    lateinit var destinationConvert: IConversor

    constructor(destinationConvert: IConversor) : this(){
        this.destinationConvert = destinationConvert
    }

    abstract val valueUnit: Double
    abstract override fun converter(longitude: Double) : Double
    abstract override fun converterTo(longitude: Double): Double
}