from itertools import permutations
lst=[]
for i in range(3):
    lst.append(int(input('enter a number: ')))
combinations = list(permutations(lst))
combination_numbers = [int(''.join(map(str, i))) for i in combinations]
print(combination_numbers)

