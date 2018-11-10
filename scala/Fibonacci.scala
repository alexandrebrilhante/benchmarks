object Fibonacci {
    def main(args: Array[String]): Unit = {
        val start = System.nanoTime()
        println(fibonacci(25))
        println(System.nanoTime() - start)
    }
    
    def fibonacci(n : Int) : Int = n match {
        case 0 | 1 => n
        case _ => fibonacci(n - 1) + fibonacci(n - 2)
    }
}
