# 8). Consider you have an input string like, "Hi, I am fine. How are you?".
#  Write a python program to find the longest word in this string.

a = input("Enter a string: ")
a = list(a)
b = ""
for i in a:
  if i.isalpha() or i == " ":
    b = b + i
b = b.split()
d = {}
for i in b:
  l = len(i)
  d[i] = l
maximum = max(d.values())
for key, value in d.items():
  if value == maximum:
    print("The longest word in this string is: ", key)
