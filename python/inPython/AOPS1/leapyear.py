def yr(year):
    if year % 4==0:
        if year % 100==0:
            if year % 400==0:
                return True
            else:
                return False
        else:
            return True
    else:
        return False
yes=int(input('enter the year to be checked: '))
yr(yes)
if yr(yes):
    print('the year', yes , 'is a leap year')
else:
    print('the year', yes, 'is not a leap year')