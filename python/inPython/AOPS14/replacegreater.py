original=[]
n=int(input('enter how many number: '))
for i in range(n):
    original.append(int(input('enter the numbers: ')))
modified = []
for i in range(len(original)):
    left = original[i - 1] if i - 1 >= 0 else float('-inf')  
    right = original[i + 1] if i + 1 < len(original) else float('-inf') 
    greatest = max(left, right, original[i])  
    modified.append(greatest)
print(modified)