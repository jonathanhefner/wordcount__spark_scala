# Wordcount

The ["Hello World"][hello] of [MapReduce][mr], implemented in Scala 
using [Apache Spark][spark].

  [hello]: http://en.wikipedia.org/wiki/Hello_world_program
  [mr]: http://en.wikipedia.org/wiki/MapReduce
  [spark]: http://spark.apache.org/


## Prerequisites

* Install Scala 2.10:

  ```bash
  wget http://www.scala-lang.org/files/archive/scala-2.10.4.deb
  sudo dpkg -i scala-2.10.4.deb
  ```

* [Install sbt][sbt-dl] (tested with v0.13.5):

  ```bash
  wget http://dl.bintray.com/sbt/debian/sbt-0.13.5.deb
  sudo dpkg -i sbt-0.13.5.deb
  ```

* [Install Spark 1.0][spark-dl]:

  ```bash
  wget http://d3kbcqa49mib13.cloudfront.net/spark-1.0.0-bin-hadoop2.tgz
  tar -xzf spark-1.0.0-bin-hadoop2.tgz
  cd spark-1.0.0-bin-hadoop2
  export SPARK_HOME=$(pwd)
  export PATH="$PATH $SPARK_HOME/bin"
  ```

[sbt-dl]: http://www.scala-sbt.org/0.13/tutorial/Installing-sbt-on-Linux.html
[spark-dl]: http://spark.apache.org/downloads.html


## Usage

```bash
cd /path/to/project

sbt package

spark-submit --class "App" target/app-1.0.jar
```
