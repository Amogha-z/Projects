def func(str):
  lst = str.split(' ')
  print(*lst[::-1])


str = input('enter a string: ')
func(str)