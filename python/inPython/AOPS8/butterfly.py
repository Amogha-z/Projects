#1). Consider, you have an interesting game involving butterflies. 
#You have many butterflies which come in 4 different colors, namely, Yellow, Red, Blue and Green. 
#The butterflies are placed in a straight line and their positions are marked using a String like, "YRB_R_Y".
# The above string represents the position of the butterflies using the color that they are (Y for Yellow, R for Red, B for Blue and G for Green).
#A butterfly is said to be happy, when she has a same color butterfly adjacent to her (it can be either in the left side/right side). 
#Given a string representing the positions of the butterflies and an index representing a butterfly, find out, whether the butterfly in that position is happy or not.

def happy(str,i):
  if i in range(len(str)):
    if str[i]==str[i+1] or str[i]==str[i-1]:
      print('YES')
  else:
    print('NO')
string=input('input a string: ')
str=string.capitalize()
i=int(input('enter an index: '))
happy(str,i)

