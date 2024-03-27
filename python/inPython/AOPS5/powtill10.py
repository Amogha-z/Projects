#7. Write a program to print the sum of powers of 2 upto 10.
#1+2+4+8+16........+1024 = ?
sum = 0
for i in range(11):
  sum = 2**i
  print(sum)