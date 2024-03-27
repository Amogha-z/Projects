#2). Write a program that will keep accepting input from user, until the entered input value is -1.
#  (You will need to use while loops for this. Check out about while loops and write the code appropriately.)

while True:
  a = int(input('ente a number: '))
  if a == -1:
    print('over')
    break
  else:
    continue