package com.myScala.test

class Test {

}

object Work{
  
  def main(args :  Array[String]){
    
    var list = List(1,2,3,4,5)
    list.map(2 * _).foreach { println }
    
  }
  
}