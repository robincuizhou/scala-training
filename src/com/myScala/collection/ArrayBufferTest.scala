package com.myScala.collection

object ArrayBufferTest {

  def main(args : Array[String]){
    
    // val buffer = ArrayBuffer[T]()
    val a =  scala.collection.mutable.ArrayBuffer[Int]();
    
    a += 1
    println(a)
    a += 2
    println(a)
    a += (3,4,5)
    println(a)
    // 不能a += Array(xxx)
    /*
     * scala> a += Array(1,2)
<console>:13: error: type mismatch;
 found   : Array[Int]
 required: Int
              a += Array(1,2)
                        ^
     */
    a ++= Array(1,2,3)
    println(a)
    //a.insert(0, (0,1)) 这也写错 不符合API
    a.insert(0, 0)
    println(a) // ArrayBuffer(0, 1, 2, 3, 4, 5, 1, 2, 3)
    a.remove(2) //remove 第2个下标位
    //a.remove(2,3) remove 第二个下标位元素后3位
    println(a)
//    a.toArray// 变长变定长
    println(a)
    
    a.sum // 不能a.sum() sum 是Array的一个属性
    println(a)
    
    a.min
    a.max
    a.trimEnd(2) //去除数组最后2个元素
  }
  
}