str1 = input('enter a string: ')
str2 = input('enter another string: ')
for i in str2:
  if i in str1:
    print(str2, 'is a subset of', str1)
    break
  else:
    print(str2, 'is not a subset of', str1)
    break
