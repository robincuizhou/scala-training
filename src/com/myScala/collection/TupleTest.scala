package com.myScala.collection


//元组
//()里包含一些列的值
//通过._取值, 下标从1开始列入t._1 数组 0开始 元组 1开始
//迭代 for(elem <=- t.productIterator)

/*
 * 元组（Tuple）
元组是不同类型的值的聚集。
val t = (1, 3.14, "Fred")  // 类型为Tuple3[Int, Double, java.lang.String]
 */
object TupleTest {

  def main(args:Array[String]){
    
    //赋值
    val tuple =	(1, 2, 'c', "aa")
    println(tuple)
    //访问
    println(tuple._1)
    //模式匹配
    val (a,b,c,d) = tuple;
    println(d)
    //元组可用于函数返回多个值的匹配
    def testTuple():(String, String) = {
      ("rr","asdf")
    }
    
    println(testTuple()) // (0,asdf) 打印结果, 我很想打印出不带()的, 这需要先转换成 数组 暂时不知道怎么办 要留意下
    
    
  }
  
}