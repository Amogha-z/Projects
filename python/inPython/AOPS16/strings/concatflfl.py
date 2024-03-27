s1=input('enter first string: ')
s2=input('enter second string: ')
s3=''
s2=s2[::-1]
index=0
while index < max(len(s1),len(s2)):
    if index < len(s1):
        s3+=s1[index]
    if index < len(s2):
        s3+=s2[index]
    index+=1
print(s3)

