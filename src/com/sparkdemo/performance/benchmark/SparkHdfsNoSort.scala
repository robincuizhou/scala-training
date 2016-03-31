package com.sparkdemo.performance.benchmark

import org.apache.spark._

object SparkHdfsNoSort {

    def main(args: Array[String]) {
      val conf = new SparkConf().setAppName("Spark Pi").setMaster("spark://cuizhou:7077").setSparkHome("/usr/local/spark")
      val spark = new SparkContext(conf)
      val file = spark.textFile("hdfs://cuizhou:9000/user/root/bank-full.csv");
      file.collect();
    }
  
}