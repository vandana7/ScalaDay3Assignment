// Question No-3


//package for generic queue
package AbstractQueue{
trait Queue {
 def enqueue(datalist:List[Int],data:Int):List[Int]

// function definition for list traversing
 def traverse(datalist:List[Int]) =
 {
   print("List :")
   print(datalist)
 }

// function definition for deleting an element from list
 def dequeue(datalist:List[Int]):List[Int] =
 {
   if(datalist.length == 0)
     print("List Empty Dequeue Fail")
   else
     print(s"${datalist(datalist.length-1)} is deleted")
    val datalist1 = datalist.init
    datalist1
 }
}
}

// package for dequeue
package Dqueue
{
	class DoubleQueue extends AbstractQueue.Queue
	{
	    // function definition  for appending an element of type(no*2)
	    def enqueue(datalist:List[Int],data:Int):List[Int] =
	 {
	  
	    val datalist1 = data*2::datalist
	    print(s"${data*2} added to list")
	    datalist1
	   
	 }
	}
}

// package for Squeue
package Squeue
{
	class SquareQueue extends AbstractQueue.Queue
	{
	     // function definition for appending an element of type(no*no)
	    def enqueue(datalist:List[Int],data:Int):List[Int] =
	 {
	     val datalist1 = data*data::datalist
	     print(s"${data*data} added to list")
	    datalist1
	   
	 }
	}
}
//singleton object
object ListWorking
{
  def main(args: Array[String]) = {
   var datalist = List[Int](1)
   val dqueueobj = new Dqueue.DoubleQueue()
   val squeueobj = new Squeue.SquareQueue()
   datalist = dqueueobj.enqueue(datalist,25)
   
   datalist = squeueobj.enqueue(datalist,5)
    dqueueobj.traverse(datalist)
   
   
   datalist = dqueueobj.dequeue(datalist)
    dqueueobj.traverse(datalist)
}  
}

