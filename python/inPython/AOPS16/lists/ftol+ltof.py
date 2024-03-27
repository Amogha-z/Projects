num1=int(input("how many numbers in lst1: "))
num2=int(input("how many numbers in lst2: "))
lst1,lst2,lst3=[],[],[]
for i in range(num1):
    lst1.append(int(input("enter the numbers in 1st list: ")))
for i in range(num2):
    lst2.append(int(input("enter the numbers in 2nd list: ")))
if len(lst1) and len(lst2) > 0:
    maxlength=max(len(lst1),len(lst2))
    lst1.extend([0]*(maxlength-len(lst1)))
    lst2.extend([0]*(maxlength-len(lst2)))
    for i in range(maxlength):
        lst3.append(lst1[i]+lst2[-(i+1)])
    print(lst3)
else:
    print("Error: At least one of the lists is empty.")
