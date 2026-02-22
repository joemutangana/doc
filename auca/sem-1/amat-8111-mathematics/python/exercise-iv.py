

import itertools
import math 
import os

try:
    n = int(input("\n\nEnter a number to get permutations: "))

    if n <= 0:
        print(f"\nThere is No Permutation for n <= 0,  {n}.")

    if n <= 7 and n > 0:   
        numbers = list(range(1, n + 1))
        permutations = list(itertools.permutations(numbers))
        print(f"\nHere is {math.factorial(n)} Permutations.\n")
        
        original_order = numbers  
        
        for perm in permutations:
            jumps = 0    
            for i in range(n):
                if perm[i] != original_order[i]:
                    jumps += 1
            
            
            if jumps % 2 == 0:
                jump_sign = "+"
            else:
                jump_sign = "-"
            
            print(f"{perm} | Jumps: {jumps} | Sign of Jumps: {jump_sign}")
        
    if n > 7:
        print("\nThe Number You Enter is Very Large. Try n>0 , n<=7 Or You wish to continue with that one Y/N\n")
        

except ValueError:
    _ = os.system("clear")
    print("\nInvalid Input.\n")


   
