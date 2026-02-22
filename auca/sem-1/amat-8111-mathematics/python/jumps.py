
# import numpy as np 
# import itertools

# A = (1,2,3,1)


# jumps = 0
# for i in range(len(A)-1):
    
#     for j in range(i+1, len(A)):
#         if A[i] > A[j]:
#             jumps +=1
#     if jumps % 2 == 0:
#         sign = "+"

#     else:
#         sign = "-"
# print(A, jumps, sign)

# try:
#     n = int(input("Enter a number: "))
#     factorial = 1
#     if n == 0:
#         print(factorial)
#     if n < 0:
#         print("No factorila for number less than zero")
#     if n > 0:

#         while n >=1 :
#             factorial = factorial * n
#             n-=1

#         print(factorial)
# except ValueError:
#     print("Invalid Number.")


def displayFactorial(n):
    factorial = 1
    while n >=1:
        factorial = factorial * n
        n-=1
    return factorial


number = int(input("Enter a number: "))
if number < 0:
    print("No Factorial for negative numbers")
elif number == 0:
    print(displayFactorial(number))
else:
    print(displayFactorial(number))