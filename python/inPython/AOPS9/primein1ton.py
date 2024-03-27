#6). Given an input n, find out how many prime numbers are there between 1 and n. Print all of them.

n = int(input('enter a number: '))
lst = []
for i in range(2, n):
  if (i % 2 != 0 and i % 3 != 0 and i % 5 != 0
            and i % 7 != 0 and i%11 !=0 and i%13 !=0 and i%17 !=0 and i %19 !=0) or (i == 2 or i == 3 or i == 5 or i == 7 or i ==11 or i==13 or i==17 or i==19):
    lst.append(i)
print(lst)

n = int(input("Enter the number:"))
list = []
for i in range(2, n):
  val = False
  for j in range(2, i):
    if i % j == 0:
      val = True
      break
  if val == False:
    list.append(i)
print("The prime numbers below", n, "are", *list)