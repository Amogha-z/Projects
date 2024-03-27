def formation(r,c):
    matrix=[]
    for i in range(r):
        row=[]
        for j in range(c):
            val=int(input(f"enter elements {i+1} {j+1}: "))
            row.append(val)
        matrix.append(row)
    return matrix

def addition(a,b):
    r=len(a)
    c=len(a[0])
    output=[]
    for i in range(r):
        next=[]
        for j in range(c):
            next.append(a[i][j]+b[i][j])
        output.append(next)
    return output

def subtraction(a,b):
    r=len(a)
    c=len(a[0])
    output=[]
    for i in range(r):
        next=[]
        for j in range(c):
            next.append(a[i][j]-b[i][j])
        output.append(next)
    return output

def multiplication(a,b):
    output=[]
    for i in range(len(a)):
        row=[]
        for j in range(len(b[0])):
            val=0
            for k in range(len(a[0])):
                val+=a[i][k]*b[k][j]
            row.append(val)
        output.append(row)
    return output

def printer(a):
  for i in a:
    print(i)

oper=input('what do you want to do with the matrices,(A/S/M)? ' )

if oper.lower() == 's':
  
  rows = int(input("no of rows in first matrix : "))
  col = int(input("no of columns in the matrix: "))

  print("Please enter the values for the first matrix")
  a = formation(rows, col)
  
  print("Now enter the values for the second matrix")
  b = formation(rows, col)

  sum = subtraction(a, b)
  print("The difference of the two matrices is: ")
  printer(sum)

elif oper.lower() == 'a':
  
  rows = int(input("no of rows in first matrix : "))
  col = int(input("no of columns in the matrix: "))

  print("Please enter the values for the first matrix")
  a = formation(rows, col)

  print("Now enter the values for the second matrix")
  b = formation(rows, col)

  sum = addition(a, b)
  print("The sum of the two matrices is: ")
  printer(sum)

elif oper.lower() == 'm':
  
  rows = int(input("no of rows in first matrix : "))
  col = int(input("no of columns in the matrix: "))

  print("Please enter the values for the first matrix")
  a = formation(rows, col)
  rows = col
  col = int(input("no of columns in the second matrix: "))
  
  print("Now enter the values for the second matrix")
  b = formation(rows, col)
  
  product = multiplication(a, b)
  print("The product of the two matrices is: ")
  printer(product)

#Determinant of a 3x3 matrix

mat=formation(3,3)
determinant = mat[0][0]*(mat[1][1]*mat[2][2]-mat[1][2]*mat[2][1])-mat[0][1]*(mat[1][0]*mat[2][2]-mat[1][2]*mat[2][0])+mat[0][2]*(mat[1][0]*mat[2][1]-mat[1][1]*mat[2][0])
print(determinant)