import scala.io.StdIn._

object ModuleResults {
  
  def getResults(a: Int, b: Int): String = {
    
    println ("overall mark eqauls"(a+b)/2)
    if ((a+b)/2 >= 40) "Passed"
    else if ((a+b)/2 < 40 && b < 40 && a > 40) "Resit Coursework"
    else if ((a+b)/2 < 40 && a < 40 && b > 40) "Resit Exam"
    else if ((a+b)/2 < 40) "Resit Module"
    else "Invalid inputs"
  }
  def main(args: Array[String]): Unit = {
//   for(a <- 39 to 39; b <- 39 to 39)
//     println(s"Resluts are in, ${getResults(a,b)}")
   print(Int.MinValue+1)
  }
}