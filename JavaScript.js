var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');
input = input.replace('\n',' ');
var lines = input.split(' ');
var a = parseInt(lines.shift());
var b = parseInt(lines.shift()); 
var c = parseInt(lines.shift()); 

    if(a > b && a > c)
    {
        if(b > c)
        {
            console.log(c);
            console.log(b);
            console.log(a);
        }
        else
        {
            console.log(b);
            console.log(c);
            console.log(a);
        }
    }
    else if(b > c && b > a)
    {
        if(a > c)
        {
            console.log(c);
            console.log(a);
            console.log(b);
        }
        else
        {
            console.log(a);
            console.log(c);
            console.log(b);
        }
    }
    else
    {
        if(a > b)
        {
            console.log(b);
            console.log(a);
            console.log(c);
        }
        else
        {
            console.log(a);
            console.log(b);
            console.log(c);
        }
    }
    console.log("\n" + a);
    console.log(b);
    console.log(c);
