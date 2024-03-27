str = input("Enter a list: ")
lst = []
for i in str.split(","):
  lst.append(int(i))
lst.sort(reverse=True)
n=len(lst)
r = n // 2
if n % 2 != 0:
  r = r + 1
else:
  r = r
c = 1
np = 0
sp=n-2
for i in range(r - 1):
  print(c * " ", lst[np], (sp-1) * " ", lst[np + 1])
  np = np + 2
  sp = sp - 2
  c = c + 1
if n%2==0:
  for i in range(n - 2, n):
    print((c+1)*" ", lst[i])
else:
  print((c+1)*" ", lst[n-1])