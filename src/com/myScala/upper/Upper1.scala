package com.myScala.upper

class Upper1 {

  //strings: String* String（字符串）类型的可变长度参数列表 strings 实际上是一个Array（数组）
  def upper(strings: String*): Seq[String] = {
    strings.map((s:String) => s.toUpperCase()) 
  }
  
 
  
}