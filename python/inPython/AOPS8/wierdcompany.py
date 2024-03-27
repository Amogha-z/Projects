#2). Consider, you are a book publishing company. You publish books on Maths Problems.
# You have "c" chapters in each book and every chapter might contain "n" number of problems . 
# The way you print in a book is, for every page, you have a fixed number of problems "k" to be printed. 
# Every page should contain exactly "k" number of problems, unless, you are printing the last page of a chapter and you have lesser than "k" problems to be printed on that page.
#  Each chapter should start in a fresh page. Can you find out how many pages would be required for printing the problems in the book?

c = int(input("Enter no. of chapters : "))
k = int(input("No. of problems in a page : "))
chapters = []
pages=0
for i in range(c):
  chapters.append(int(input("Enter no. problems in chapter ("+str(i+1)+") : ")))
for i in chapters:
  temp = i/k
  if temp-int(temp)==0:
    pages+=temp
  else:
    pages+=int(temp+1)
print(int(pages))
