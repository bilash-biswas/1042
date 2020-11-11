object Main {
  def main(args:Array[String]){
    var Array(a,b,c) = scala.io.StdIn.readLine().split(" ").map(_.toInt)
    if(a > b && a > c)
    {
        if(b > c)
        {
            println(f"$c")
            println(f"$b")
            println(f"$a")
        }
        else
        {
            println(f"$b")
            println(f"$c")
            println(f"$a")
        }
    }
    else if(b > c && b > a)
    {
        if(a > c)
        {
            println(f"$c")
            println(f"$a")
            println(f"$b")
        }
        else
        {
            println(f"$a")
            println(f"$c")
            println(f"$b")
        }
    }
    else
    {
        if(a > b)
        {
            println(f"$b")
            println(f"$a")
            println(f"$c")
        }
        else
        {
            println(f"$a")
            println(f"$b")
            println(f"$c")
        }
    }
    println()
    println(f"$a")
    println(f"$b")
    println(f"$c")
  }
}
