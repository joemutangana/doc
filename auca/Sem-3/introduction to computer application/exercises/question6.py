numbers = []

for i in range(10):
    number = int(input(f"Enter number {i+1}: "))
    numbers.append(number)

print("|--------|--------|")
print("| Number | Square |")
print("|--------|--------|")

for element in numbers:
    sqr = element * element
    print(f"| {element:<6} | {sqr:<6} |")
    print("|--------|--------|")
