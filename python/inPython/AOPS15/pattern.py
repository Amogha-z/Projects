#1)
#  *****
#  *   *
#  *   *
#  *   *
#  *****

n = int(input("Enter a number: "))
for i in range(n):
  if i==0 or i==n-1:
    print("*"*n)
  else:
    print("*"+(n-2)*" "+"*")
print()

#2)
#   *
#   **
#   ***
#   ****
#   *****

n = int(input("Enter a number: "))
for i in range(1,n+1):
  # for j in range(1,i+1):
  #   print("*",end='')
  # print()
  print("*"*i)
print()

#3)
# *****
#  ****
#   ***
#    **
#     *

n = int(input("Enter a number: "))
for i in range(n,0,-1):
  print((n-i)*" " + i*"*")
print()

#4)
#that inverted triangle

n = int(input("Enter a number: "))
for i in range(1,n+1):
    for j in range(1,2*n):
        if (i==1) or i==j or i+j==2*n:
            print("*",end="")
        else:
            print(" ",end="")
    print()

#5)
#* * * *
# * * *
#  * *
#   *
#  * *
# * * *
#* * * *

n = int(input("Enter a number: "))
ch="* "
for i in range(n):
  print(" "*i + ch*(n-i))
for j in range(2,n+1):
  print(" "*(n-j)+ch*j)


# for i in range (n):
#     for j in range(i):
#         print(" ",end='')
#     for j in range(n-i):
#         print("*",end=" ")
#     print()