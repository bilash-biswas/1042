import java.util.Scanner

fun main(args: Array<String>){
    val read = Scanner(System.`in`);
    var a = read.nextInt()
    var b = read.nextInt()
    var c = read.nextInt()
    if(a > b && a > c)
    {
        if(b > c)
        {
            println(c);
            println(b);
            println(a);
        }
        else
        {
            println(b);
            println(c);
            println(a);
        }
    }
    else if(b > c && b > a)
    {
        if(a > c)
        {
            println(c);
            println(a);
            println(b);
        }
        else
        {
            println(a);
            println(c);
            println(b);
        }
    }
    else
    {
        if(a > b)
        {
            println(b);
            println(a);
            println(c);
        }
        else
        {
            println(a);
            println(b);
            println(c);
        }
    }
    println();
    println(a);
    println(b);
    println(c);
}

    
