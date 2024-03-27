#9). Consider, you have an input string like, "ABJ8765GHK&456". 
# Write a python program to extract the numbers alone from this string.

string = input('enter a string: ')
num = []
for i in string:
  if i.isdigit():
    num.append(i)
print(num)
