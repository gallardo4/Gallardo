import java.util.Scanner

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

fun newValue():String{
    var value=73490-73490*0.00001*readKM(message = "Introduce los km de tu furgoneta: ", kmMin = 0)
    return "El nuevo valor de tu furgoneta es: $value€"
}

fun menu(){
    println("Bienvenido al mercado de vehículos")
}

fun main(){
    menu()
    println(newValue())
}