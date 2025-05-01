import java.util.Collections.shuffle

/**
 * =====================================================================
 * Programming Project for NCEA Level 2, Standard 91896
 * ---------------------------------------------------------------------
 * Project Name:   Old Gold
 * Project Author: Caius Marsh-Wetere
 * GitHub Repo:    https://github.com/waimea-cmmarshwetere/level-2-programming-assessment
 * ---------------------------------------------------------------------
 * Notes:
 *
 * =====================================================================
 */

const val NUMBOXES = 20
const val EMPTY = " "

fun main() {
    println("=========================================================================================================================================================================")
    println("OLD GOLD!")
    println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------")
    println(" Welcome to Old Gold this is a two-player game, played on a one-dimensional grid with coins, where the aim is to win by being the player who removes the gold coin.")
    println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------")
    println("=========================================================================================================================================================================")
    println("RULES!")
    println("Players take turns.")
    println("A turn can be either: Removing a coin from the left square (if there is one) or")
    println("sliding any coin left.")
    println("Coins can slide any number of empty squares.")
    println("Coins cannot jump on or over another coin.")
    println("=========================================================================================================================================================================")


    println("Enter Player 1 Name: ")
    val player1 = readln()
    println("Welcome Player 1: $player1")

    println()

    println("Enter Player 2 Name: ")
    val player2 = readln()
    println("Welcome Player 2: $player2")

    println()

    println("Player 1: $player1")
    println("Player 2: $player2")

    println()
    println("Welcome $player1 and $player2 to Old Gold!")
    println()


    val coins = setupPlayBoxes()

    coins.add("C")
    coins.add("C")
    coins.add("C")
    coins.add("C")
    coins.add("C")
    coins.add("G")


    listAllCoins(coins)
    coins.shuffle()

    showCoinBoxes(coins)
    println()

    setupPlayBoxes()
    println()


        var currentPlayer = player1
    while (true) {
        println("$currentPlayer's turn. Please enter the index of the coin you want to move (1-${coins.size}):")
        val coinIndex = readln().toIntOrNull()?.minus(1) ?: continue

        if (coinIndex < 0 || coinIndex >= coins.size || coins[coinIndex] == EMPTY) {
            println("Invalid coin selection. Please try again.")
            continue
        }

        println("Please enter the new position (1-${coins.size}):")
        val newPosition = readln().toIntOrNull()?.minus(1) ?: continue

        if (newPosition < 0 || newPosition >= coins.size || coins[newPosition] != EMPTY) {
            println("Invalid move. The target position is either out of bounds or not empty. Please try again.")
            continue
        }

        // Check for win condition (if the gold coin is removed)


        val square1 = (0)
        if (coins[square1] == "G") {
            println("$currentPlayer has removed the gold coin! $currentPlayer wins!")
            break
        }
        val square2 = (0)
        if (coins[square2] == "C") {
            println("$currentPlayer has removed a silver coin!")

        }

        val

        // Switch players
        currentPlayer = if (currentPlayer == player1) player2 else player1
    }
}




// Sets up boxes
fun setupPlayBoxes(): MutableList<String> {
    val playBox = mutableListOf<String>()
    for (i in 1..NUMBOXES - 6) playBox.add(EMPTY)
    return playBox


}
// Shows the coins randomly in the boxes
fun showCoinBoxes(coinBoxList: List<String>) {

        println("GAME BOARD!")
        println("-----".repeat(20) + "+")
        for (i in 0..coinBoxList.size - 1) {
            print("| ${i + 1} ".padEnd(5))
        }
        println("|")
        println("+----".repeat(20) + "+")
        for (i in 0..coinBoxList.size - 1) {
            print("| ${coinBoxList[i]} ".padEnd(5))
        }
        println("|")
        println("-----".repeat(20) + "+")


//Lists all coins
}
fun listAllCoins(coinBoxList: List<String>) {
    println("COINS")
    for (coins in coinBoxList) {
        if (coins == EMPTY) continue
        println("-$coins")
    }

}














