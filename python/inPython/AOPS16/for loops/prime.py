def is_prime(n):
    if n <= 1:
        return False
    if n <= 3:
        return True
    if n % 2 == 0 or n % 3 == 0:
        return False
    i = 5
    while i * i <= n:
        if n % i == 0 or n % (i + 2) == 0:
            return False
        i += 6
    return True
def rangec(start,end):
    for num in range(start,end+1):
        if is_prime(num):
            print(num)
start=1
end=int(input("enter till which number: "))
print(f"prime numbers between {start} and {end} are: ")
rangec(start,end)