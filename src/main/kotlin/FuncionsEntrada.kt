import java.util.Scanner

/**
 * Aquesta funció s'utilitza per a llegir un nombre enter
 * @author gallardo4
 * @since 19/12/23
 */
fun llegirInt(mensaje:String,intMin:Int,intMax:Int):Int{
    val scan=Scanner(System.`in`)
    var valorInt=0
    var valorCorrecto:Boolean
    do {
        print("$mensaje ")
        valorCorrecto=scan.hasNextInt()
        if (!valorCorrecto){
            println(RED+"ERROR: introduce un número entero"+RESET)
        }else{
            valorInt=scan.nextInt()
            if (valorInt<intMin || valorInt>intMax){
                valorCorrecto=false
                println(RED+"ERROR: Introduce un número entre los valores requeridos"+RESET)
            }
        }
        scan.nextLine()
    }while (!valorCorrecto)
    return valorInt
}

/**
 * Aquesta funció s'utilitza per a llegir un nombre enter llarg
 * @author gallardo4
 * @since 19/12/23
 */
fun llegirLong(mensaje:String,longMin:Long): Long {
    val scan=Scanner(System.`in`)
    var valorLong:Long=0
    var valorCorrecto:Boolean
    do {
        print("$mensaje ")
        valorCorrecto=scan.hasNextLong()
        if (!valorCorrecto){
            println(RED+"ERROR: introduce un número entero"+RESET)
        }else{
            valorLong= scan.nextLong()
            if (valorLong<longMin){
                valorCorrecto=false
                println(RED+"ERROR: Introduce un número mayor a 0"+RESET)
            }
        }
        scan.nextLine()
    }while (!valorCorrecto)
    return valorLong
}

/**
 * Aquesta funció s'utilitza per a llegir un nombre decimal
 * @author gallardo4
 * @since 19/12/23
 */
fun llegirDouble(mensaje:String,intMin:Double,intMax:Double):Double{
    val scan=Scanner(System.`in`)
    var valorDouble=0.0
    var valorCorrecto:Boolean
    do {
        print("$mensaje ")
        valorCorrecto=scan.hasNextInt()
        if (!valorCorrecto){
            println(RED+"ERROR: introduce un número decimal"+RESET)
        }else{
            valorDouble=scan.nextDouble()
            if (valorDouble<intMin || valorDouble>intMax){
                valorCorrecto=false
                println(RED+"ERROR: Introduce un número entre los valores requeridos"+RESET)
            }
        }
        scan.nextLine()
    }while (!valorCorrecto)
    return valorDouble
}