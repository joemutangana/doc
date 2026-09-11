arr=[]
for i in range(5):
    number = int(input(f"Enter number {i+1}: "))
    arr.append(number)


max=arr[0]
for each in arr:
    if each > max:
        max = each
        
print (f"Maxmum value is {max} ")
    
