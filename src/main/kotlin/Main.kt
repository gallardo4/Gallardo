fun main(){
    menu()
    val normalOCamper:Boolean = pedirVersionFurgo()
    val suma250:Boolean = pedirTienePortaBicis()
    val sumaYa250:Int
    if (suma250) sumaYa250=250
    else sumaYa250=0
    val precioBase=calcularPreuBase(normalOCamper)+sumaYa250
    val precioActual=calcularPreuActual(calcularPreuBase(normalOCamper))+sumaYa250
    println(YELLOW+"El precio base de tu furgoneta es: "+precioBase+"€"+RESET)
    println(YELLOW+"El precio actual de tu furgoneta es: "+precioActual+"€"+RESET)
}

/**
 * Aquesta funció s'utilitza per a demanar al client la versió de la seva furgoneta
 * @author arnau.gallardo
 * @since 19/12/23
 */
fun pedirVersionFurgo():Boolean{
    println(CYAN+"¿Tu furgoneta es la versión normal (true) o la versión Camper (false)?"+RESET)
    var versionFurgo=readBoolean(BLUE+"Introduce la versión de tu furgoneta:"+RESET,"introduce true/false")
    if (versionFurgo){
        println(PURPLE+"Tienes la furgoneta normal"+RESET)
    }else{
        println(PURPLE+"Tienes la versión Camper"+RESET)
    }
    return versionFurgo
}

/**
 * Aquesta funció s'utilitza per a demanar al client si la seva furgoneta té o no portabicis, per tal de després incrementar el preu de la mateixa
 * @author arnau.gallardo
 * @since 19/12/23
 */
fun pedirTienePortaBicis():Boolean{
    var portaBicis=readBoolean(BLUE+"¿Tiene portabicis tu furgoneta?:"+RESET,"introduce true/false")
    if (portaBicis) println(PURPLE+"Tu furgoneta tiene portabicis"+RESET)
    else println(PURPLE+"Tu furgoneta no tiene portabicis"+RESET)
    return portaBicis
}


/**
 * Aquesta funció utilitza AsciiArt per a donar la benvinguda
 * @author arnau.gallardo
 * @since 19/12/23
 */
fun menu(){
    println(GREEN+"######  ### ####### #     # #     # ####### #     # ### ######  #######       #    #          #     # ####### ######   #####     #    ######  ####### \n" +
            "#     #  #  #       ##    # #     # #       ##    #  #  #     # #     #      # #   #          ##   ## #       #     # #     #   # #   #     # #     # \n" +
            "#     #  #  #       # #   # #     # #       # #   #  #  #     # #     #     #   #  #          # # # # #       #     # #        #   #  #     # #     # \n" +
            "######   #  #####   #  #  # #     # #####   #  #  #  #  #     # #     #    #     # #          #  #  # #####   ######  #       #     # #     # #     # \n" +
            "#     #  #  #       #   # #  #   #  #       #   # #  #  #     # #     #    ####### #          #     # #       #   #   #       ####### #     # #     # \n" +
            "#     #  #  #       #    ##   # #   #       #    ##  #  #     # #     #    #     # #          #     # #       #    #  #     # #     # #     # #     # \n" +
            "######  ### ####### #     #    #    ####### #     # ### ######  #######    #     # #######    #     # ####### #     #  #####  #     # ######  ####### "+RESET)
}

/**
 * Aquesta funció s'utilitza per a saber quina quantitat s'ha de restar al preu de la furgoneta segons els km dels pneumàtics
 * @author arnau.gallardo
 * @since 19/12/23
 */
fun depreciacionEstadoNeumaticos():Int{
    var estadoNeumaticos=llegirLong(BLUE+"Introduce los km recorridos con los neumáticos acutales:"+RESET,0)
    println(PURPLE+"Los neumáticos actuales de tu furgoneta han reccorrido "+estadoNeumaticos+"km"+RESET)
    var depreciacion:Int
    if (estadoNeumaticos<5000){
        depreciacion=0
    }else if (estadoNeumaticos>=5000 && estadoNeumaticos<10000){
        depreciacion=200
    }else{
        depreciacion=300
    }
    return depreciacion
}

/**
 * Aquesta funció s'utilitza per a saber el valor per km segons els anys de la furgoneta del client
 * @author arnau.gallardo
 * @since 19/12/23
 */
fun porcentajeKM():Double{
    var porcentaje:Double
    var anosFurgo=llegirInt(BLUE+"Introduce los años de tu furgoneta:"+RESET,0,100)
    println(PURPLE+"Tu furgoneta lleva matriculada "+anosFurgo+" años"+RESET)
    if (anosFurgo<6) porcentaje=0.00001
    else if (anosFurgo>=6 && anosFurgo<10) porcentaje=0.00002
    else porcentaje=0.00004
    return porcentaje
}