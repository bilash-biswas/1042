a,b,c = input().split()
a = int(a)
b = int(b)
c = int(c)
if a > b and a > c :
    if b > c :
        print(c)
        print(b)
        print(a)
    else:
        print(b)
        print(c)
        print(a)
elif b > c and b > a :
    if a > c:
        print(c)
        print(a)
        print(b)
    else:
        print(a)
        print(c)
        print(b)
else:
    if a > b:
        print(b)
        print(a)
        print(c)
    else:
        print(a)
        print(b)
        print(c)
print()
print(a)
print(b)
print(c)
