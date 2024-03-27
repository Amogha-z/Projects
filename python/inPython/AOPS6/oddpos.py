n=int(input('enter a number: '))
count=0
for i in range(n):
  if i>0 and i%2!=0:
    count+=1
print('the number of odd positive numbers before',n,'is',count)