def fun(str):
  print(str[0].upper() + str[1:-1] + str[-1].upper())


str = input('enter a string: ')
fun(str)