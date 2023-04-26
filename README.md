# Minimax || Tara Salli

## Background and Motivation

### What is Nim?
Nim is a two-player game in which each player takes turns removing pieces from a certain number of piles. Each player must remove at least on piece; however, all pieces removed must be from the same pile. Nim is a zero-sum game, meaning that there will always be a winner and a loser. In this case, the player who is forced to take the last piece loses the game.

### What is Minimax?
Minimax is a "backtracking" (searching every possible combination) decision-making algorithm used to find the optimal move for a player to make in order to minimize a possible loss, or maximize chances of winning. Notably, the algorithm assumes that the player's opponent will also play optimally, therefore it uses the opponent's choices to calcualte the most optimal move for the player to make. Minimax gets its name from the fact that the two players are called "maximizer" and "minimizer". The "maximizer" tries to get the highest score possible, while the "minimizer" tries to do the opposite and get the lowest score possible. The recursive element of the minimax algorithm lies in the repetitive nature of backtracking. The algorithm continuously calls itself until it reaches a base case of 0, where all possible combinations have been exhausted, and the game comes to an end. Nim is a great test case for the minimax algorithm due to the simple nature of the game. Because it is both a two-player and zero-sum game, in which players alternate taking turns in a fixed pattern (if it is my turn now, it is player Y's turn next), the minimax algorithm can easily be implemented into the structure of the game, without much need for additional details or algorithms (for ex: if a player's turn is skipped, or more pieces are added to the existing amount).

## Usage

## Future Directions