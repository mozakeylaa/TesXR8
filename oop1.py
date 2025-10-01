# Name : Moza Keyla
# Class : XI RPL 2


# Easy Level
# Test case 1: Even or Odd (1 line function)
def check_even_odd(n): 
    return "The number is Even" if n % 2 == 0 else "The number is Odd"
    print(check_even_odd(4))   # Expected: The number is Even
    print(check_even_odd(7))   # Expected: The number is Odd

# Test case 2: Positive, Negative, Zero
def check_number(n): 
    return "The number is Positive" if n > 0 else "The number is Negative" if n < 0 else "The number is Zero"
    print(check_number(10))    # Expected: The number is Positive
    print(check_number(-5))    # Expected: The number is Negative
    print(check_number(0))     # Expected: The number is Zero


# Medium Level
# Test case 3: Check Anagram
def is_anagram(str1, str2): 
    return sorted(str1) == sorted(str2)
    print(is_anagram("listen", "silent"))  # True
    print(is_anagram("hello", "world"))    # False


# Test case 4: Factorial
def factorial(n): 
    return 1 if n == 0 else n * factorial(n - 1)
    print(factorial(5))   # 120
    print(factorial(0))   # 1


# Hard Level
# Test case 5: Palindrome (1 line)
def is_palindrome(s):
    return s == s[::-1]
    print(is_palindrome("racecar"))  # True
    print(is_palindrome("python"))   # False
    print(is_palindrome("habibah"))  # True

# Test case 6: Armstrong Number
def is_armstrong(n):
    return n == sum(int(d) ** len(str(n)) for d in str(n))
    print(is_armstrong(153))  # True
    print(is_armstrong(370))  # True
    print(is_armstrong(123))  # False


# Expert Level
# Test case 7: Bank Account Class
class BankAccount:
    def __init__(self, name):
        self.name = name
        self.balance = 0

    def deposit(self, amount):
        self.balance += amount
        return f"Deposited {amount}. New balance: {self.balance}"

    def withdraw(self, amount):
        if 0 < amount <= self.balance:
            self.balance -= amount
            return f"Withdrew {amount}. New balance: {self.balance}"
        else:
            return "Invalid withdrawal amount or insufficient funds"

# Test case 8: Student Class
class Student:
    def __init__(self, name):
        self.name = name
        self.grades = []

    def add_grade(self, grade):
        self.grades.append(grade)
        return f"Grade {grade} added."

    def get_average(self):
        if not self.grades:
            return "No grades available."
        avg = sum(self.grades) / len(self.grades)
        return f"Average grade: {avg:.1f}"



# Testing Expert
account = BankAccount("Name")
print(account.deposit(1000))  
print(account.withdraw(500))  
print(account.withdraw(600))  

student = Student("Moza")
print(student.add_grade(90))  
print(student.add_grade(80)) 
print(student.add_grade(70))  
print(student.get_average()) 
