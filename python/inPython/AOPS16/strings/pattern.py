def stars(n):
    num=n*(n+1)//2
    print("{} th/nd/rd triangular number is {}".format(n,num))
    for i in range(n, 0, -1):
        print('*' * i)
n = int(input("which triangular number: "))
stars(n)
