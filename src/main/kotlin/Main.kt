import java.util.Scanner

fun main(){
    menu()
}

fun pedirVersionFurgo():Boolean{
    var versionFurgo=readBoolean("Introduce la versión de tu furgoneta:","introduce true/false")
    return versionFurgo
}

fun readKM(message:String,kmMin:Int):Int{
    val scanner=Scanner(System.`in`)
    var intValue=0
    var correctValue:Boolean
    do {
        print(message)
        correctValue=scanner.hasNextInt()
        if (!correctValue){
            println("ERROR: introduce un número entero")
        }else{
            intValue=scanner.nextInt()
            if (intValue<kmMin){
                println("ERROR: el valor introducido debe ser mayor a 0")
                correctValue=false
            }
        }
        scanner.nextLine()
    }while (!correctValue)
    return intValue
}

fun menu(){
    println("Bienvenido al mercado de vehículos")
}

fun pedirEstadoNeumaticos(){
    var estadoNeumaticos=llegirInt("Introduce los km recorridos con los neumáticos acutales",0,500000)
    if (estadoNeumaticos<5000){
        calcularPreuActual(calcularPreuBase(pedirVersionFurgo()))
    }
}