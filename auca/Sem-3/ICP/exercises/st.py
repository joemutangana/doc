

marks=[20,30,40,10,7]

lenght = len(marks)

search = int(input("Enter marks you want to find: "))

if search in marks:
    for i in range(lenght):
        if search == marks[i]:
            print(f"{search} found at position '{i}'")
else:
    print(f"'{search}' Not found.")
