# 3)Write a program to convert Decimal to binary, Octal and Hexadecimal?
#loop
#decimal to binary
def DtoB(num):
    strr=""
    while num>0:
        strr+=str(num%2)
        num=num//2
    return strr[::-1]
print(DtoB(22))
#decimal to octal
def DtoO(num):
    strr=""
    while num>0:
        strr+=str(num%8)
        num=num//8
    return strr[::-1]
print(DtoO(22))
#decimal to hexadecimal
def DtoH(num):
    strr = ""
    while num > 0:
        remainder = num % 16
        if remainder < 10:
            strr += str(remainder)
        else:
            strr += chr(ord('A') + (remainder - 10))
        num = num // 16
    return strr[::-1]
print(DtoH(25))

#recursion
def DtoBrec(num):
    strr=""
    if num<=0:
        return strr
    elif num>0:
        strr+=str(num%2)
        return DtoBrec(num//2)+strr
    else:
        return "0"

def DtoOrec(num):
    strr=""
    if num<=0:
        return strr
    elif num>0:
        strr+=str(num%8)
        return DtoOrec(num//8)+strr
    else:
        return "0"

def DtoHrec(num):
    if num==0:
        return ""
    reminder=num%16
    if reminder<10:
        return DtoHrec(num//16)+str(reminder)
    else:
        return DtoHrec(num//16)+chr(ord('A')+(reminder-10)) 
print(DtoHrec(55))