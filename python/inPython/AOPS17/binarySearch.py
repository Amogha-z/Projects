# # 4)Write a program to search an element in a ascending ordered array using binary search.
def binarySearch(lst,v):
    lst=sorted(lst)
    f,l=0,len(lst)-1
    while f<=l:
        m=f+(l-f)//2
        if lst[m]==v:
            return m
        elif lst[m]<v:
            f=m+1
        elif lst[m]>m:
            l=m-1
    else:
        return "element not found"
print(binarySearch([1,2,3,4,5,6,7,8,9],4))



#recursion

def binarySearch(lst,v,f,l):
    lst=sorted(lst)
    m=f+(l-f)//2
    if v>lst[-1] or v<lst[0]:
        return "element not found"
    elif lst[m]==v:
        return m
    elif lst[m]<v:
        return binarySearch(lst,v,m+1,l)
    elif lst[m]>v:
        return binarySearch(lst,v,f,m-1)
    else:
        return "element not found"
print(binarySearch([1,2,3,4,5,6,7,8,9],4,0,len([1,2,3,4,5,6,7,8,9])-1))


