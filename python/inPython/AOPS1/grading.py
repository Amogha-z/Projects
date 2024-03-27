prct=int(input('enter the percentage secured: '))
if prct<50:
    print('the grade is F')
elif prct>=51 and prct<=60:
    print('the grade is D')
elif prct>=61 and prct<=75:
    print('the grade is C')
elif prct>=76 and prct<=90:
    print('the grade is B')
elif prct>90:
    print('the grade is A')
