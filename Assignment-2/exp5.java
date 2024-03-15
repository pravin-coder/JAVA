def decimal_to_binary(decimal):
    binary = bin(decimal).replace("0b", "")
    return binary

def decimal_to_octal(decimal):
    octal = oct(decimal).replace("0o", "")
    return octal

def main():
    decimal = int(input("Enter a decimal number: "))

    binary = decimal_to_binary(decimal)
    print("Binary equivalent:", binary)

    octal = decimal_to_octal(decimal)
    print("Octal equivalent:", octal)

if __name__ == "__main__":
    main()
