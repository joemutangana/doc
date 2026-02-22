import numpy as np 

M = np.array([
    [3, 0, 0, 1],
    [6, -1, -8, 0],
    [3, -1, -12, -1],
    [-6, 0, -4, 2]
])

det_M = np.linalg.det(M)

is_basis = det_M != 0

print(f"\nDeterminant of matrix M: {det_M:.2f}\nDo they have a basis? {is_basis}.\nIs the set a subspace of M_2x2? {is_basis}.\n")