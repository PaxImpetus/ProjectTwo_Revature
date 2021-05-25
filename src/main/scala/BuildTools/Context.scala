package BuildTools

import org.apache.spark.sql.SparkSession

object ProgramContext{
  val sparkContext = SparkSession.builder
    .master("local[*]")
    .appName("ProjectTwo")
    .getOrCreate()
}