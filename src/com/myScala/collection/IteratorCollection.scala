package com.myScala.collection

object IteratorCollection {

  
  def main(args:Array[String]){
    
      //数组遍历 事实上会更多的实用map filter 来操作
      val a = Array(1,2,3,4,5,6,7,8)
      for(i <- 0 until a.length+1){ // (0 until a.length)  这个本身就是一个数组
        println(i)
      }
        
      println("========================================")
     
      for(i <- (0 until a.length+1).reverse){
        println(i)
      }
      
      println("========================================")
      for(i <- a){
        println(i)
      }
      
  }
  
}