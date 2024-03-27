lst=[]
n=int(input('how many numbers do you want to input: '))
for i in range(n):
    inp=int(input('enter the num: '))
    lst.append(inp)
num=int(input('what is that number that you want to make sure it exists: '))
for i in range(len(lst)):
    if num==lst[i]:
        print('the number exists in',lst.index(num),'index')
        break