#4.Write a program to check if a given input number is prime or not.
num = int(input("Enter a Number:"))
f = 0
for i in range(2, num):
  if (num % i == 0):
    f += 1
    break
if (f == 0):
  print("The given number is prime")
else:
  print("The given number is not a prime")