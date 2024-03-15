def is_palindrome_string(s):
    return s == s[::-1]

def is_palindrome_number(n):
    return str(n) == str(n)[::-1]

def main():
    print("Choose an option:")
    print("1. Check if a string is palindrome")
    print("2. Check if a number is palindrome")

    choice = input("Enter your choice: ")

    if choice == '1':
        string = input("Enter a string: ")
        if is_palindrome_string(string):
            print("The string is a palindrome.")
        else:
            print("The string is not a palindrome.")
    elif choice == '2':
        number = input("Enter a number: ")
        if number.isdigit():
            number = int(number)
            if is_palindrome_number(number):
                print("The number is a palindrome.")
            else:
                print("The number is not a palindrome.")
        else:
            print("Invalid input. Please enter a valid number.")
    else:
        print("Invalid choice.")

if __name__ == "__main__":
    main()
