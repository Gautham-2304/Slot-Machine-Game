# 🎰 Slot Machine Game

A simple **console-based Slot Machine Game** developed using **Java**. The game allows players to place bets, spin the slot machine, match symbols, and win prizes based on the matching combinations.

This project demonstrates fundamental Java programming concepts such as **arrays, loops, conditional statements, methods, random number generation, user input, and switch statements**.

---

## 📌 Features

* 🎰 Random slot machine spins
* 💰 Starting balance of **100**
* 🎯 User-controlled betting system
* 🔤 Multiple slot symbols
* 🏆 Different prize multipliers for different symbols
* 💵 Automatic balance management
* 🔁 Option to play multiple rounds
* ❌ Input validation for invalid bets
* 🎲 Random symbol generation using Java's `Random` class

---

## 🎮 Available Symbols

The slot machine contains the following symbols:

```text
A, B, C, X, O
```

Each symbol has a different reward multiplier.

---

## 🏆 Winning System

### Three Matching Symbols

If all three symbols match, the player receives the following prize:

| Symbol | Multiplier |
| ------ | ---------- |
| A      | 4× Bet     |
| B      | 6× Bet     |
| C      | 8× Bet     |
| X      | 10× Bet    |
| O      | 20× Bet    |

### Two Matching Symbols

If two adjacent symbols match, the player receives:

| Symbol | Multiplier |
| ------ | ---------- |
| A      | 2× Bet     |
| B      | 3× Bet     |
| C      | 4× Bet     |
| X      | 5× Bet     |
| O      | 10× Bet    |

---

## 🛠️ Technologies Used

* **Java**
* Java `Random` class
* Java `Scanner` class
* Arrays

---

## 📂 Project Structure

```text
Slot-Machine-Game
│
├── SlotMachine.java
└── README.md
```

---

## 🚀 How to Run the Project

### 1. Clone the repository

```bash
git clone https://github.com/Gautham-2304/Slot-Machine-Game.git
```

### 2. Navigate to the project folder

```bash
cd Slot-Machine-Game
```

### 3. Compile the Java program

```bash
javac SlotMachine.java
```

### 4. Run the game

```bash
java SlotMachine
```

---

## 🎯 How to Play

1. Start the game.
2. You will receive an initial balance of **100**.
3. Enter the amount you want to bet.
4. The slot machine will randomly generate three symbols.
5. Match symbols to win prizes.
6. Your balance will be updated after every round.
7. Choose whether you want to play again.
8. The game ends when you choose to stop or when your balance reaches zero.

---

## 💻 Concepts Demonstrated

This project demonstrates the following Java concepts:

* Variables and data types
* Arrays
* Loops
* Conditional statements
* Methods
* Switch statements
* Random number generation
* User input using `Scanner`
* Basic game logic

---

## 🔮 Future Improvements

Some possible improvements for the project include:

* Adding better input validation
* Creating a graphical user interface (GUI)
* Adding animations
* Adding more winning combinations
* Implementing a leaderboard
* Saving player scores
* Adding sound effects
* Improving the overall game experience

---

## 👨‍💻 Author

**Gautham**

GitHub: [Gautham-2304](https://github.com/Gautham-2304)

---

⭐ If you like this project, feel free to give the repository a star!
