# 4). Consider you have a list of items. Check whether three elements appear consecutively in the list. Eg: [1,2,3,3,3,4,5] -> Returns True since, the element 3 comes three times consecutively in the list
def consec(lst):
    flag=False
    for i in range(len(lst)-2):
        if lst[i]==lst[i+1]==lst[i+2]:
            print(lst[i])
            flag=True
    return flag
print(consec( [1,2,3,3,3,4,5,5,5] ))