def multiply(lst):
    if len(lst)==1:
        return lst[0]
    else:
        return multiply(lst[1:])*lst[0]
print(multiply([2,3,4]))