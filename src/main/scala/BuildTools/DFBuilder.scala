package BuildTools

object DFBuilder{
  class DFBuilder(){

    // Make DataFrames Out Of Files

    val spark = ProgramContext.sparkContext

    // Replace path name to relative path in res folder
    val c19data = spark.read.option("header", "true").csv("/user/georgefk/Data_setP2/covid_19_data.csv")
    val c19_C_all = spark.read.option("header", "true").csv("/user/georgefk/Data_setP2/time_series_covid_19_confirmed.csv")
    val c19_C_usa = spark.read.option("header", "true").csv("/user/georgefk/Data_setP2/time_series_covid_19_confirmed_US.csv")
    val c19_D_all = spark.read.option("header", "true").csv("/user/georgefk/Data_setP2/time_series_covid_19_deaths.csv")
    val c19_D_usa = spark.read.option("header", "true").csv("/user/georgefk/Data_setP2/time_series_covid_19_deaths_US.csv")
    val c19_R = spark.read.option("header", "true").csv("/user/georgefk/Data_setP2/time_series_covid_19_recovered.csv")


  }
}