package com.example.scala

/**
 * Created by Shunsuke on 2015/06/25.
 */
object Hello {

  def main(args: Array[String]): Unit = {
    if (args.size == 0){
      val strs = Array("Hello", "World")
      output(strs)
    } else {
      print("Invalid Args.")
    }
  }

  def output(strs: Array[String]): Unit = {
    strs.foreach(printf("%s", _))
  }
}
