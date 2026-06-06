class Calculator:
    def add(self, a, b):
        print(f"{a} + {b} = {a+b}")
        
    def diff(self, a, b):
        print(f"{a} - {b} = {a-b}")

c1=Calculator()

num1 = int(input("Enter the first number: "))
num2 = int(input("Enter the second number: "))

c1.add(num1,num2)
c1.diff(num1,num2)