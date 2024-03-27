# 1) Print a list in reverse order.
#loop

# lstreversed=[]
# def reversal(lst):
#     num=len(lst)-1
#     for i in range(num+1):
#         lstreversed.append(lst[num])
#         num=num-1
#     return lstreversed
# print(reversal([1,2,3,4,5,6]))

def reversal(lst):
    lstrev=[]
    for i in range(len(lst)-1,-1,-1):
        lstrev.append(lst[i])
    return lstrev
# print(reversal([1,2,3,4,5,6]))

#recursion

def reversalREC(lst,first,last):
    if first>last:
        return lst
    else:
        temp=lst[first]
        lst[first]=lst[last]
        lst[last]=temp
        return reversalREC(lst,first+1,last-1)
# print(reversalREC([1,2,3,4,5],0,len([1,2,3,4,5])-1))

