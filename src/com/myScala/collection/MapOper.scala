package com.myScala.collection

object MapOper {

  def main(arg:Array[String]){
    
    val m = Map("Jack" ->11,"BB" -> 22, "Jack" -> 18) //一个Map会过滤掉最后一个重复的key
    for((k,_) <- m){
      println(k ) //_ 直接用 不输出
    }
    
    for(v <- m.values){
      printf("values is %s\n", v)
    }
    
    for(k <- m.keys){ //m.keySet
      printf("key is %s\n", k)
    }
  }
  
}