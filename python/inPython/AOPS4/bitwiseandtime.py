from datetime import datetime as dt
##or
def orl(a, b):
  if a or b == 1:
    print(1)
  else:
    print(0)
orl(0, 1)

##and
def andl(a, b):
  if a and b == 1:
    print(1)
  else:
    print(0)
andl(0, 0)

##Xor
def Xorl(a, b):
  if a != b:
    print(1)
  else:
    print(0)
Xorl(1, 1)


def evenodd(n):
  if n % 2 == 0:
    print(0)
  else:
    print(1)
evenodd(int(input("enter a number:")))


def swapnum(a, b):
  if a != b:
    a = a + b
    b = a - b
    a = a - b
  print("After Swapping: a =", a, " b=", b)
x=int(input('enter a number: '))
y=int(input('enter another number: '))
swapnum(x,y)


def dates():
  print(dt.now())
dates()


def todayd():
  print(dt.today())
todayd()


def timestamp_to_date(timestamp):
  date_object = dt.fromtimestamp(timestamp)
  formatted_date = date_object.strftime("%Y-%m-%d")
  return formatted_date
timestamp = input('enter a valid timestamp: ')
date = timestamp_to_date(timestamp)
print(date)


def print_date(date_string):
  date_object = dt.strptime(date_string, "%Y-%m-%d")
  year = date_object.year
  month = date_object.month
  day = date_object.day
  print("Year:", year)
  print("Month:", month)
  print("Day:", day)
day = input('enter date in the form "year-month-date": ')
print_date(day)


def print_time(time_string):
  time_object = dt.strptime(time_string, "%H:%M:%S")
  hours = time_object.hour
  minutes = time_object.minute
  seconds = time_object.second
  print("Hours:", hours)
  print("Minutes:", minutes)
  print("Seconds:", seconds)
time = input('enter time in the format "h:m:s" ')
print_time(time)


def print_difference():
  today = dt.now()
  yesterday = dt.now()
  print(today - yesterday)
print_difference()