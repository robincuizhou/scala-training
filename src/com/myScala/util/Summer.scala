package com.myScala.util

import ChecksumAccumulator.calculate
 
object Summer {
 
    def main(args: Array[String]) {
//        for (arg <- args)
//            println(arg + " -> " + calculate(arg))
      
       var s = "aa";
       for(c <- s)
         println(c)
    }
 
}