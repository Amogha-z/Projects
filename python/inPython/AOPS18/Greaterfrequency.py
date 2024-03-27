#2). Consider you have a list of items. Write a program to extract all elements whose frequency is greater than K. Eg: if list=[1,2,1,3,1,4,2,3,4,3,4]. Extract all elements whose frequency is greater than 2.
def greaterFrequency(lst,k):
    lst2=[]
    for i in range(len(lst)):
        if lst.count(lst[i])>k and lst[i] not in lst2:
            lst2.append(lst[i])
    return lst2
print(greaterFrequency([1,2,1,3,1,4,2,3,4,3,4,4],2))