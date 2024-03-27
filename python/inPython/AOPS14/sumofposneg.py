lst=[]
pos=[]
neg=[]
sump=0
sumn=0
n=int(input('how many numbers do you want in the list: '))
for i in range(n):
    inp=int(input('enter the num: '))
    lst.append(inp)
for i in range(len(lst)):
    if lst[i]>0:
        pos.append(lst[i])
    elif lst[i]<0:
        neg.append(lst[i])
for i in pos:
    sump=sump+i
for i in neg:
    sumn=sumn+i
print(f"sum of the positive numbers is {sump} and sum of the negative numbers is {sumn}")
