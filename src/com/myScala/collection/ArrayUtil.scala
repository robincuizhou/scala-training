package com.myScala.collection

object ArrayUtil {
   
   def main(args : Array[String]){
     
      //immutable Array
      val a = new Array[String](5);
      val b = new Array[Int](5)    // 可以用new
      val c = Array("Jack","luck") // 可以直接用括号
     
      println(a.mkString("|"))
      println(c.mkString(","))
      // 通过（）访问 而不是[]
      println(c(0))
      
      //变长数组
      import scala.collection.mutable.ArrayBuffer
      val d = scala.collection.mutable.ArrayBuffer[Int]()
      d += 1
      d += 2
      /*
       d.type = ArrayBuffer(1,2)
               
       **/
      
//      val buffer = ArrayBuffer[T]()
      
   }
}