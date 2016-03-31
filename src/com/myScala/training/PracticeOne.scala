package com.myScala.training

/*
 * created by robincui 2016-3-31
 */

object PracticeOne extends App{

    //one
//    def signum(a:Int) :Int = if (a > 0) 1 else if (a < 0) -1 else 0 
    
    //two
//    for(i <- Range(10,-1,-1))println(i)
  
    //three
    def countdown(n : Int)  {
      assert(n>1,"n must larger than 1")
      for(i <- 0 to n )
        println(i)
      0
    }
    
//    countdown(0)
    
    //four
   def swap(array : Array[Int]) = {
    for (idx <- 0 until (if (array.length % 2 == 0) array.length else array.length - 1, 2)) {
      val tmp = array(idx)
      array(idx) = array(idx + 1)
      array(idx + 1) = tmp
    }
    array
   }
   
   //five
   def wordcount(content : String) : Map[String, Int]= {
      
      val counts = scala.collection.mutable.Map[String, Int]()
      for(word <- content.split(' ')){
        if (counts.contains(word))
          counts(word) = counts(word) + 1
        else
          counts += (word -> 1)
       } 
       counts.toMap
       
       
   }
    
    
}