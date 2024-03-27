def func(lst):
    if len(lst)==0:
        return "0 elements in the list. Cant be executed"
    else:
        for i in lst:
                if i>=0 and i<150:
                    if i%5==0:
                        return i                 
