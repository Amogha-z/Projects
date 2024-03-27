def countnum(num):
    result = 0
    count = 1
    before = num % 10
    num //= 10
    while num > 0:
        current = num % 10
        if current == before:
            count += 1
        else:
            result = result * 10 + count
            # print(result)
            result = result * 10 + before
            # print(result)
            count = 1
            before = current
        num //= 10
    result = result * 10 + count
    result = result * 10 + before
    return result
num = (int(input("Enter a number: ")))
num=str(num)
num=num[::-1]
num=int(num)
output = countnum(num)
print(output)