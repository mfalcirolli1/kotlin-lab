package Classes

class Dog constructor(

   private val race: String
)

{
   var name: String? = null
   var owner: Human? = null

   val country: String get () {
      return "Brasil".uppercase()
   }

   fun sayHi1()
   {
      println("Hi, my name is $name, i'm a $race and my owner is ${owner?.name}")
   }

   fun sayHi2(ownerName: String)
   {
      println("Hi, my name is $name, i'm a $race and my owner is $ownerName")
   }
}