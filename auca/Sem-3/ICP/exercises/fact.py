def factorial(n):
    fact=1
    for i in range(1, n+1):
        fact *=i
    return fact

number = int(input("Enter a number to factorize: "))
if number >=0:
    print (f"Factorial of {number} is {factorial(number)}")
else:
    print("Doesn't exist")