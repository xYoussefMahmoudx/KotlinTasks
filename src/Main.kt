import java.util.Scanner

fun main(){
var scn =Scanner(System.`in`)
    println("enter bmw car model color and speed")
    val bm = BMW(scn.next(),scn.next(),scn.nextFloat())
    scn.nextLine()
    println("fuel type is ${bm.getFuelType()}")
    println("enter tesla car model color and speed")
    val ts = BMW(scn.next(),scn.next(),scn.nextFloat())
    scn.nextLine()
    println("fuel type is ${ts.getFuelType()}")
}

abstract  class Car(model:String,color:String,speed:Float){


    open fun getFuelType():String{
        return "no spacfic fuel"
    }


}
 class BMW (model:String,color:String,speed:Float): Car(model,color,speed){

     override fun getFuelType(): String {

         return "gas"

     }
 }

class Tesla (model:String,color:String,speed:Float): Car(model,color,speed){

    override fun getFuelType(): String {

        return "electricity"

    }
}