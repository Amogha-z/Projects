strings = input("enter a string : ")
sub = input("enter the substring: ")
occur=[]
start=0
if sub.lower() in strings.lower():
    count = strings.lower().count(sub.lower())
while start<len(strings):
    index=strings.find(sub,start)
    if index >= 0:
        occur.append(index)
        start = index + 1
    else:
        break
print("no of times it occurs: ",count)
print(sub,"starts in",*occur,"index")