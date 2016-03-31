 package com.myScala.collection

object MapUtil {

  def main(args : Array[String]){
    
    //a: scala.collection.immutable.Map[String,Int] = Map(Jack -> 0, Marry -> 20)
    val a = Map("Jack" -> 0, "Marry" -> 20)
    println(a)
    
    val b = scala.collection.mutable.Map("Jack" -> 0, "Marry" -> 20)
    
//    print(a("aaa")) 这个会抛出NoSuchElementException
    println(a.get("aaa")) //这个就不会抛出异常 会直接返回None
    println(a.getOrElse("aaa", "00"))
    println(a("Jack"))
    
    b += ("josh" -> 123)
    println(b)
    
    b -= ("asdfasdf") //不存在这个key也不会报错
    
    b -= ("Jack")
    println(b)
    
  }
   
}