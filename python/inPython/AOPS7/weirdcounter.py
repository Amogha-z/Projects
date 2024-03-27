#3). There is a strange Counter that works this way. 
#Initially, for the first second, it starts with 3 and keeps decrementing for every second by 1 until it reaches 1.
# Once it reaches 1, it doubles its value to the prior starting value and keeps decrementing for every second.

val = int(input("Enter the time : "))
time = 3
for i in range(1,val+1):
  if time==1 and i<val:
    time=i+3
    continue
  time-=1
print(time+1)