# Blackjack

A Java project with:
- a blackjack simulation engine (human and strategy-based players)
- custom blackjack strategy implementations
- 8-puzzle experimentation classes

## Project Structure

- `/home/runner/work/blackjack/blackjack/src/BlackjackDealer.java` – runs blackjack games and computes win rate.
- `/home/runner/work/blackjack/blackjack/src/BlackjackHand.java` – blackjack hand logic (value + soft hand detection).
- `/home/runner/work/blackjack/blackjack/src/BlackjackPlayer.java` – player interface-style base class.
- `/home/runner/work/blackjack/blackjack/src/HumanBlackjackPlayer.java` – interactive terminal player.
- `/home/runner/work/blackjack/blackjack/src/ComputerBlackjackPlayer.java` – strategy-driven player.
- `/home/runner/work/blackjack/blackjack/src/BlackjackStrategy.java` – strategy base class.
- `/home/runner/work/blackjack/blackjack/src/MySimpleStrategy.java` and `/home/runner/work/blackjack/blackjack/src/ZamanRaiyanStrategy.java` – sample strategies.
- `/home/runner/work/blackjack/blackjack/src/Driver2.java` – interactive blackjack entry point.
- `/home/runner/work/blackjack/blackjack/src/Driver3.java` – large blackjack simulation entry point.
- `/home/runner/work/blackjack/blackjack/src/NumberPuzzle*.java` and `/home/runner/work/blackjack/blackjack/src/Driver.java` – 8-puzzle exploration/test code.

## Requirements

- Java 8+ (or any modern JDK)

## Compile

From the repository root:

```bash
javac src/*.java
```

## Run

### Interactive blackjack

```bash
java -cp src Driver2
```

### Strategy simulation (1,000,000 games by default)

```bash
java -cp src Driver3
```

### Number puzzle experimentation

```bash
java -cp src Driver
```