import org.apache.spark._
import org.apache.spark.SparkContext._


// arguments
val input_file_name = "/Users/sampathm/udemy/data/genome-scores.csv"
val outputFile = "/tmp/genome.out"

// Spark Context
val conf = new SparkConf().setAppName("wordCount").setMaster("local[*]")
// Create a Scala Spark Context.
val sc: SparkContext = new SparkContext(conf)
// Load our input data.
val input =  sc.textFile(input_file_name)
// Split up into words.
val words = input.flatMap(line => line.split(","))
// Transform into word and count.
val counts = words.map(word => (word, 1)).reduceByKey{case (x, y) => x + y}
// Save the word count back out to a text file, causing evaluation.
counts.saveAsTextFile(outputFile)



Thread.sleep(10000)



