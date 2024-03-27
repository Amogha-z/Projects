lst=[]
n=int(input('how many numbers do you want in the list: '))
for i in range(n):
    inp=int(input('enter the num: '))
    lst.append(inp)
inp=int(input('enter a number which is available in the list: '))
lst=sorted(set(lst))
lst=list(lst)
if inp in lst:
    lowlist=lst[:lst.index(inp)]
    highlist=lst[lst.index(inp)+1:]
    print(f"the input is {inp},numbers less than that are {lowlist}, numbers greater than that is {highlist}")
else:
    print('enter a number that exists in the list')