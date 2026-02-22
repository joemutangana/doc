
#INTRODUCTION TO MATRIX ALGEBRA USING PYTHON 

#N-d ARRAY USING NUMPY


import numpy as np 
A = np.array([[0,1,-2.3,0.1],[1.3,4,-0.1,1],[4.1,-1,0,1.7]])
shapeA = A.shape
transpose = A.T 

reshapeA = A.reshape(6,2)

transposeShape = A.T.shape 

transposeReshape = A.T.reshape(2,6)


#slicing  element and Column 



#SLICING COLUMNS

slicedColumn = A[:,2:4]
slicedRow = A[1:4,:]



#SPECIAL TYPES OF MATRICES
#IDENTITY AND ZEROS MATRICES

I2 = np.identity(2)
I5 = np.identity(5)
Z2 = np.zeros([5,5])

Ran = np.random.random([3,3])

#RANDOM NUM BERS BETWEEN 0 AND 10
decimalRandom = 0+10*Ran

#RANDOM  NUMBERS BETWEEN 50 AND 100
decimalRandom1 = 50+(100-50)*Ran


#ADDITION OF MATRIX
B = np.array([[1,-2,6],[0,8,-5],[3,1,2]])
C = np.array([[1,2,3],[-5,10,-6],[3.2,1,-8]])

addBC = B+C

#MULTPLICATION

multBC = B@C 

# scala multplication

theta = 0.5 

tethaC = C*theta



print(f"{A[2,2]}\n{slicedColumn}\n{slicedRow}\n{I2}\n{I5}\n{Z2}\n{Ran}\n{decimalRandom}\n{decimalRandom1}\n{addBC}\n{multBC}\n{tethaC }")


