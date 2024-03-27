#3.Write a program to print the fibonacci series upto a given input number.
a = 0
b = 1
c = 0
n = int(input('Enter a number: '))
while c <= n:
  print(c)
  a = b
  b = c
  c = a + b
