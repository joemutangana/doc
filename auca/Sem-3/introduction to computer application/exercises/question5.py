arr=[]
for i in range(6):
    value=int(input("Enter the value to store: "))
    arr.append(value)
countEven = 0
countOdd = 0

for element in arr:
    if element % 2 == 0:
        countEven +=1
    else:
        countOdd +=1
print(f"In the values you stored, Even values are: {countEven}, Odd values are {countOdd}")