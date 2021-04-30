fun main() {
    println(names(listOf("Olga","Esther","Ian","Mercy","Faith","Arthur","Angela","Grace","Ruth","Ivy")))
    person()
    addition()
    println(averageHeight(listOf(3.7,4.6,2.4,1.8)))
    println(drive(listOf(12000,30000,13000)))

}
fun names(name:List<String>):List<String>{
    var x= mutableListOf<String>()
    for (Name in name){

    if (name.indexOf(Name) % 2==0){
        x.add(Name)
}
    }
    return (x)
       }

fun averageHeight(height:List<Double>):Pair<Double,Double>{
    var sum=height.sum()
    var average=height.average()
    return Pair(sum,average)
}
data class People(var name: String, var age: Int, var heigt: Int, var weight: Int)

fun person() {

    var person = mutableListOf(
        Person("Olga", 20, 2, 65),
        Person("Arthur", 21, 4, 70),
        Person("Vickie", 22, 5, 75),
    )
    var sortedPerson = person.sortedByDescending { person -> person.age }
    println(sortedPerson)
}

data class Person(var name: String, var age: Int, var heigt: Int, var weight: Int)

   fun addition() {

       var personObject = mutableListOf(
           Person("Olga", 20, 2, 65),
           Person("Arthur", 21, 4, 70),
           Person("Vickie", 22, 5, 75),

           )

    personObject.addAll(listOf(

        Person("Mercy",23,4,50),
        Person("Eve",22,3,45),
    ))
    println(personObject)

}
data class Car(var registration:String,var mileage:Int)
fun drive(mileage:List<Int>):Int{

   var car= mutableListOf(
       Car(" KCF 568Y",350),
        Car(" KCB 243G",450),
        Car("KDF 789J",250),

        )

    var x= mileage.average().toInt()
    return x
}






