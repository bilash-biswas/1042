a,b,c = gets().chomp().split(' ');
a = a.to_i
b = b.to_i
c = c.to_i
if a > b && a > c
    if b > c
        printf("%d\n", c);
        printf("%d\n", b);
        printf("%d\n", a);
    else
        printf("%d\n", b);
        printf("%d\n", c);
        printf("%d\n", a);
    end
elsif b>c && b>a
    if a>c
        printf("%d\n",c);
        printf("%d\n",a);
        printf("%d\n",b);
    else
        printf("%d\n", a);
        printf("%d\n", c);
        printf("%d\n", b);
    end
else
    if(a > b)
        printf("%d\n", b);
        printf("%d\n", a);
        printf("%d\n", c);
    else
        printf("%d\n", a);
        printf("%d\n", b);
        printf("%d\n", c);
    end
end
printf("\n%d\n", a);
printf("%d\n", b);
printf("%d\n", c);
