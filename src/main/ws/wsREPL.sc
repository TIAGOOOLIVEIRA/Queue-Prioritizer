import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

val fut21 = Future {21 + 21}
val fut23 = Future {0}
val futureNums = List(fut21, fut23)

val reduced =
  Future.reduceLeft(futureNums) { (acc, num) =>
    acc / num}

val failure = Future

reduced.value

//val pq = java.util.concurrent.PriorityBlockingQueue

//once mutable is not thread safe scala.collection.mutable.PriorityQueue
//Competing consumer with Hand-off pattern

//https://github.com/concurrent-programming-in-scala/learning-examples

//https://github.com/joshcough/scala-parallel/blob/master/jsr166/src/main/java/util/concurrent/PriorityBlockingQueue.java


//https://purelyfunctional.tv/guide/clojure-concurrency/