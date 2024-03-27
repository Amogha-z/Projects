mylist = {"january": 1,"february": 2,"march": 3,"april": 4,"may": 5,"june": 6,"july": 7,"august": 8,"september": 9,"october": 10,"november": 11,"december": 12}
urlist = input('enter the months as per your wish separated by commas: ')
list=urlist.split(',')
sorted_months = sorted(list, key=lambda mh: mylist[mh])
print(sorted_months)
