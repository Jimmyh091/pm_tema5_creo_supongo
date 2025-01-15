package com.example.myapplication

import android.util.Log
import java.lang.ClassCastException

fun main(){
    ej27()
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

    var nombre = "Jiame"
    var edad = 198

    print("Hola me llamo %s y tengo %i anos".format(nombre, edad))
}

fun ej12(cadenacita : String) : String{
    return cadenacita.substring(2, 6)
}

fun ej13(){

    var a : Any? = null
    var b : Any? = null

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

fun ej14() : Int{
    var a = 3
    return a ?: -1
}

fun ej15(a : Any){

    if (a is String){
        print(a.length)
    }

}

fun ej16(){

    var a = readLine()
    var b = readLine()

    var aReal = 0
    var bReal = 0

    try {
        aReal = a as Int
        bReal = b as Int
    }catch (e : Exception){
        throw ClassCastException("no hagas esoo")
    }

    if (aReal == 0 || bReal == 0){
        throw ArithmeticException("El operador es 0")
    }else{
        print(aReal / bReal)
    }

}

fun ej17(){

    var a = readLine()
    var aDura : Any

    try {
        aDura = a as Int
    }catch (e : Exception){
        throw ClassCastException("NO HAGAS ESOOo")
    }


}

fun ej18(){

    var a = readLine()
    var b = readLine()

    try {
        var c = a?.toInt()
        var d = b?.toInt()
    }catch (e : Exception){

    }
}

fun ej19(a : Any){

    try {
        var aDura = a as Int
        print("$aDura + 3 = ${a + 3}")
    }catch (e : Exception){
        print("El mensaje es $a")
    }

    if (a is Int){
        print("$a + 3 = ${a + 3}")
    }else{
        print("el mensaje recibido es $a")
    }

}

fun ej20(){

    try {
        var a = "kiasjufh"
        var b = a + 3
        print(a + b)
    }catch (e : Exception){
        print("puto")
    }finally {
        print("finalmente")
    }

}

fun ej21(){

    class Point (var x1 : Double, var y1 : Double){

        infix fun calcularDistancia(xy : List<Float>) : Float{
            return Math.sqrt(Math.pow(xy[0] - x1 , 2.0) + Math.pow(xy[1] - y1, 2.0)).toFloat()
        }

    }

}

fun ej22(){

    val a by lazy { 3 + 4 }
    lateinit var b : String

    b = "la suma de 3 + 4 es $a"
}

fun ej23(){

    var a = ""

    with(a){
        StringBuilder("Esta es la primera linea")
        StringBuilder("vamos a la segunda")
        StringBuilder("alkjsfhaksejf")
    }

    print(a)
}

fun ej24(){

    class Person(var name : String = "", var age : Int = 0, var address : String = "Francia")

    var manu = Person()

    manu.apply {
        name = "manu"
        age = 23
        address = "ESPAÑA JODER"
    }

}

fun ej25(){

    class Rectangl(var altura : Float = 0f, var anchura : Float = 0f)

    var rctngl = Rectangl()

    rctngl.run {
        altura = 3f
        anchura = 5f
        print("El area es ${altura * anchura}")
    }
}

fun ej26(){

    var a : String? = ""

    a.let {
        if (a != null) {
            println(a.length)
        }
    }
}

fun ej27(){
    var a = listOf(3,4,5,6,7,7,8,989,9,98,78,67,56,4)


    a.forEach {
        it + 1
    }.also {
        print(it)
    }

}