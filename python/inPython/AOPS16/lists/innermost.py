def inner_list(lst):
    for i in range(len(lst)):
        if isinstance(lst[i], list):
            return inner_list(lst[i])
    else:
        return lst 
def foist(lst1,lst2):
    inner_list(lst1).append(lst2)
    return lst1
lst1=[1,2,3,[2,3,[3,4,[5,6,[7,8,[2]]]]]]
lst2=5
print(foist(lst1,lst2))