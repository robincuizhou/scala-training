package com.aas.spark.monitor

import scala.io.Source
import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._

object SparkZabbixMock {

  def main(args: Array[String]) {
    
    val conf = new SparkConf().setAppName("SparkZabbixMock")
                              .setMaster("local[4]")
    
  }
  
}