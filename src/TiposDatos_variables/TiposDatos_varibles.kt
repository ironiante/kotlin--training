package TiposDatos_variables
/**
 * @author jirman
todos los tipos de datos son objetos
-  Tipo de dato entero
-  Tipo de datos de punto flotante
-  Tipo de datos booleanos
-  Tipo de datos de carácter
las variables se declaran  de tipo
-inmutables ---> val no cambian
- mutables ---> var cambian
 */
fun main(){
    var myBirthDate = "02/12/1993"
    val myNewBirthDate = myBirthDate
    println(myNewBirthDate)
    var Myage=25
    Myage=26
    print("my new age is ${Myage}")
//____________________________________________________________________________
    /**
     * byte --->8bits
     * short 16 bits
     * int ---> 32 bits
     * long-->64 bits
     */
var myint=35
var mylong=23L
println("my integer ${myint}")
println("my long integer ${mylong}")
var b1:Byte= Byte.MIN_VALUE
var b2:Byte= Byte.MAX_VALUE
println("smallest byte value:${b1}" )
println("largest byte value:"+b2)
//_____________________________________________________________________
 //   Tipo de datos de punto flotante
    /**
     * float --> 32 bits
     * double --->64 bits
      */
var myfloat=54F
    println("my float value ${myfloat}")
//___________________________________________________________________________
    /**
     * boolean --> 1 bit true or false
     */
var myboolean=false
if (myboolean==true)
    println(" myboolean is true")

//_____________________________________________________________________________
    /**
     * char ---> 8 bits , se llama con comillas sencillas.
     */

}



