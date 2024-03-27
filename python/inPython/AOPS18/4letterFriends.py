# 9). Make a program that filters a list of strings and returns a list with only your friends name in it.If a name has exactly 4 letters in it, you can be sure that it has to be a friend of yours! Otherwise, you can be sure he's not...Ex: Input = ["Ryan", "Kieran", "Jason", "Yous"], Output = ["Ryan", "Yous"]
def friends(lst):
    lst2=[]
    for i in lst:
        if len(i)==4:
            lst2.append(i)
    return lst2
print(friends( ["Ryan", "Kieran", "Jason", "Yous"]))