package com.myScala.matchxxx

object MatchList extends App{

  
  val willWork = List(1, 3, 23, 90)
  val willNotWork = List(4, 18, 52)
  val oneElement = List(4) 
  val empty = List()
  
def processList(l: List[Any]): Unit = l match {
    case tail :: dd :: head =>{
      if(head.length > 1) printf("%s\n", tail) 
      
    }
//    processList(tail) 
    case Nil => println("")
    
  }
  
  for (l <- List(willWork, willNotWork, oneElement, empty)) { 
    print("List: ")
//    processList(l) 
  }
  
}