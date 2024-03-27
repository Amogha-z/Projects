# 5). Write a program to print the following pattern:
# 0
# 1 2
# 2 3 4
# 3 4 5 6
# 4 5 6 7 8

k = 1
for i in range(5):
  for j in range(i, k):
    print(j, " ", end="")
  print()
  k += 2