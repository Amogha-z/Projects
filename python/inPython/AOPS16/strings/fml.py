initial,final= input('enter a string: '),''
if len(initial)%2==0:
    m=initial[len(initial)//2-1:(len(initial)//2)+1]
    print('the length of the string is even. so it has two middle chars so,',m)
else:
    m=initial[len(initial)//2]
    print(m)
f,l=initial[0],initial[-1]
final+=f+m+l
print(final)