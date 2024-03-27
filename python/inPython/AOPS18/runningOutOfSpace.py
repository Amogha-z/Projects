# 7). Kevin is noticing his space run out! Write a function that removes the spaces from the values and returns an array showing the space decreasing.For example, running this function on the array ['i', 'have','no','space'] would produce ['i','ihave','ihaveno','ihavenospace']
def outOfSpace(lst):
    for i in range(len(lst)):
        if i!=0:
            lst[i]=lst[i-1]+lst[i]
    return lst
print(outOfSpace(["i","am","dead","inside!"]))