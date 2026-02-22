
screte = 1234
count = 3
while count > 0:
    password = int(input("Enter your password: "))
    if password == screte:
        print("Success.")
        break
    else:
        count -=1
        if count > 0:
            print(f"Password incorrect. You have {count} attempts remaining.")
        else:
            print("Time's Up.")
            break