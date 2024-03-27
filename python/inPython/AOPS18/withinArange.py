# 3). Consider you have a list of items. Check whether the items present in the list are within a range, say, eg: if the items in the list are between 8 to 15 in a list like lst = [8,10,12,11,9,15]
def finder(lst,f,l):
    sorted_lst=sorted(lst)
    for i in range(len(sorted_lst)):
        if sorted_lst[i]>=f and sorted_lst[i+1]<=l:
            return True
    return False
print(finder([8,10,12,11,9,15],8,15))