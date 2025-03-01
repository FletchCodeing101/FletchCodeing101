def compound_interest():
    print("Compound Interest Calculator")
    
    principal = float(input("Enter the principal amount: "))
    rate = float(input("Enter the annual interest rate (in %): "))
    time = float(input("Enter the time in years: "))
    n = int(input("Enter the number of times interest is compounded per year: "))
    
    amount = principal * (1 + (rate / 100) / n) ** (n * time)
    interest = amount - principal
    
    print(f"Total amount after {time} years: ${amount:.2f}")
    print(f"Compound interest earned: ${interest:.2f}")

compound_interest()
