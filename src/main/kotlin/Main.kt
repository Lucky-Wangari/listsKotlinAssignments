fun main() {
    val evenIndices = numbers(listOf("Shell","Ocean","Beach","Kambucha","Sunshine","Malaysia","Singapore","Maldives","a", "b"))
      println(evenIndices)
    val findHeights = heights(listOf(150.6, 168.5, 123.6, 190.5))
    println(findHeights)




}
//Given a list of 10 strings, write a function that returns a list of the strings
//at even indices, index 2,4,6 etc
fun numbers(numbs: List<String>): List<String> {
   var number = mutableListOf<String>()
    for (x in numbs.indices step 2){
        number.add(numbs[x])
    }
    return number
}
//Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height
fun heights(height: List<Double>): Pair<Double, Double>{
    var totalHeight = height.sum()
    var averageHeight = totalHeight / height.size

    return Pair(averageHeight, totalHeight)

}
//Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age

data class Person(var name: String, var age: Int, var height: Double, var weight: Double){

    var peopleIdentity =
        listOf(
            Person("Joseph", 27, 168.5, 70.5) ,
            Person("Simon",32,158.5,56.7),
            Person("Andrew",23,170.5,80.5) )
    var findings = peopleIdentity.sortedByDescending { person -> person.age }



   fun adding(){
       var peoples =  Person("Jessie",34,145.7,80.5)
       var peoples2 = Person("Jane",34,156.5,45.9)
       var people3 = listOf(peoples,peoples2)


    }


//Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.
class Car(var registration: String, var mileage: Int)
 fun average(): Double{
    var vehicle =
        listOf(
            Car("KDD 450S", 4000),
            Car("KBA 219E", 5000),
            Car("KAA 540R", 12000)
        )
     var vehicles = listOf(4000,5000,12000)
     return vehicles.average()
 }
     }
