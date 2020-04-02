package DI.conversor

import org.DI.conversor.Kilometre
import org.DI.conversor.Mile
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ConvertToTest {

    val conversorKM = Kilometre()
    val conversorML = Mile()

    @BeforeEach
    fun ConvertToTest() {
        //Inyecciones de dependencia
        conversorKM.destinationConvert = Mile()
        conversorML.destinationConvert = Kilometre()
    }

    @Test
    fun ofKmToMl() {
        assertEquals(16.78060907395898, conversorKM.converterTo(27.0))
    }

    @Test
    fun ofMlToKm() {
        assertEquals(43.443, conversorML.converterTo(27.0))
    }
}