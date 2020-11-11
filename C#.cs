using System.IO;
using System;

class Program
{
    static void Main()
    {
        double a,b,c;
        var p = Console.ReadLine().Split();
        a = double.Parse(p[0]);
        b = double.Parse(p[1]);
        c = double.Parse(p[2]);
    if(a > b && a > c)
    {
        if(b > c)
        {
            Console.WriteLine(c);
            Console.WriteLine(b);
            Console.WriteLine(a);
        }
        else
        {
            Console.WriteLine(b);
            Console.WriteLine(c);
            Console.WriteLine(a);
        }
    }
    else if(b > c && b > a)
    {
        if(a > c)
        {
            Console.WriteLine(c);
            Console.WriteLine(a);
            Console.WriteLine(b);
        }
        else
        {
            Console.WriteLine(a);
            Console.WriteLine(c);
            Console.WriteLine(b);
        }
    }
    else
    {
        if(a > b)
        {
            Console.WriteLine(b);
            Console.WriteLine(a);
            Console.WriteLine(c);
        }
        else
        {
            Console.WriteLine(a);
            Console.WriteLine(b);
            Console.WriteLine(c);
        }
    }
    Console.WriteLine("\n" + a);
    Console.WriteLine(b);
    Console.WriteLine(c);
  }
}
