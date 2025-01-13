package com.example.myapplication

fun main(){

}

fun ej1(cadena : String) : Int{
    return cadena.length
}

fun ej2() : Boolean {
    var cadena1 = "dsfkljh"
    var cadena2 = "nakrfkf"

    return cadena1.equals(cadena2)
}

fun ej3() : Boolean {
    var cadena1 = "dsfkljh"
    var cadena2 = "nakrfkf"

    return cadena1.compareTo(cadena2) == 0
}

fun ej4(cadena : String) : String {
    return cadena.uppercase()
}

fun ej5(cadena : String) : String {
    return cadena.lowercase()
}

fun ej6() : String{
    var espaciocitos = "        jhdfgkj  c              "

    return espaciocitos.trim()
}

fun ej7() : String {
    var larguicitos = "adsjfhasejlhoisuefhlkias"

    var cortocitos = ""

    for (it in 0 until 5){
        cortocitos += larguicitos.get(it)
    }

    return cortocitos
}

fun ej8() : String {
    var remplazacitos = "askejfhasklefjuhskdifh"

    var remplazadocitos = remplazacitos.replace("a", "s")

    return remplazadocitos
}

fun ej9() : List<String> {
    var separadocitos = "aksjefchklasjdfhaseklfasf"

    var partidocitos = separadocitos.split("a")

    return partidocitos
}

fun ej10(cadenacita1 : String, cadenacita2 : String) : String {
    return cadenacita1 + "+" + cadenacita2
}

fun ej11(){
    // ???????????????????
}

fun ej12(cadenacita : String) : String{
    return cadenacita.substring(2, 6)
}

fun ej13(){

    var a :Any? = null
    var b :Any? = null

    try{
        a as Int
        b as Int

        var c = a + b
        var e = a - b
        var f = a * b
        var g = a / b
    }catch (e : Exception){
        println("No pueden hacer cosas con nulos ¬¬")
    }
}

fun ej14(){
    var a = 3 ?: -1
}

fun ej15(a : Any){

    if (a is String){
        print(a.length)
    }

}

fun ej16(){

    var a = 4
    var b = 2

    if (a == 0 || b == 0){
        throw ArithmeticException("gilipollas")
    }else{
        print(a / b)
    }

}

fun ej17(){

}

fun ej18(){

    var a = readLine()
    var b = readLine()

    try {
        var c = a?.toInt()
        var d = b?.toInt()
    }
}