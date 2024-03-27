# 2)Write a program to find the GCD of a number?
#loop
def gcd(a,b):
    for i in range(1,min(a,b)+1):
        if(a%i==0 and b%i==0):
            v=i
    return v
print(gcd(200,100))

#recursion
def gcdREC(a, b):
    if b == 0:
        return a
    else:
        return gcdREC(b, a % b)
print(gcdREC(200,100))
