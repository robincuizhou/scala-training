package com.myScala

object SyntaxTest extends App{

  val a = "a" + "b"
  //val is immutable and can't be changed
  //you can use var
//      a = "j" + "k"
  println(a)
  for(i <- 1 until 20 if i%2==0)println(i)
  
  var g = 10.0
  println(g);
  
}




