# 8). Create a function that checks if the first argument n is divisible by all other arguments (return true if no other arguments)
def isDivisible(tup):
    if len(tup)==1:
        return True
    for i in range(len(tup)-1):
        if tup[0]%tup[i+1]==0:
            return True
        else:
            return False
print(isDivisible((100,5,4,2)))