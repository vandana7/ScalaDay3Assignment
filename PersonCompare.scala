// Question No-1


// class implimentiong ordered trait
class Person(val name:String,val age:Int) extends Ordered[Person]
{
  
// function for comparing name of the person
 def compare(that: Person): Int=
 {
    if(this.name==that.name)
    {
      print("Inside age	")
      println(this.age)
      println(that.age)
     
      this.age-that.age
         
    }
    else
    this.name.length-that.name.length
 } 
}
object PersonCompare
{
  def main(args: Array[String]) = {
   var person1=new Person("this",14)
   var person2=new Person("this",34)
   print(person1<person2)

}  
}


 
