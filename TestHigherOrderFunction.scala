//Question no-4

object TestHigherOrderFunction {
def sumOfSquare(first:Int,second:Int):Int = first*first+second*second  //calculate sum of square
def sumOfInt(first:Int,second:Int):Int = first+second   //calculate sum of int
def sumOfCube(first:Int,second:Int):Int = first*first*first+second*second*second  // calculate sum of cube
def sum(f:(Int,Int) => Int,input1:Int,input2:Int):Int = f(input1,input2)


def main(args: Array[String]) = {
  
 // calculation of sum of any function
  val output = sum(sumOfSquare, 5 , 4)
  println(s"$output");
  
}
}
