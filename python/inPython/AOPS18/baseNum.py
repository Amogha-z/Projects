# 6). Write a function which when given a non-negative integer n and an arbitrary base b, returns the number reversed in that base.
def numToBase(num,base):
    if num==0:
        return 0
    rev=0
    if base==1:
        return num
    while num>0:
        rem=num%base
        rev=rev*base+rem
        num//=base
    return rev
print(numToBase(12,2))
