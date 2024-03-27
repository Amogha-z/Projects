string = input("Enter a string: ")
nr = str()
for i in string:
  if string.count(i) % 2 != 0 and i not in nr:
    nr = nr + i
print(nr)