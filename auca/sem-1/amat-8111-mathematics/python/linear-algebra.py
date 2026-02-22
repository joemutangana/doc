import numpy as np 

A = np.array([1,2,3])
B = np.array([4,5,6])
C = np.array([7,8,9])
D = np.array([[2,3],[4,5]])


matrix_a = np.array([[1,2,3],[4,5,6],[-7,8,9]])
matrix_b = np.array([[7,8],[9,10],[11,12]])

magnitude_a = np.linalg.norm(A)
magnitude_b = np.linalg.norm(B)
dotProduct_ab = A @ B
crossProduct_ab = np.cross(A,B)
crossProduct_ac = np.cross(A,C)
crossProduct_bc = np.cross(B,C)

matrixProduct = np.dot(matrix_a, matrix_b)

area_ab = np.linalg.norm(crossProduct_ab)
area_ac = np.linalg.norm(crossProduct_ac)
area_bc = np.linalg.norm(crossProduct_bc)
surface_area = area_ab+area_ac+area_bc
volume = abs(np.dot(A, np.cross(B,C)))

cos_theta = dotProduct_ab / (magnitude_a * magnitude_b)
angle_radian = np.arccos(cos_theta)
angle_degrees = np.degrees(angle_radian)

det_matrix_a= np.linalg.det(matrix_a)
eigenvalues, eigenvectors = np.linalg.eig(D)




print(f"\nAngle between A and B is {angle_degrees:.1f} degrees.")
print(f"Area of paralleralpiped is {surface_area:.1f}")
print(f"Volume of paralleralpiped is {volume:.1f}")
print(f"Magnitude of A = {magnitude_a:.1f}")
print(f"Magnitude of A = {magnitude_b:.1f}")
print(f"Determinant of Matrix A is {det_matrix_a:.1f}")
print(f"Dot product of A and B = {dotProduct_ab}")
print(f"Croos product of A and B = {crossProduct_ab}\nMatrix Product = \n{matrixProduct}\n")


for i in range(len(eigenvalues)):
    print(f"Eigenvalue {i+1}: {eigenvalues[i]:.2f}")

# Print the eigenvectors with formatting
for i in range(len(eigenvectors[0])):
    print(f"Eigenvector {i+1}: [{eigenvectors[0, i]:.2f}, {eigenvectors[1, i]:.2f}]")
print("\n")