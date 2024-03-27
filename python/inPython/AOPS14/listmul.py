lst=[]
n=int(input('how many numbers do you want to multiply: '))
for i in range(n):
    inp=int(input('enter the num: '))
    lst.append(inp)
output=1
for i in lst:
    output*=i
print(f"output after multiplication is: {output}")
