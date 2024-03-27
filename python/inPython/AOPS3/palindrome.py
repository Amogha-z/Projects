def func(str):
  if str[::-1] == str:
    print('the string is a palindrome')
  else:
    print('not a palindrome')


str = input('enter a string: ')
func(str)
