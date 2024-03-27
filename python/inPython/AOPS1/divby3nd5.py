intt=int(input('enter the number: '))
if intt%3==0:
    print('the number is divisible by 3')
    if intt%5==0:
        print('the number is divisible by 5')
        if intt%3==0 and intt%5==0:
            print('the number is divisible both by 3 and 5')
    else:
        print('the number is not divisible by 5')
else:
    print('the number is not divisible by 3 but is divisible by 5')