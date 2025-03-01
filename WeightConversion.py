def weight_conversion():
    print("Weight Conversion Program")
    print("1. Pounds to Kilograms")
    print("2. Kilograms to Pounds")
    
    choice = input("Enter choice (1/2): ")
    
    if choice == '1':
        pounds = float(input("Enter weight in pounds: "))
        kilograms = pounds * 0.453592
        print(f"{pounds} lbs is equal to {kilograms:.2f} kg")
    elif choice == '2':
        kilograms = float(input("Enter weight in kilograms: "))
        pounds = kilograms * 2.20462
        print(f"{kilograms} kg is equal to {pounds:.2f} lbs")
    else:
        print("Invalid input. Please select a valid option.")


weight_conversion()
