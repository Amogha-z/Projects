lst = [[], [], []]
logged_in_user = None 

def user():
    global lst
    username = input('Enter your name: ')
    pin = int(input('Enter 4 digit pin: '))
    deposit = 0
    lst[0].append(username)
    lst[1].append(pin)
    lst[2].append(deposit)
    print(lst)
    print('Account created')

def login():
    global logged_in_user
    username = input('Enter your name: ')
    pin = int(input('Enter your 4 digit pin: '))
    for i in range(len(lst[0])):
        if lst[0][i] == username and lst[1][i] == pin:
            logged_in_user = username
            print('Login successful')
            return True
    print('Wrong username or pin')
    return False

def Deposit():
    global logged_in_user
    if logged_in_user:
        for i in range(len(lst[0])):
            if lst[0][i] == logged_in_user:
                deposit = int(input('Enter the amount of money you would like to deposit: '))
                lst[2][i] += deposit
                print("Deposit successful")
                print(lst)
                return
    else:
        print("Please log in first.")

def Withdraw():
    global logged_in_user
    if logged_in_user:
        for i in range(len(lst[0])):
            if lst[0][i] == logged_in_user:
                val = int(input('Enter the amount you want to withdraw: '))
                if lst[2][i] >= val:
                    lst[2][i] -= val
                    print('Successfully withdrawn')
                else:
                    print('Not enough balance')
                return
    else:
        print("Please log in first.")
def ChangePin():
    global logged_in_user
    if logged_in_user:
        for i in range(len(lst[0])):
            if lst[0][i] == logged_in_user:
                upin = int(input('Enter 4 digit pin: '))
                lst[1][i] = upin
                print('PIN changed successfully')
                return
    else:
        print("Please log in first.")
def Balance():
    global logged_in_user
    if logged_in_user:
        for i in range(len(lst[0])):
            if lst[0][i] == logged_in_user:
                print(f"Account balance: {lst[2][i]}")
                return
    else:
        print("Please log in first.")
def atm():
    while True:
        global logged_in_user
        if not logged_in_user:
            print('1. Create account\n2. Login\n3. Exit')
            ch = int(input('Enter your choice: '))
            if ch == 1:
                user()
            elif ch == 2:
                if login():
                    continue
            elif ch == 3:
                print('Thank you!')
                break
            else:
                print('Invalid choice, please try again.')
        else:
            print('Choose an action:\n1. Deposit money\n2. Withdraw money\n3. Change pin\n4. Check Balance\n5. Logout')
            choice = int(input('Enter the number: '))
            if choice == 1:
                Deposit()
            elif choice == 2:
                Withdraw()
            elif choice == 3:
                ChangePin()
            elif choice == 4:
                Balance()
            elif choice == 5:
                logged_in_user = None
                print('Logged out successfully.')
            else:
                print('Invalid choice, please try again.')
atm()

