#4). Write a program to find out whether a given number is a perfect number or not (Perfect number is one, which is equal to the sum of its divisors.
#  Example: 6 is a perfect number. Because, 1, 2 and 3 are divisors of 6 and adding 1+2+3 = 6. )

a = int(input('enter a number: '))
lst = []
for i in range(1, a):
  if a % i == 0:
    lst.append(i)
if sum(lst) == a:
  print('it is a perfect number.')
else:
  print('it is not')