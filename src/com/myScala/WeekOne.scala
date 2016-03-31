package com.myScala

object WeekOne {

  def add(x : Int, y : Int) : Int = {
     (x*2)+y
  }
  
  
  def add() = {
    println("say hello")
  }
  
  
  
  def main(args :  Array[String]){
    add()
    println(add(1,2)) //4
    println(add(y=1,x=2)) //5
    println((1 to 10))
    var a = if(1>2) 0 else 1
    println(a);
    
    
    /**
     
     try{
     }
     catch{
      case e:Exception => System.err.println(e) // should use log in production
      case _ => //should never happen 以上都不是 应该怎么样, 在这里应该不会出现 因为Exception已经包含了所有的 
     }
     finally{
       this.close(pool, redis)
     }
     
     */
  }
}