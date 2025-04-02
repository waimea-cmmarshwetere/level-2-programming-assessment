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
 * PROJECT NOTES HERE
 * =====================================================================
 */

const val NUMBOXES = 20
const val EMPTY = " "

fun main() {
    println()
    println("OLD GOLD!")
    println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------")
    println(" Welcome to Old Gold this is a two-player game, played on a one-dimensional grid with coins, where the aim is to win by being the player who removes the gold coin.")
    println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------")
    println()

    println("Enter Player 1 Name: ")
    val player1 = readln()
    println("Welcome Player 1: $player1")

    println("")

    println("Enter Player 2 Name: ")
    val player2 = readln()
    println("Welcome Player 2: $player2")

    println("")

    println("Player 1: $player1")
    println("Player 2: $player2")

    println("")
    println("Welcome $player1 and $player2 to Old Gold!")
    println("")

    val boxes = setupPlayBoxes()

    val coins = setupPlayBoxes()

    coins.add("Coin")
    coins.add("Coin")
    coins.add("Coin")
    coins.add("Coin")
    coins.add("Coin")
    coins.add("Gold Coin")


    showCoinBoxes(boxes)
    println()





}
fun setupPlayBoxes(): MutableList<String> {
    val playBox = mutableListOf<String>()
    for (i in 1..NUMBOXES - 6) playBox.add(EMPTY)
    return playBox

}
fun listAllPlayBoxes(coinBoxList: List<String>) {
    println(" ")
    for (i in 0..coinBoxList.size -1) {
        println("-  ${i + 1}: ${coinBoxList[i]}")
    }
}
fun showCoinBoxes(coinBoxList: List<String>) {
    println("+----".repeat(20)+ "+")
    for (i in 0..coinBoxList.size -1) {
        print("| ${i + 1} ".padEnd(5))
    }
    println("|")
    println("+----".repeat(20)+ "+")
    for (i in 0..coinBoxList.size -1) {
        print("| ${coinBoxList[i]} ".padEnd(5))
    }
    println("|")
    println("+----".repeat(20)+ "+")

}




