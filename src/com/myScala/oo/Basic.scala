package com.myScala.oo


/*
 * 1. 声明类 (一个原文件中可以包含多个类, 并默认public) #号称是 source code名字 要和public 类名字一致 不然会报错不过我这里没体现
 * 2.
 */
class Basic {

}

//class Person(name:String,age : Int,gender2:String){
//  
//  var name : String = _ // in scala _ means a place holder, name variable should be assigned a type, otherwise there will be error
//                        // use "var" will generate getter and setter method
//                        // use "val" will just generate getter method
//  var age = 10
// 
//  private[this]  var gender = "male" // private[this] indecate gender usage scope is inside the class Person, 
//  
//}


// 要写var
class Person(var name : String, val age : Int){
  
  println("this is primary constructor!")
  var gender:String = _
  
  def this(name:String,age : Int,gender : String){
    this(name,age)
    this.gender = gender
  }

  
}


// 子类 构造函数可以不带var
class Student(name : String, age : Int, val major : String) extends Person(name, age){
   println("this is subclass of Person, major is: " + major)
}

// empty construct
class A{
  var name : String = _
  def this(name: String){
    this
    this.name = name
    println("A, name is " + name)
  }
}

object Worker{
  
  def main(args:Array[String]){
    
    val p = new Person(null,1,null) // if the structure has not parameter, "()" is able to disappear
    p.name = "Robin"
    println(p.name + "," + p.age) // + p.gender) get error
    
    var s = new Student("jenny", 20,"math")
    val a = new A("robin");
    
  }
  
}
