#1). Consider you have a list of items. Write a program for removing all the occurrences of a given item present in the list.
def remover(lst,v):
    lst2=[]
    for i in range(len(lst)):
        if lst[i]!=v:
            lst2.append(lst[i])
    return lst2
v=int(input("enter the number to be removed: "))
lst=[2,3,4,5,6,7,8,2,4,3,5,2,4,2,4,2,2]
print(remover(lst,v))