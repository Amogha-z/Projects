def rem(str, ind):
  print(str[:ind] + str[ind + 1:len(str) - 1])


str = 'hiiii am mahaaa'
ind = int(input('enter the index'))
rem(str, ind)
