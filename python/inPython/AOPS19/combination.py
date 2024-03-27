lst1=[]
def combinations(lst,a,b):
    if a==b:
        lst1.append(("".join(map(str,lst))))
    else:
        for i in range(a,b+1):
            lst[a],lst[i]=lst[i],lst[a]
            combinations(lst,a+1,b)
            lst[a],lst[i]=lst[i],lst[a]
    return lst1
lst=list(map(int,input("enter a number: ").split(" ")))
print(combinations(lst,0,len(lst)-1))
