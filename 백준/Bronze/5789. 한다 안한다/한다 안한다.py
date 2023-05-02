n = int(input())

for _ in range(n):
    numbers = input()
    idx = len(numbers) // 2 - 1
    if numbers[idx] == numbers[idx + 1]:
        print('Do-it')
    else:
        print('Do-it-Not')