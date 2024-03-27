#1.Write a program that asks the user for a input number and prints the multiplication table of that number up to 10.
n = int(input('enter a number: '))
for i in range(1, 11):
  print(n, 'x', i, ' is', n * i)
