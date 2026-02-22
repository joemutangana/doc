import itertools
import math 
import os


try:

    n = int(input("\n\nEnter a number to get permutations: "))



    if n <= 0:
        print(f"\nThere is No Permutation for n <= 0,  {n}.")

    if n <= 7 and n >0:   

        numbers = list(range(1, n + 1))
        permutations = list(itertools.permutations(numbers))
        print(f"\nHere is {math.factorial(n)} Permutations.\n")
        
        for perm in permutations:
            print(perm)
        
    if n > 7:

        print("\nThe Number You Enter is Very Large. Try n>0 , n<=6\n")

except ValueError:
    _= os.system("clear")
    print("\nInvalid Input.\n")


