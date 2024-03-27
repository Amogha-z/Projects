#5.Write a program that gets a string as input and counts the number of vowels in that string.
str = input('enter a string: ')
count = 0
vow = 'AaEeIiOoUu'
for i in str:
  if i in vow:
    count = count + 1
print(count)