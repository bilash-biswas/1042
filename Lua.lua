a = io.read("*n")
b = io.read("*n")
c = io.read("*n")
if(a > b and a > c) then
    if(b > c) then
        print(c)
        print(b)
        print(a)
    else
        print(b)
        print(c)
        print(a)
    end
elseif(b > c and b > a)then
    if(a > c)then
        print(c)
        print(a)
        print(b)
    else
        print(a)
        print(c)
        print(b)
    end
else
    if(a > b)then
        print(b)
        print(a)
        print(c)
    else
        print(a)
        print(b)
        print(c)
    end
end
print()
print(a)
print(b)
print(c)
