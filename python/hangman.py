import random
def choose():
    words = ["apple", "banana", "cherry", "grape", "orange", "watermelon", "kiwi", "strawberry","blueberry","muskmelon","avocado","guava","mango","papaya","pineapple","jackfruit","custard apple"]
    return random.choice(words)
def display_word(word, guess):
    show = ""
    for i in word:
        if i in guess:
            show += i
        else:
            show += "_"
    return show
def hangman():
    to_guess = choose()
    guess = []
    attempts = 3
    print("Welcome to Hangman!")
    while True:
        print("\nCurrent Word: " + display_word(to_guess, guess))
        urguess = input("Guess a letter: ").lower()
        if urguess in guess:
            print("You already guessed that letter.")
            continue
        guess.append(urguess)
        if urguess in to_guess:
            print("Correct!")
        else:
            print("Incorrect!")
            attempts -= 1
        if attempts == 0:
            print("\nYou lost! The word was:", to_guess)
            break
        if "_" not in display_word(to_guess, guess):
            print("\nCongratulations! You guessed the word:", to_guess)
            break
hangman()



