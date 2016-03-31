package com.myScala.collection


/*
 List:
 list 由 Nil 或者 head + tail 构成, 其中tail 又是一个List
 new-value :: list
 构建: List(1,2,3) 或者 1 :: 2 :: 3 :: Nil
 基于List 的模式匹配
 利用迭代或者地柜来处理List
 
 */

object ListUtil {

  object StringUtil{
  
    def joiner(strings: List[String], separator: String): String = strings.mkString(separator)
    
    def joiner(strings: List[String]): String = joiner(strings, ", ")
    
  }
  
  
  def main(args : Array[String]){

    println( StringUtil.joiner(List("Programming", "Scala")) )
    
    var list = List(1,2,3,4,5)
    list.map(2 * _).foreach { println } //
    
    val l1 = 1 :: 2 :: 3:: Nil
    val l2 = 2 :: l1
//  val l3 = l1 :: 2  wrong mode
    
    
    
    
  }
  
}