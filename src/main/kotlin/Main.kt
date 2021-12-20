fun main (){


//  Q1: Create a map with 4 elelments with add , edit and remove :

  var cites = mutableMapOf<String,String>("city1" to "RIYADH" , "city2" to " JEDDAH" ,
      "city3" to "DAMMAM" , "city4" to "TABUK")

   println(cites)

//  Add :
    cites.put("city5" , "ABHA ")
   println(cites)

//  Romve :
    cites.remove("city1")
    println(cites)

//  Edit
    cites["city2"] = "Makkah"
    println(cites)

//  Q2:  Create a map of 3 elemnts and create 3 elements of list add the list to the map :

   
    val numbers = mutableMapOf<Int , String>( 1 to "one" , 2 to " two" , 3 to "three")

     numbers.putAll(listOf(4 to "Four" , 5 to "five" , 6 to "six"))
     println(numbers)

}