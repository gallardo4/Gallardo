/**
 * Aquesta funció s'utilitza per a denominar el preu base de la furgoneta del client segons el seu model
 * @author gallardo4
 * @since 19/12/23
 */
fun calcularPreuBase(normal:Boolean):Double{
    val preuBase: Double = when(normal){
        true -> 73490.0
        false -> 93490.0
    }
    return preuBase
}

/**
 * Aquesta funció s'utilitza per a calcular el preu actual de la furgoneta del client segons els km recorreguts
 * @author gallardo4
 * @since 19/12/23
 */
fun calcularPreuActual(preuBase:Double):Double{
    val kmTotales=llegirLong(BLUE+"Introduce los km de tu furgoneta:"+RESET,0)
    println(PURPLE+"Tu furgoneta ha recorrido un total de "+kmTotales+"km"+RESET)
    val preuActual:Double=preuBase-preuBase*porcentajeKM()*kmTotales
    return  preuActual-depreciacionEstadoNeumaticos()
}