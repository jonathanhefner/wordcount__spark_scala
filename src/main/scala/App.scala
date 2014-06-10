import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf
import org.apache.spark.rdd.RDD

object App {
  def main(args: Array[String]) {
    val conf = new SparkConf().setAppName("Word Count")
    val sc = new SparkContext(conf)
    val lines = sc.textFile("data/*").filter(_.length > 0)
    val words = lines.flatMap(_.split(" "))
    
    stats(lines, "Lines")
    println()
    stats(words, "Words")
  }
  
  def stats(data: RDD[String], label: String) {
    val lengths = data.map(_.length)
    
    println(f"${label}: ${data.count}")
    println(f"  min length: ${lengths.min}")
    println(f"  mean length: ${lengths.mean}%.2f")
    println(f"  max length: ${lengths.max}")
  }
}
