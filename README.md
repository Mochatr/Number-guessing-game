# Number Guessing Game

This is a simple command-line interface (CLI) based number guessing game where the computer randomly selects a number, and the player has to guess it within a limited number of attempts.

## Game Description

In this game, the computer selects a random number between 1 and 100. The player's goal is to guess this number correctly within the given number of attempts. The game offers three difficulty levels, each with a different number of allowed guesses.

## Features

- Random number generation between 1 and 100
- Three difficulty levels: Easy, Medium, and Hard
- Limited number of guesses based on the chosen difficulty
- Feedback on each guess (higher or lower)
- Win/lose conditions

## How to Play

1. Run the game.
2. Read the welcome message and game rules.
3. Choose a difficulty level:
   - Easy: 10 chances
   - Medium: 5 chances
   - Hard: 3 chances
4. Enter your guess when prompted.
5. Receive feedback on your guess.
6. Continue guessing until you either:
   - Guess the correct number and win
   - Run out of chances and lose

## Sample Game Output

```
Welcome to the Number Guessing Game!
I'm thinking of a number between 1 and 100.
You have 5 chances to guess the correct number.

Please select the difficulty level:
1. Easy (10 chances)
2. Medium (5 chances)
3. Hard (3 chances)

Enter your choice: 2

Great! You have selected the Medium difficulty level.
Let's start the game!

Enter your guess: 50
Incorrect! The number is less than 50.

Enter your guess: 25
Incorrect! The number is greater than 25.

Enter your guess: 35
Incorrect! The number is less than 35.

Enter your guess: 30
Congratulations! You guessed the correct number in 4 attempts.
