#--------------------------------------------------------------------
#Question-1
#Taking input from user

print("Write a Python program to find average of three numbers entered by the user. ")
print("")

a = int(input("enter three numbders whose avg is to be calculated: "))
b = int(input())
c = int(input())

sum = a + b + c      

avg = sum/3

print("Result: ",avg)
print("")

#---------------------------------------------------------------------
#Question-2

print("Write a python program to compute a person's income tax.")
print("")

#Taking input
income = float(input("Enter your gross income: "))
dep = int(input("No. of Dependents: "))          # dep = Dependents


ded = 10000                                      # ded = Deduction
dedPerDep = 3000                                 # dedPerDep = Deduction per dependent
charge = 1/5                                     # Charge 20%

taxable = income - ded - (dedPerDep * dep)

tax = float()                                    # Converting to float
tax = taxable * charge

print("Total income tax you have to pay: ",tax)   
print("")                                    

#------------------------------------------------------------------------
#Question-3

print("Write a python program to store different data type values into a list.")
print("")

student = ['SID', 'Name', 'Gender', 'Course', 'CGPA']
student1 = [21105011, "Vivek Jaiswal", "M", "ECE", 8.0]
student2 = [21105012, "Rahul", "M", "ECE", 7.5]
student3 = [21105013, "Neha", "F", "ECE", 8.5]


print(student)
print(student1)
print(student2)
print(student3)
print("")
#------------------------------------------------------------------------
#Question-4

print("Write a python program to enter marks of 5 students into a list and display them in sorted manner.")
print("")

print("Marks of the student")

marks = [67,91,88,32,77,95,91]

print("Before sorted: " ,marks)

marks.sort()

print("After sorting: ", marks)
print("")

#------------------------------------------------------------------------
#Question-5

print("Write a Python program to print a specified list after removing 4th element.")
print("")


#Part-1
color = ["Red", "Green", "White", "Black", "Pink", "Yellow"]

print(color)

print("After removing 4th element")

del color[3]

print(color)

print("Remove ‘Black’ and ‘Pink’ from the list and replace them with ‘Purple’. Do that in one line code.")
print("")

#Part-2
color = ["Red", "Green", "White", "Black", "Pink", "Yellow"]

print(color)
print("After replacing Black and Pink")

color[3:5] = ['purple']

print(color)
