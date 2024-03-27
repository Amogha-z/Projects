#2.Write a program to print the factorial of a given input number.
n = int(input('Enter a number: '))
x = 1
for i in range(1, n + 1):
  x *= i
print(x)