number=int(input("enter a number: "))
cont=0
while number>0:
    number//=10
    cont+=1
print(cont,"digits")