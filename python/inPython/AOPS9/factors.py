#7). Write a program to find the factors of a given input number.

a = int(input('enter a number: '))
lst = []
for i in range(1, a + 1):
  if a % i == 0:
    lst.append(i)
print(lst)