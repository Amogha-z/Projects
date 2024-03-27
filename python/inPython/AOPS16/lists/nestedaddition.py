num1=int(input("how many numbers in lst1: "))
num2=int(input("how many numbers in lst2: "))
lst1,lst2,lst3=[],[],[]
for i in range(num1):
    lst1.append(int(input("enter the numbers in 1st list: ")))
for i in range(num2):
    lst2.append(int(input("enter the numbers in 2nd list: ")))
if len(lst1) and len(lst2) > 0:
    for i in lst1:
        for j in lst2:
            lst3.append(i+j)
    print(lst3)