//Question No-2

class FirstName(val fname: String) extends AnyVal    // class for firstName 
class LastName(val lname: String) extends AnyVal     // class for LastName
class Age(val agevalue: Int) extends AnyVal          //  class for age




class Person{


// function definition for display details
def display(fname :FirstName,lname:LastName,agevalue:Age):String = ""+fname.fname+" "+lname.lname+" is of "+agevalue.agevalue+" years"
}
object DisplayInfo
{
  def main(args: Array[String]) = {
    val person1 = new Person()     //object creation
    val output = person1.display(new FirstName("Prashant"),new LastName("Goel"),new Age(24))
    print(output)

 }
}

