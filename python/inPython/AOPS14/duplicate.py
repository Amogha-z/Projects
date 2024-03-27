lst=[]
new_list=[]
n=int(input('how many numbers do you want to input: '))
for i in range(n):
    inp=int(input('enter the num: '))
    lst.append(inp)
for i in sorted(lst):
    if i not in new_list:
        new_list.append(i)
print(new_list)