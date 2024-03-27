#2). Consider you have a String like this: oneTwoThree. The notation you see here is called "Camel Case".
# That is, the first word will start with a lowercase alphabet and the next words' starting letters will be given as Uppercase alphabets.
# (Note: There wont be a space to separate the words) Examples of some camelcase words: employeeCount, powerVariable, multiplicationFactor, reducedStringCount.


def wordc(str):
  word=1
  for i in range(0,len(str)):
    if str[i].isupper():
      word+=1
  print(word)
str=input('enter a string: ')
wordc(str)