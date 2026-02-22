# Operations on vectors
# Tuples, Lists, and dictionaries

# 1. Tuples
tuple1 = (1, -3.5, 7.8, 10.9)
tuple2 = (-5.9, 10.7, 1.414)
# Concatenation of tuples
print("Concatenated tuples:", tuple1 + tuple2)

# Get the length of tuples
print("Length of tuple1:", len(tuple1))

# Create a tuple from a string
tuesday = tuple("Tuesday")
print("Tuple from string 'Tuesday':", tuesday)

# 2. Lists
list1 = [0.2, 5.6, 100, 5.7]
list2 = [-2.5, 4.78, 5.23, 100]

# Concatenate lists
print("Concatenated lists:", list1 + list2)

# Accessing list elements (by indices)
print("Element at index 3 in list2:", list2[3])

# Sum of 2 vectors stored as lists
list12 = [x + y for x, y in zip(list1, list2)]
print("Sum of vectors list1 and list2:", list12)

# Scalar product - use a loop (multiplying by 10)
list1sc = [x * 10 for x in list1]
print("Scalar product (multiplying list1 by 10):", list1sc)

# Vector product (dot product)
dl1l2 = sum([x * y for x, y in zip(list1, list2)])
print("Dot product of list1 and list2:", dl1l2)

# Vectors
v1 = [0.2, 10.4, 5.6]
v2 = [1.5, 7.5, 5.3]

# Cross product
cv1v2 = [
    v1[1] * v2[2] - v1[2] * v2[1],
    v1[2] * v2[0] - v1[0] * v2[2],
    v1[0] * v2[1] - v1[1] * v2[0],
]
print("Cross product of v1 and v2:", cv1v2)

# Verify cross product (should be close to 0)
print("Verification (dot product of cross product and v1):", sum([x * y for x, y in zip(cv1v2, v1)]))

# ND array using numpy library
import numpy as np

# Defining lists as nd arrays
v1array = np.array([0.2, 10.4, 5.6])
v2array = np.array([1.5, 7.5, 5.3])

print("v1 as numpy array:", v1array)
print("v2 as numpy array:", v2array)

# Cross product using numpy
cpv1v2 = np.cross(v1array, v2array)
print("Cross product using numpy:", cpv1v2)

# Vector addition using numpy
print("Vector addition (v1 + v2) using numpy:", v1array + v2array)

# Angle between vectors
# In Radians
v1v2angle_in_rad = np.arccos(
    v1array @ v2array / ((np.linalg.norm(v1array)) * (np.linalg.norm(v2array)))
)
# In degrees
v1v2angle_in_deg = v1v2angle_in_rad * 180 / np.pi
print("Angle between v1 and v2 (in degrees):", v1v2angle_in_deg)

# Lambda function for a mathematical expression
f = lambda x: np.sqrt(1 + x**2) / np.exp(x)
print("f(0):", f(0))  # Outputs 1
print("f(1):", f(1))
print("f(2):", f(2))

# Lambda function for obtaining the dot product
dotProductLambdaFunction = lambda v1array, v2array: v1array @ v2array
dotl1l2 = dotProductLambdaFunction(v1array, v2array)
print("Dot product using lambda:", dotl1l2)

# Lambda function to find the angle between 2 vectors
angleLambdaFunction = (
    lambda A, B: np.arccos((A @ B) / (np.linalg.norm(A) * np.linalg.norm(B))) * 180 / np.pi
)
anglev1v2 = angleLambdaFunction(v1array, v2array)
print("Angle between v1 and v2 using lambda (in degrees):", anglev1v2)

# Method to calculate angle between two vectors
def angleab(A, B):
    numerator = A @ B
    denominator = np.linalg.norm(A) * np.linalg.norm(B)
    angleRad = np.arccos(numerator / denominator)
    angleDeg = angleRad * 180 / np.pi
    return {'rad': angleRad, 'deg': angleDeg}

# Calculate the angle between v1 and v2 using the method
print("Angle between v1 and v2 using method:", angleab(v1array, v2array))

# Additional Definitions of l1 and l2 for lambda function testing
l1 = np.array([0.2, 5.6, 100])
l2 = np.array([3.5, 2.1, 7.8])

# Dot product and angle between l1 and l2 using lambda functions
dotl1l2 = dotProductLambdaFunction(l1, l2)
print("Dot product of l1 and l2 using lambda:", dotl1l2)

anglel1l2 = angleLambdaFunction(l1, l2)
print("Angle between l1 and l2 using lambda (in degrees):", anglel1l2)
