#3). Write a program that takes in 3 decimal numbers as input.
# Converts all three of them to binary and adds them, as if they are decimal and then, converts the result back to binary and prints the result.
#Example: Input: 8, 9, 10 -> output: 101111000011. (Explanation: 8's binary value is 1000, 9's binary value is 1001, 10's binary value is 1010. Add all three, as if they are decimals 1000+1001+1010 = 3011. Now, convert 3011 to binary. You get the desired output).

a = int(input('enter number 1: '))
b = int(input('enter number 2: '))
c = int(input('enter number 3: '))
a = int(bin(a)[2:])
b = int(bin(b)[2:])
c = int(bin(c)[2:])
sum = a + b + c
print(bin(sum)[2:])