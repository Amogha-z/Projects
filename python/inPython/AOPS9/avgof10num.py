#1). Write a program that accepts 10 numbers as Input.
# You can either get it as comma separated values and split them to form an array or you can use 10 variables.
# Either way is fine. Once you get the input, find out the average of those 10 numbers, round it to 2 decimal places and print the result.

lst = []
for i in range(10):
  lst.append(int(input('enter a number:')))
  a = sum(lst) / 10
print(round(a, 2))