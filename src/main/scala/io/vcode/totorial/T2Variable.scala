package main.scala

object T2Variable {

    def main(args: Array[String]) {
        println("\n++++++++++++++++++++++++++++++++")
        println("Mutable and Immutable Variables")
        println("++++++++++++++++++++++++++++++++")
        var myVar: String = "Mutable Variable"
        val myVal: String = "Immutable Variable"
        myVar += " Changed"
        // myVal += " Changed" is not valid
        println(myVar)
        println(myVal)

        println("\n++++++++++++++++++++++++++++++++")
        println("Multiple assignments")
        println("++++++++++++++++++++++++++++++++")
        var (myVar1: Int, myVar2: String) = Pair(1, "myVar2")
        val (myVal1: Int, myVal2: String, myVal3) = (40, "myVal2", "myVal3")

        println(myVar1)
        println(myVar2)
        println(myVal1)
        println(myVal2)
        println(myVal3)

    }
}
