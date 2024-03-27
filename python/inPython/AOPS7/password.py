#1). Consider, you are writing a password checker program. Your program is supposed to check for a password and say whether it is a strong password or not.
# Conditions to consider for a strong password are:
# The password length must be atleast 6 characters long
# It should contain atleast one number.
# It should contain atleast one lowercase and one uppercase character
# It should contain atleast one valid special character. valid special characters are: !@#$& 

def string(str):
  up=0
  low=0
  num=0
  if len(str)>=6:
    for i in str:
      if i.isalpha():
        if i.isupper():
          up+=1
        if i.islower():
          low+=1
      if i.isnumeric():
        num+=1
      if i in ['!','@','#','$','&'] and up>=1 and low>=1 and num>=1:
        print('it is a strong password')
        break  
    else:
      print('it is a weak password')
  else:
    print('invalid password')
str=input('enter the password: ')
string(str)