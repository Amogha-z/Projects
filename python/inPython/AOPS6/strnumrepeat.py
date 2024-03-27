strnum=input('enter a string: ')
for i in range(0,len(strnum),2):
  print(strnum[i]*int(strnum[i+1]),end='')
print()