import java.awt.Color

fun main(){
 var vehicle=Car("Toyota","nissan","red")
    println(vehicle)
    println(name("jane james fridah"))
//    var cash=currentAccount()
}
data class Car(var make:String,var  model:String,var Color:String){
 fun carList(color: String){
     when(color){
         "red" ->println("prado")
         "blue"-> println("nissan")
         else-> println(" yellow private car ")
     }
     print("color")
 }
  }
fun name(word:String){
    if (word.length<5){
        return name("jane, mercy,Thomas,laura") }



}
class CurrentAccount( var accountNumber:Int, var accountName:String,var number:Int,){
    fun deposit(amount:Double):Int{
        var amount=5000
        var deposit=1000
        amount=1000+1000
        return amount


    }
}

