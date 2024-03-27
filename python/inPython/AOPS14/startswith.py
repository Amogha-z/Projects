lst=[]
n=int(input('enter the number of words to be added in the list: '))
for i in range(n):
    lst.append(input('enter words: '))
inp=input('enter a letter: ')
for i in lst:
    if i.startswith(inp):
        print(i)
