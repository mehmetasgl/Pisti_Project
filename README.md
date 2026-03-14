# Pisti_Project

🃏 SE 115 Pisti Game Project

📌 Overview

This project is a card game simulation developed to practice core programming concepts such as object-oriented design, file handling, arrays, game logic, and error handling.

The program simulates a playable card game where cards are created, shuffled, distributed to players, and scored. It also includes a computer player with basic decision logic and a persistent high-score system.

The project was designed to reinforce multiple programming topics studied during the course.

⚙️ Features
1. Deck Creation

The program can create a full deck of cards that will be used during the game.

2. Deck Shuffling

The deck can be randomly shuffled to ensure fairness before gameplay begins.

3. Deck Cutting

The deck can be cut into two parts and rearranged, simulating a real card cut.

4. Card Distribution

Cards can be moved from the deck to players and the table (board) during the game.

5. Score Calculation

The program calculates player scores automatically based on the cards collected during gameplay.

6. High Score System

The game stores a Top 10 High Score List in a file containing:

Player names

Their scores

This allows scores to persist between different game sessions.

🤖 Computer Player Logic

The computer player follows a simple but smart strategy:

If there is a card on the table with the same rank, it plays that card first.

If no matching card exists:

If there are cards on the table, it plays a Jack.

If neither condition is met, the computer discards cards sequentially.

This creates a more strategic and competitive gameplay experience.

🧠 Design Approach
Object-Oriented Thinking

Cards and game components were designed using objects to make the system easier to understand and manage.

Custom ArrayList

Since using Java's ArrayList was restricted, a custom array-based list structure was implemented to:

Store the deck

Manage card operations

Reset the deck when necessary

This simplified deck manipulation while respecting project constraints.

⚠️ Challenges Faced

During development several challenges were encountered:

Implementing game logic and managing card states

Handling null cases when cards were removed or reset

Writing file operations for storing high scores

Managing try-catch blocks for error handling

Solving these challenges helped deepen understanding of the programming topics covered in class.

🎯 Learning Outcomes

This project helped strengthen knowledge in:

Object-Oriented Programming (OOP)

Arrays and custom data structures

File reading and writing

Exception handling

Game logic implementation

Debugging complex logic

Overall, the project provided hands-on experience with nearly all topics studied during the course.

🚀 Possible Future Improvements

Add a graphical user interface (GUI)

Improve the AI strategy

Allow multiplayer gameplay

Add game statistics and analytics

👨‍💻 Author

Student Project – PISTI GAME PROJECT
