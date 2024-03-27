# 5)Write a program to find the sum of digits of a number.
def sumOfDigits(num):
    summ=0
    while num>0:
        summ+=num%10
        num=num//10
    return summ
print(sumOfDigits(4567))

#recursion
def sumOfDigitsREC(num):
    if num<10:
        return num
    else:
        summ=num%10
        summ+=sumOfDigitsREC(num//10)
        return summ
print(sumOfDigitsREC(4567))
