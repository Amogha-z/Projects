strings=input("enter a string : ")
while start<len(strings):
    index=start
    while index<len(strings) and not strings[index].isdigit():
        index+=1
    if index==len(strings):
        break
    end=index
    while end<len(strings) and strings[end].isdigit():
        end+=1
    print(strings[start:end])
    start=end
