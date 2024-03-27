# 5). Your task in this kata is to implement a function that calculates the sum of the integers inside a string. For example, in the string "The30quick20brown10f0x1203jumps914ov3r1349the102l4zy dog", the sum of the integers is 3635.
def sumOfDigitsFully(first):
    final=[]
    current=""
    for i in range(len(first)):
        if first[i-1]!="-":
            if first[i].isdigit():
                current+=first[i]
            elif current:
                final.append(int(current))
                current=""
    if current:
        final.append(int(current))
    return sum(final)
print(sumOfDigitsFully("The30quick20brown10f0x1203jumps914ov3r1349the102l4zy dog"))
