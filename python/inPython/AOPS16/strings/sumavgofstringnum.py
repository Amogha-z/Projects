strings=input('enter a string with numbers: ')
lst=[]
for i in strings.strip():
    if i.isdigit():
        lst.append(int(i))
if len(lst)>0:
    print("sum is {} and average is {}".format(sum(lst),sum(lst)/len(lst)))
else:
    print("no numbers in the list")